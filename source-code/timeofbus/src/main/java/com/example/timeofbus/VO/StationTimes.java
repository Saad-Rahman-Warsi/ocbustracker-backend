package com.example.timeofbus.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StationTimes {
    private String stationLabel;
    private int station;
    private List<DirTime> times;
}
