package com.bridgelabz.hotelreservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {

	@Test
	public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShoulReturnTrue() {

		HotelReservationSystem hotelReservationService = new HotelReservationSystem();
		Hotel isValidHotel1 = hotelReservationService.addHotel("Lakewood", 110, 90,3,80,80);
		Hotel hotelLakewood = new Hotel("Lakewood", 3, 110, 90);
		Assert.assertSame(hotelLakewood.getHotelName(), isValidHotel1.getHotelName());

	}

	@Test
	public void givenHotelDetails_WhenValuesEnteredAreInCorrect_ShoulReturnFalse() {
		HotelReservationSystem hotelReservationService = new HotelReservationSystem();
		Hotel isValidHotel1 = hotelReservationService.addHotel("Lakewood", 110, 90,3,80,80);
		Hotel hotelLakewood = new Hotel("Rridgewood", 4, 220, 150);
		Assert.assertNotSame(hotelLakewood.getHotelName(), isValidHotel1.getHotelName());

	}

	@Test
	public void givenDate_findCheapestHotel_ShoulReturnTrue() {
		HotelReservationSystem hotelReservationService = new HotelReservationSystem();
		hotelReservationService.addHotel("Lakewood", 110, 90,3,80,80);
		hotelReservationService.addHotel("Rridgewood", 220, 150,4,50,50);
		HotelResponse cheapset = hotelReservationService.findcheapestHotel("10Sep2020", "11Sep2020");
		Assert.assertSame("Rridgewood", cheapset.getHotelName());

	}

	@Test
	public void givenDate_findCheapestHotel_ShoulReturnFlase() {
		HotelReservationSystem hotelReservationService = new HotelReservationSystem();
		hotelReservationService.addHotel("Lakewood", 110, 90,3,80,80);
		hotelReservationService.addHotel("Rridgewood", 220, 150,4,50,50);
		HotelResponse cheapset = hotelReservationService.findcheapestHotel("10Sep2020", "11Sep2020");
		Assert.assertNotSame("Bridgewood", cheapset.getHotelName());

	}

}
