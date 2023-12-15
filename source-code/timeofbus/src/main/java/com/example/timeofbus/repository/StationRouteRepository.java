package com.example.timeofbus.repository;


import com.example.timeofbus.entity.StationRoute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRouteRepository extends JpaRepository<StationRoute,Integer> {

}
