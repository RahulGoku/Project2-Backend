package com.helper.demo.model;

import javax.persistence.Entity;
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
public class UserDetails {
	@Id
    private int userid;
	private String userName;
	private String userPassword;
	private String city;
	private String mobile;
	
	
}
