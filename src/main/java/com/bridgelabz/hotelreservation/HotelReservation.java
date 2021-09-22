package com.bridgelabz.hotelreservation;

import java.util.Scanner;
 

public class HotelReservation {
	public static void main(String[] args) {

		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		 

	
		Scanner sc = new Scanner(System.in);
		int continueFlag;
		do {
			System.out.print("\n----------------------------------");
			System.out.print("\n  Hotel Reservation System  ");
			System.out.print("\n-----------------------------------");
			System.out.print("\n\n1 : Add Hotel details \n2 : Search cheapest Hotel");
			System.out.print("\nChoose your option : ");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				 
				System.out.println("Enter the name of Hotel : ");
				String name = sc.next();				 
				System.out.println("Enter regular customer rate weekday : ");
				double weekday=sc.nextDouble();
				System.out.println("Enter regular customer rate weekend : ");
				double weekend=sc.nextDouble();
				System.out.println("Enter Hotel rating : ");				 
				int  Rating = sc.nextInt();
				hotelReservationSystem.addHotel(name, Rating, weekday, weekend);
				break;
			case 2:
				hotelReservationSystem.findcheapestHotel();
				break;
			default:
				System.out.print("\nInvalid option");
			}
			System.out.print("\nDo you want to continue? Press 1 : ");
			continueFlag = sc.nextInt();

		} while (continueFlag == 1);

		System.out.print("\nThank you for using Hotel Reservation System !!");
		sc.close();
	}
}
