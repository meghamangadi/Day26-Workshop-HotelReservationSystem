package com.bridgelabz.hotelreservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystem {

	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
	Hotel hotel;

	public Hotel addHotel(String hotelName, int rating, double weekdayRateRegular, double weekendRateRegular) {

		hotel = new Hotel();
		hotel.setHotelName(hotelName);
		hotel.setRating(rating);
		hotel.setWeekdayRegularCustomerCost(weekdayRateRegular);
		hotel.setWeekendRegularCustomerCost(weekendRateRegular);
		hotelList.add(hotel);
		return hotel;
	}

	public void findcheapestHotel() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter start date : ");
		String date1 = sc.nextLine();
		System.out.print("Enter end date : ");
		String date2 = sc.nextLine();
		// define date format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy");
		// convert given format date into local date
		LocalDate startDate = LocalDate.parse(date1, formatter);
		LocalDate endDate = LocalDate.parse(date2, formatter);
		// find number of days
		final long days = ChronoUnit.DAYS.between(startDate, endDate);

		String hotelName = " ";
		double min = 0;
		for (Hotel hotel : hotelList) {

			double totalRate = (double) days * hotel.getWeekdayRegularCustomerCost();
			if (min == 0 || totalRate < min) {

				min = totalRate;
				hotelName = hotel.getHotelName();
			}
		}
		System.out.print(hotelName + " , Total Rate : " + min);
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
