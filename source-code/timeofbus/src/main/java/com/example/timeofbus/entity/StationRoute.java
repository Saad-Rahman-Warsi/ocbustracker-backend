package com.example.timeofbus.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name="stationroute")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StationRoute {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int station;
    private int route;
}
