package com.ashish.flightcheckin.integration;

import com.ashish.flightcheckin.integration.dto.Reservation;
import com.ashish.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
