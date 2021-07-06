package com.shruti.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shruti.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
