package com.tcs.ilp;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketMain {

	public static void main(String[] args) {

		int option, category;
		boolean repeat = true;
		
		Scanner scan = new Scanner (System.in);
		
		ArrayList<Grossary> grossaryList = new ArrayList<Grossary>();
		ArrayList<Household> householdList = new ArrayList<Household>();
		ArrayList<Stationay> stationayList = new ArrayList<Stationay>();
		
		do {
			System.out.println("********Welcome to the SuperMarket Mega Soriana********");
			System.out.println("1) Add products");
			System.out.println("2) See maximum product price per category");
			System.out.println("3) See all the products");
			System.out.println("4) Exit");
			System.out.println("Enter the number of your choice: ");
			option = scan.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("****Add product****");
					System.out.println("Choose the category");
					System.out.println("1) Grossary");
					System.out.println("2) Household");
					System.out.println("3) Stationay");
					System.out.println("Enter the number of your choice: ");
					category = scan.nextInt();
					scan.nextLine();
					System.out.println("Enter name: ");
					String name = scan.nextLine();
					System.out.println("Enter quantity: ");
					double quantity = scan.nextDouble();
					System.out.println("Enter price: ");
					double price = scan.nextDouble();
					
					switch(category) {
					 	case 1:
					 		Grossary g = new Grossary(name, quantity, price);
				            grossaryList.add(g);
				            break;
					 	case 2:
					 		Household h = new Household(name, quantity, price);
				            householdList.add(h);
				            break;
					 	case 3:
					 		Stationay s = new Stationay(name, quantity, price);
					 		stationayList.add(s);
				            break;
				        default:
				        	System.out.println("That category doesn´t exists");
					}
					
					break;
				case 2:
					//See the max price per category
				case 3:
					System.out.println("****Products form Grossary****");
					for(Grossary g : grossaryList) {
						System.out.println(g.toString());
					}
					System.out.println("****Products form Household****");
					for(Household h : householdList) {
						System.out.println(h.toString());
					}
					System.out.println("****Products form Stationay****");
					for(Stationay s : stationayList) {
						System.out.println(s.toString());
					}
				case 4:
					repeat = false;
			}
		}while(repeat);
		
	}

}
