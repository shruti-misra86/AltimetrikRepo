package com.shruti.sampleAlgo;

public class ItemType {

	private String name;
	private double deposit;
	private double costPerDay;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return this.deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getCostPerDay() {
		return this.costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public void display() {
		System.out.println("ItemType Name : " + name);
		System.out.printf("Deposit : %.1f%n", deposit);
		System.out.printf("Cost per day : %.1f", costPerDay);
	}
}
