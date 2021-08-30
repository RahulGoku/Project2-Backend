package com.helper.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helper.demo.model.UserDetails;

public interface UserDetailsDao extends JpaRepository<UserDetails, Integer>{

}
