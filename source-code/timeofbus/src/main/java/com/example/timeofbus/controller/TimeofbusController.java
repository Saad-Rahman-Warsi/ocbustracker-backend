package com.example.timeofbus.controller;

import com.example.timeofbus.VO.ResponseTemplateVO;
import com.example.timeofbus.entity.StationRoute;
import com.example.timeofbus.service.TimeofbusService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tibua")
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
public class TimeofbusController {
    @Autowired
    private TimeofbusService busTimeService;


    @GetMapping("/")
    public ResponseTemplateVO findDepartmentById()
    {
        log.info("inside finddepartmentbyid method of departmentcontroller");
        return busTimeService.findBusTime();
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody StationRoute stationRoute)
    {
        log.info("inside saveuser of usercontroller");
        busTimeService.saveStationRoute(stationRoute);
    }
}
