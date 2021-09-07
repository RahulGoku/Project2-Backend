package com.helper.demo.service;

import java.util.List;

import com.helper.demo.model.Customer;
import com.helper.demo.model.Feedback;
import com.helper.demo.model.HelperDetails;

public interface Service {

	
	
	public Customer loginCustomer(String tempEmailId, String tempPassword);
	public Customer createCustomer(Customer customer);
	public Feedback createQuery(Feedback feedback);
	public Customer getCustomerId(String tempEmailId);

	public List<HelperDetails> getAllHelper();
	
	public HelperDetails createHelper(HelperDetails helperDetails);
	public List<HelperDetails> getMechanical();
	public List<HelperDetails> getPlumber();
	public List<HelperDetails> getElectrician();
	public List<HelperDetails> getCarpenter();
	public List<HelperDetails> getTutor();
	public List<HelperDetails> getOther();
	public List<Customer> getCustomer(String tempEmailId);
	public List<HelperDetails> getMEchanicByLocation(String location);
	public List<HelperDetails> getPlumberByLocation(String location);
	public List<HelperDetails> getElectricianByLocation(String location);
	public List<HelperDetails> getTutorByLocation(String location);
	public List<HelperDetails> getOtherByLocation(String location);
	public List<HelperDetails> getCarpenterByLocation(String location);
	public List<HelperDetails> getHelper(String tempEmailId);
	
}
