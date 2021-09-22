package com.bridgelabz.hotelreservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {

	@Test
	public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShoulReturnTrue()
	{
		HotelReservationSystem hotelReservationService = new HotelReservationSystem();
		boolean isValidHotel1 = hotelReservationService.addHotel("Lakewood", 3, 110, 90);
		Assert.assertTrue(isValidHotel1);
		boolean isValidHotel2 = hotelReservationService.addHotel("Bridgewood", 4, 160, 60);
		Assert.assertTrue(isValidHotel2);
		boolean isValidHotel3 = hotelReservationService.addHotel("Ridgewood", 5, 220, 150);
		Assert.assertTrue(isValidHotel3);
	}
}
