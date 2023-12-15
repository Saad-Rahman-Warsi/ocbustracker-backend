package com.example.communicatewithoc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Route {
    @JsonProperty("RouteDirection")
    public ArrayList<RouteDirection> RouteDirection;
}
