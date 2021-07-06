package com.shruti.flightreservation.services;

import com.shruti.flightreservation.dto.ReservationRequest;
import com.shruti.flightreservation.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);

}
