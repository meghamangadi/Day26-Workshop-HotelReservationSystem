package com.bridgelabz.hotelreservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystem {

	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
	Hotel hotel;

	public Hotel addHotel(String hotelName , double weekdayRateRegular, double weekendRateRegular) {

		hotel = new Hotel();
		hotel.setHotelName(hotelName); 
		hotel.setWeekdayRegularCustomerCost(weekdayRateRegular);
		hotel.setWeekendRegularCustomerCost(weekendRateRegular);
		hotelList.add(hotel);
		return hotel;
	}

	public HotelResponse findcheapestHotel(String date1,String date2 ) {
		HotelResponse hotelResponse=new HotelResponse();
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy");
		LocalDate startDate = LocalDate.parse(date1, formatter);
		LocalDate endDate = LocalDate.parse(date2, formatter);
		final long days = ChronoUnit.DAYS.between(startDate, endDate);

		String hotelName = " ";
		double min = 0;
		for (Hotel hotel : hotelList) {

			double totalRate = (double) days * (hotel.getWeekdayRegularCustomerCost()+ hotel.getWeekendRegularCustomerCost());
			if (min == 0 || totalRate < min) {

				min = totalRate;
				hotelName = hotel.getHotelName();
			}
		}
		hotelResponse.setHotelName(hotelName);
		hotelResponse.setCheapestCost(min);
		System.out.print("Cheapest Hotel : " +hotelName + " ,Total Rate : " + min);
		return hotelResponse;
	}

	public ArrayList<Hotel> getHotelList() {
		return hotelList;
	}

	public void setHotelList(ArrayList<Hotel> hotelList) {
		this.hotelList = hotelList;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

}
