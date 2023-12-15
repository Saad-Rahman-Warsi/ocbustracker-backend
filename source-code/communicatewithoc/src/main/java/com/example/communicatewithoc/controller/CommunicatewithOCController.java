package com.example.communicatewithoc.controller;

import com.example.communicatewithoc.VO.ResponseForGetRequest;
import com.example.communicatewithoc.service.BusTimeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/commoc")
@Slf4j
public class CommunicatewithOCController {
    @Autowired
    private BusTimeService busTimeService;


    @GetMapping("/{stop}/{route}")
    public ResponseForGetRequest findDepartmentById(@PathVariable("stop") int stopId,@PathVariable("route") int routeId)
    {
        log.info("inside finddepartmentbyid method of departmentcontroller");
        return busTimeService.findBusTime(stopId,routeId);
    }
}
