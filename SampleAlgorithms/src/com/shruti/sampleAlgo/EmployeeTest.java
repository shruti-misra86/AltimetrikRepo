package com.shruti.sampleAlgo;

import java.util.Scanner;

public class EmployeeTest {

	private static String empName;
	private static String dept;
	private static int age;
	private static double salary;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter emp name :");
		EmployeeTest.empName = s.nextLine();
		System.out.println("enter emp dept :");
		EmployeeTest.dept = s.nextLine();
		System.out.println("enter emp age :");
		EmployeeTest.age = s.nextInt();
		System.out.println("enter emp salary :");
		EmployeeTest.salary = s.nextInt();

		System.out.println("Employee name is : " + EmployeeTest.empName);
		System.out.println("Employee department is : " + EmployeeTest.dept);
		System.out.println("Employee age is : " + EmployeeTest.age);
		System.out.println("Employee salary is : " + EmployeeTest.salary);

		s.close();

	}

}
