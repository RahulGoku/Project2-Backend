package com.helper.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelperDetails {
	@Id
	@GeneratedValue
    private int helperId;
    private String helperService;
    private String location;
    private String description;
    private String  countryCode;
    private String  contact;
//    private String helperPassword;
	//private String pan;
	private String aadhar;
	@Transient
	private String userEmail;
	@OneToOne
	private Customer customer;
    
}
