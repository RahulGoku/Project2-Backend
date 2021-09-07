package com.helper.demo.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.helper.demo.model.Customer;
import com.helper.demo.model.Feedback;
import com.helper.demo.model.HelperDetails;
import com.helper.demo.service.Service;

@RestController
@CrossOrigin
public class UserController {
	private static Logger log = LogManager.getLogger(UserController.class);

	@Autowired
	private Service service;

	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

	@GetMapping("/home")
	public String home() {
		return "this is home";
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
	@CrossOrigin("*")
	@GetMapping("/mechanicl/{location}")
	public List<HelperDetails>getMEchanicByLocation(@PathVariable("location") String location) {
		return this.service.getMEchanicByLocation(location);
	}
	@GetMapping("/plumberl/{location}")
	public List<HelperDetails>getPlumberByLocation(@PathVariable("location") String location) {
		return this.service.getPlumberByLocation(location);
	}
	@GetMapping("/electricianl/{location}")
	public List<HelperDetails>getElectricianByLocation(@PathVariable("location") String location) {
		return this.service.getElectricianByLocation(location);
	}
	@GetMapping("/tutorl/{location}")
	public List<HelperDetails>getTutorByLocation(@PathVariable("location") String location) {
		return this.service.getTutorByLocation(location);
	}
	@GetMapping("/otherl/{location}")
	public List<HelperDetails>getOtherByLocation(@PathVariable("location") String location) {
		return this.service.getOtherByLocation(location);
	}
	@GetMapping("/carpenterl/{location}")
	public List<HelperDetails>getCarpenterByLocCaation(@PathVariable("location") String location) {
		return this.service.getCarpenterByLocation(location);
	}
	@CrossOrigin
	@GetMapping("/helperid/{email}")
	public List<HelperDetails> getHelper(@PathVariable("email") String Email) {
		return service.getHelper(Email);
	}
	

///////////////////////Customer section//////////////////////

	@PostMapping("/customer/add")
	public Customer createCustomer(@RequestBody Customer customer) {
		Customer cs = this.service.createCustomer(customer);
		return cs;
	}
	@PostMapping("/login")
	public Customer login(@RequestBody Customer user) throws Exception {
		log.info("Hello Rahul");
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
	@CrossOrigin
	@GetMapping("/user/{email}")
	public List<Customer> getCustomer(@PathVariable("email") String Email) {
		return service.getCustomer(Email);
	}
///////////////////////Feedback section//////////////////////
	@CrossOrigin
	@PostMapping("/feed/add")
	public Feedback createQuery(@RequestBody Feedback feedback) {
		Feedback cs = this.service.createQuery(feedback);
		return cs;
	}
}
