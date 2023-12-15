package com.example.timeofbus.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DirTime {
    private String direction;
    private int time;
    private int route;
}
