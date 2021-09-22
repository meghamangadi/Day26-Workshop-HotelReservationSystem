package com.bridgelabz.hotelreservation;

import java.util.HashMap;
import java.util.Map;

public class HotelReservationSystem {
	
	Map<String, Hotel> hotelMap = new HashMap<String, Hotel>();
	Hotel hotel;
	
	

	public boolean addHotel(String hotelName,int rating, double weekdayRateRegular, double weekendRateRegular)
	{
		hotel = new Hotel();
		hotel.setHotelName(hotelName);
		hotel.setRating(rating);
		hotel.setWeekdayRegularCustomerCost(weekdayRateRegular);		 
		hotel.setWeekendRegularCustomerCost(weekendRateRegular); 
		hotelMap.put(hotelName, hotel);
		return true;
	}
	
}
