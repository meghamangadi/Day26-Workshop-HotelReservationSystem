package com.bridgelabz.hotelreservation;

public class HotelResponse {

	String hotelName;
	 double cheapestCost;
	 
	 public HotelResponse() {}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getCheapestCost() {
		return cheapestCost;
	}

	public void setCheapestCost(double cheapestCost) {
		this.cheapestCost = cheapestCost;
	}
}
