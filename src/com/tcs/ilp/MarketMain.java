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
			System.out.println("4) See total value per category");
			System.out.println("5) Exit");
			System.out.println("Enter the number of your choice: ");
			option = scan.nextInt();
			System.out.println("\n");
			
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
					int quantity = scan.nextInt();
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
					System.out.println("\n");
					break;
				case 2:
					//See the max price per category
				case 3:
					System.out.println("****Products from Grossary****");
					for(Grossary g : grossaryList) {
						System.out.println(g.toString());
					}
					
					System.out.println("\n****Products from Household****");
					for(Household h : householdList) {
						System.out.println(h.toString());
					}
					System.out.println("\n****Products from Stationay****");
					for(Stationay s : stationayList) {
						System.out.println(s.toString());
					}
					System.out.println("\n");
					break;
				case 4:
					double totalValueGrossary = 0, totalValueHousehold = 0, totalValueStationay = 0;
					//Grossary Value
					System.out.println("****Total values per category****");
					for(Grossary g : grossaryList) {
						totalValueGrossary += g.getPrice();
					}
					System.out.println("Total value from Grossary: $" + totalValueGrossary);
					//Household Value
					for(Household h : householdList) {
						totalValueHousehold += h.getPrice();
					}
					System.out.println("Total value from Household: $" + totalValueHousehold);
					//Stationay Value
					for(Stationay s : stationayList) {
						totalValueStationay += s.getPrice();
					}
					System.out.println("Total value form Stationay: $" + totalValueStationay);
					System.out.println("\n");
					break;
				case 5:
					System.out.println("Thanks for visit the SuperMarket Mega Soriana");
					repeat = false;
					break;
				default:
					System.out.println("That option doesn´t exists");
					System.out.println("\n");
			}
		}while(repeat);
		 scan.close();
	}

}
