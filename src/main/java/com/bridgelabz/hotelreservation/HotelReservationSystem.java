package com.bridgelabz.hotelreservation;

 
import java.util.ArrayList;
 

public class HotelReservationSystem { 
	
	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
	Hotel hotel;
	
	

	public Hotel addHotel(String hotelName,int rating, double weekdayRateRegular, double weekendRateRegular)
	{
		
		hotel = new Hotel();
		hotel.setHotelName(hotelName);
		hotel.setRating(rating);
		hotel.setWeekdayRegularCustomerCost(weekdayRateRegular);		 
		hotel.setWeekendRegularCustomerCost(weekendRateRegular); 
		hotelList.add(hotel); 
		return hotel;
	}
	
	
}
