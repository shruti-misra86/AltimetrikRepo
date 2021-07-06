package com.shruti.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shruti.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
