package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.CustomerDao;
import com.example.model.Customer;

@RestController
public class CustomerController {

	CustomerDao customerDao = new CustomerDao();

	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public Object saveCustomer(@RequestBody Customer customer) {
		return customerDao.insertCust(customer);
	}

	@RequestMapping(value = "/getCustomer", method = RequestMethod.GET)
	public List<Customer> getAllCustomer() {
		return customerDao.getCustomers();
	}

	@RequestMapping(value = "/getCustomerById/{id}", method = RequestMethod.GET)
	public Customer getCustomerById(@PathVariable int id) {
		return customerDao.getCustomerById(id);
	}

	@RequestMapping(value = "/deleteCustomerById/{id}", method = RequestMethod.DELETE)
	public Object deleteCustomerById(@PathVariable int id) {
		return customerDao.deleteCustomerById(id);
	}

	@RequestMapping(value = "/updateCustomer", method = RequestMethod.PUT)
	public Object updateCustomer(@RequestBody Customer customer) {
		return customerDao.createOrUpdateCustomer(customer);
	}

}
