package com.example.communicatewithoc.service;

import com.example.communicatewithoc.VO.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;


@Service
@Slf4j
public class BusTimeService {
    @Autowired
    private RestTemplate restTemplate;

    public ResponseForGetRequest findBusTime(int stopId, int routeId) {
        ResponseForGetRequest rep=new ResponseForGetRequest();
        String url="https://api.octranspo1.com/v2.0/GetNextTripsForStop?appID=b4330cee&apiKey=eb760671b2a30622d4d45a400e7bed83";
        url=url+"&stopNo="+stopId+"&routeNo="+routeId+"&format=json";
        System.out.println("url is "+url);
        //OCTranspoResponse ocTranspoResponse=restTemplate.getForObject(url,OCTranspoResponse.class);
        String ocTranspo=restTemplate.getForObject(url,String.class);
        JSONObject jsonObject;
        Gson gson = new GsonBuilder().create();
        OCTranspoResponse ocTranspoResponse=new OCTranspoResponse();
        try {
             jsonObject = new JSONObject(ocTranspo);
             ocTranspoResponse = gson.fromJson(jsonObject.toString(), OCTranspoResponse.class);
             System.out.println(ocTranspoResponse);
        }
        catch(Exception e)
        {
            System.out.println("sorry cannot parse string");
        }

                //System.out.println(ocTranspoResponse);
        ArrayList<RouteDirection> routeDirection =ocTranspoResponse.getGetNextTripsForStopResult().getRoute().getRouteDirection();
        ArrayList<Trip> tripof0=routeDirection.get(0).getTrips().getTrip();
        ArrayList<Trip> tripof1=routeDirection.get(1).getTrips().getTrip();
        DirTime dirTime0=new DirTime();
        dirTime0.setDirection(routeDirection.get(0).getRouteLabel());
        dirTime0.setTime(Integer.parseInt(tripof0.get(0).getAdjustedScheduleTime()));
        DirTime dirTime1=new DirTime();
        dirTime1.setDirection(routeDirection.get(1).getRouteLabel());
        dirTime1.setTime(Integer.parseInt(tripof1.get(0).getAdjustedScheduleTime()));
        DirTime[] dirTimes=new DirTime[2];
        dirTimes[0]=dirTime0;
        dirTimes[1]=dirTime1;
        rep.setDirtime(dirTimes);
        rep.setRoute(routeId);
        rep.setStation(stopId);
        rep.setStationlabel(ocTranspoResponse.getGetNextTripsForStopResult().StopLabel);
        /*DirTime[] di={new DirTime("airport",15),new DirTime("hurdman",5)};
        rep=new ResponseForGetRequest(stopId,routeId,di);*/
        return rep;
    }
}
