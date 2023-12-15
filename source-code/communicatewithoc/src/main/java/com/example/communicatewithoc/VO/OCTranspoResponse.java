package com.example.communicatewithoc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OCTranspoResponse {
    @JsonProperty("GetNextTripsForStopResult")
    public GetNextTripsForStopResult GetNextTripsForStopResult;
}
