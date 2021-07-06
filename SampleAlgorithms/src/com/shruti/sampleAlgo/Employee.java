package com.shruti.sampleAlgo;

import java.util.ArrayList;

public class Employee {

	private int id;
	private String name;

	Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		int num = 12345;
		int remainder;
		int reverse = 0;

		while (num != 0) {

			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("reverse " + reverse);

		ArrayList<Employee> employees = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "Harry");
		Employee e2 = new Employee(7, "Meghan");
		Employee e3 = new Employee(5, "shru");
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);

		for (Employee e : employees)
			System.out.println("employee id - " + e.getId() + " employee name - " + e.getName() + " ");

		employees.stream().map(e -> e.id).forEach(System.out::println);
		employees.stream().map(e -> e.id).sorted().filter(id -> id >= 5).forEachOrdered(a -> {
			System.out.println(a);
		});

	}
}