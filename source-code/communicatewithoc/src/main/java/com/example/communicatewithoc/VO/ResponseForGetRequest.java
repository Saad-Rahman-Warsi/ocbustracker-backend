package com.example.communicatewithoc.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseForGetRequest {
    private String stationlabel;
    private int station;
    private int route;
    private DirTime[] dirtime;
}
