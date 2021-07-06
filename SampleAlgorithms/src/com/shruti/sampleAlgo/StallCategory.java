package com.shruti.sampleAlgo;

public class StallCategory {
	private String name;
	private String detail;

	public StallCategory() {
		System.out.println("In Default Constructor");
	}

	public StallCategory(String name, String detail) {
		super();
		System.out.println("In parametrized constructor");
		this.name = name;
		this.detail = detail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public void display() {
		System.out.println("name : " + name);
		System.out.println("detail :" + detail);
	}

}
