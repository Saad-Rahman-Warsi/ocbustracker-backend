package com.example.timeofbus.service;

import com.example.timeofbus.VO.CommunicateWithOCResponse;
import com.example.timeofbus.VO.DirTime;
import com.example.timeofbus.VO.ResponseTemplateVO;
import com.example.timeofbus.VO.StationTimes;
import com.example.timeofbus.entity.StationRoute;
import com.example.timeofbus.repository.StationRouteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

import static java.lang.System.in;

@Service
@Slf4j
public class TimeofbusService {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StationRouteRepository repository;

    public void saveStationRoute(StationRoute stationRoute) {
        repository.save(stationRoute);
    }

    public ResponseTemplateVO findBusTime() {
        ResponseTemplateVO rep=new ResponseTemplateVO();
        //CommunicateWithOCResponse[] comm=new CommunicateWithOCResponse[3];
        String urldefault="http://apigateway-service:9391/commoc/";
        List<StationRoute> routes=repository.findAll(Sort.by("station"));
        int nosta=routes.size();
        List<CommunicateWithOCResponse> answer= new ArrayList<CommunicateWithOCResponse>();
        List<StationTimes> statimes=new ArrayList<>() ;
        int station=-1;
        int noloop=0;
        String stationlabel="XXXXXX";
        StationTimes stationTimes=new StationTimes();
        List<DirTime> dirTimeList=new ArrayList<>();
        for (StationRoute i: routes)
        {

            String url=urldefault+"/"+i.getStation()+"/"+i.getRoute();
            if (station!=i.getStation())
            {
                if (noloop!=0)
                {
                    statimes.add(new StationTimes(stationlabel,station,dirTimeList));
                }
                CommunicateWithOCResponse ocTranspoResponse = restTemplate.getForObject(url, CommunicateWithOCResponse.class);
                station= ocTranspoResponse.getStation();
                stationlabel=ocTranspoResponse.getStationlabel();
                dirTimeList=new ArrayList<>();
                for (DirTime diri:ocTranspoResponse.getDirtime())
                {
                    diri.setRoute(ocTranspoResponse.getRoute());
                    dirTimeList.add(diri);
                }
                if (noloop==nosta-1)
                {
                    statimes.add(new StationTimes(stationlabel,station,dirTimeList));
                }

            }
            else if( noloop!=nosta-1)
            {
                CommunicateWithOCResponse ocTranspoResponse = restTemplate.getForObject(url, CommunicateWithOCResponse.class);
                for (DirTime diri:ocTranspoResponse.getDirtime())
                {
                    diri.setRoute(ocTranspoResponse.getRoute());
                    dirTimeList.add(diri);
                }
            }
            else
            {
                statimes.add(new StationTimes(stationlabel,station,dirTimeList));
            }
            noloop++;
        }
        rep.setTimes(statimes);

        return rep;
    }
}
