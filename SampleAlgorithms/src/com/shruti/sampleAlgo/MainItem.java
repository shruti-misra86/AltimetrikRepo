package com.shruti.sampleAlgo;

import java.util.Scanner;

public class MainItem {

	public static void main(String[] args) {
		// ItemType i = new ItemType();

		/*
		 * System.out.println("Enter the Item Type Name "); i.setName(s.nextLine());
		 * System.out.println("Enter the Deposit Amount ");
		 * i.setDeposit(s.nextDouble());
		 * System.out.println("Enter the Cost per day of the Item Type ");
		 * i.setCostPerDay(s.nextDouble());
		 * 
		 * i.display();
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name of Stall : ");
		String name = s.nextLine();
		System.out.println("Enter details :");
		String detail = s.nextLine();
		StallCategory sc = new StallCategory();
		sc.setName(name);
		sc.setDetail(detail);
		sc.display();
		StallCategory sc1 = new StallCategory(name, detail);
		sc1.display();
		s.close();

	}

}
