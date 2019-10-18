package com.store;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int option = 0;
		Sales_Module sm = new Sales_Module();
		do {
			System.out.println("--------Stock Manager--------");
			System.out.println("Menu");
			System.out.println("1.Add a New Entry in Stock");
			System.out.println("2.Print all the Products available");
			System.out.println("3.Search for product in Stock");
			System.out.println("4.Update Details in stock");
			System.out.println("--------Customer Management--------");
			System.out.println("Menu");
			System.out.println("5. Generate Bill");
			System.out.println("6. Total Cost");
			System.out.print("\nOption > ");
			option = a.nextInt();
			switch (option) {
			case 1:
				sm.add();
				break;
				
			case 2:
				System.out.println("All the Available products are:");
				for (Stock_Module i:sm.a) {
					System.out.println(i);
				}

				break;
			case 3:
				sm.SearchProduct();
				break;
				
			case 4:
				sm.UpdateTheList();	
				break;
				
			case 5:
				sm.Bill();
				break;
				
//			case 6:	
//				int sum = cost *quantity;
//				System.out.println("sum" +sum);
			default:
				break;
			}

		} while (option != 7);

	}

}

