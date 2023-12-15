package com.example.communicatewithoc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetNextTripsForStopResult {
    @JsonProperty("StopNo")
    public String StopNo;
    @JsonProperty("StopLabel")
    public String StopLabel;
    @JsonProperty("Error")
    public String Error;
    @JsonProperty("Route")
    public Route Route;
}
