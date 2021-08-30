package com.helper.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.helper.demo.model.Courses;
import com.helper.demo.model.Customer;
import com.helper.demo.model.HelperDetails;
import com.helper.demo.model.UserDetails;
import com.helper.demo.service.Service;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	private Service service;

	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

	@GetMapping("/home")
	public String home() {
		return "this is home";
	}

	@GetMapping("/courses")
	public List<Courses> getAllCourses() {

		return this.service.getAllCourses();
	}

	@GetMapping("/course/{cid}")
	public Optional<Courses> getCourse(@PathVariable String cid) {

		return this.service.getCourse(Integer.parseInt(cid));
	}

	@PostMapping("/courses")
	public Courses createCourse(@RequestBody Courses courses) {
		return this.service.createCourse(courses);
	}

	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses courses) {
		return this.service.updateCourse(courses);
	}

	@DeleteMapping("/course/{cid}")
	public String removeCourse(@PathVariable String cid) {

		return this.service.removeCourse(Integer.parseInt(cid));
	}

/////////////////////////user section///////////////////////////

	@GetMapping("/users")
	public List<UserDetails> getAllUsers() {
		return this.service.getAllUsers();
	}

	@PostMapping("/users")
	public UserDetails createUser(@RequestBody UserDetails userDetails) {
		return this.service.createUser(userDetails);
	}

///////////////////////helper section//////////////////////

	@GetMapping("/helpers")
	public List<HelperDetails> getAllHelper() {
		return this.service.getAllHelper();
	}

	@PostMapping("/helpers")
	public HelperDetails createHelper(@RequestBody HelperDetails helperDetails) {

		Customer customer = ac.getBean(Customer.class);
		System.out.println("Inside Function 1 : " +customer);
		customer=service.getCustomerId(helperDetails.getUserEmail());
		//customer=service.getCustomerId("arjun@gmail.com");
//		helperDetails.setUserId(service.getCustomerId("arjun@gmail.com").getUserid());
//		customer.setUserid(helperDetails.getUserId());
		//System.out.println("Inside Function 2 : " +customer);
		helperDetails.setCustomer(customer);
		return this.service.createHelper(helperDetails);
	}
	@GetMapping("/mechnical")
	public List<HelperDetails>getMechanical() {
		return this.service.getMechanical();
	}
	@GetMapping("/plumber")
	public List<HelperDetails>getPlumber() {
		return this.service.getPlumber();
	}
	@GetMapping("/carpenter")
	public List<HelperDetails>getCarpenter() {
		return this.service.getCarpenter();
	}
	@GetMapping("/tutor")
	public List<HelperDetails>getTutor() {
		return this.service.getTutor();
	}
	@GetMapping("/electrician")
	public List<HelperDetails>getElectrician() {
		return this.service.getElectrician();
	}
	
	@GetMapping("/other")
	public List<HelperDetails>getOther() {
		return this.service.getOther();
	}

///////////////////////Customer section//////////////////////

	@PostMapping("/customer/add")
	public Customer createCustomer(@RequestBody Customer customer) {
		Customer cs = this.service.createCustomer(customer);
		return cs;
	}
	@PostMapping("/login")
	public Customer login(@RequestBody Customer user) throws Exception {
	  String tempEmailId = user.getEmail();
	  String tempPassword = user.getUserPassword();
	  Customer cust = null;
	  if (tempEmailId != null && tempPassword != null) {
	    cust = this.service.loginCustomer(tempEmailId, tempPassword);
	  }
	  
	  
	  if (cust == null) {
	    throw new Exception("Wrong credentials");
	  }

	  System.out.print(cust);
	  return cust;

	}
	 
}
