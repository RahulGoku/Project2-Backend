package com.helper.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer{
	@Id
	@GeneratedValue
    private int userid;
	private String userName;
	private String email;
	private String countryCode;
	private String mobile;
	private String jobType;
	private String userPassword;
	
	
}
