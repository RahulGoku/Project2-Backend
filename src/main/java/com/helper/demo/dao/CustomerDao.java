package com.helper.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helper.demo.model.Customer;
@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{

	
//	public Customer findByUsernameAndPassword(String username, String password);

}
