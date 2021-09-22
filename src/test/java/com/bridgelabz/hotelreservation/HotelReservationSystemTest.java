package com.bridgelabz.hotelreservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {

	@Test
	public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShoulReturnTrue()
	{ 
		 
		HotelReservationSystem hotelReservationService = new HotelReservationSystem();
		Hotel isValidHotel1 = hotelReservationService.addHotel("Lakewood", 3, 110, 90);
		Hotel hotelLakewood=new Hotel("Lakewood", 3, 110, 90);
		Assert.assertSame(hotelLakewood.getHotelName(), isValidHotel1.getHotelName());
	 
	}
	
	@Test
	public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShoulReturnFalse()
	{ 
		HotelReservationSystem hotelReservationService = new HotelReservationSystem();
		Hotel isValidHotel1 = hotelReservationService.addHotel("Lakewood", 3, 110, 90);
		Hotel hotelLakewood=new Hotel("Rridgewood", 4, 220, 150);
		Assert.assertNotSame(hotelLakewood.getHotelName(), isValidHotel1.getHotelName()); 
		 
	}
}
