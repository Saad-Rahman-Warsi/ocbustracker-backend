package com.example.communicatewithoc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Trip {
    @JsonProperty("Longitude")
    public String Longitude;
    @JsonProperty("Latitude")
    public String Latitude;
    @JsonProperty("GPSSpeed")
    public String GPSSpeed;
    @JsonProperty("TripDestination")
    public String TripDestination;
    @JsonProperty("TripStartTime")
    public String TripStartTime;
    @JsonProperty("AdjustedScheduleTime")
    public String AdjustedScheduleTime;
    @JsonProperty("AdjustmentAge")
    public String AdjustmentAge;
    @JsonProperty("LastTripOfSchedule")
    public boolean LastTripOfSchedule;
    @JsonProperty("BusType")
    public String BusType;
}
