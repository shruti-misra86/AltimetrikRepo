package com.example.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.model.Customer;

public class CustomerDao {
	ArrayList<Customer> custList = new ArrayList<Customer>();

	public Object insertCust(Customer customer) {
		Map<String, String> map = new HashMap<String, String>();
		if (customer.getCustId() == 0) {
			map.put("status", "error");
			map.put("message", "Please enter CustId");
		} else if (customer.getCustName().isEmpty()) {
			map.put("status", "error");
			map.put("message", "Please enter CustName");
		} else {
			custList.add(customer);
			map.put("status", "200");
			map.put("message", "Data saved success");
		}
		return map;

	}

	public ArrayList<Customer> getCustomers() {
		return custList;
	}

	public Customer getCustomerById(int id) {
		for (Customer c : custList) {
			if (id == c.getCustId()) {
				return c;
			}
		}
		return null;
	}

	public Object deleteCustomerById(int id) {
		Map<String, String> map = new HashMap<String, String>();
		for (Customer c : custList) {
			if (id == c.getCustId()) {
				custList.remove(c);
				map.put("status", "200");
				map.put("message", "Your Data Deleted successfully");
				return map;
			}
		}
		map.put("status", "error");
		map.put("message", "Your id does Not Exist");
		return map;
	}

	public Object createOrUpdateCustomer(Customer customer) {
		Map<String, String> map = new HashMap<String, String>();
		boolean customerNotExist = false;
		for (Customer c : custList) {
			if (c.getCustId() == customer.getCustId()) {
				c.setCustName(customer.getCustName());
				c.setAddress(customer.getAddress());
				c.setSalary(customer.getSalary());
				customerNotExist = true;
				map.put("status", "200");
				map.put("message", "customer updated");
			}

		}
		if (customerNotExist == false) {
			custList.add(customer);
			map.put("status", "200");
			map.put("message", "new customer created");
		}

		return map;

	}

}
