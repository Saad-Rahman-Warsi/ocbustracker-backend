package com.example.communicatewithoc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouteDirection {
    @JsonProperty("RouteNo")
    public String RouteNo;
    @JsonProperty("RouteLabel")
    public String RouteLabel;
    @JsonProperty("Direction")
    public String Direction;
    @JsonProperty("Error")
    public String Error;
    @JsonProperty("RequestProcessingTime")
    public String RequestProcessingTime;
    @JsonProperty("Trips")
    public Trips Trips;
}
