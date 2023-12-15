package com.example.timeofbus.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommunicateWithOCResponse {
    private String stationlabel;
    private int station;
    private int route;
    private DirTime[] dirtime;
}
