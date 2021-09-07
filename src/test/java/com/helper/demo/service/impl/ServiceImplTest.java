package com.helper.demo.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.helper.demo.model.Customer;

class ServiceImplTest {
	private static ServiceImpl service;
	
	@Test
	private void assertTrue(boolean condition, Customer loginCustomer) {
		try {
			assertTrue(true, service.loginCustomer("rrjn123@gmail.com","rrjn@123"));}
			catch (Exception e) {
				fail("No Account Found");
			}
		
		
	}
	@Test
	private void assertTrue1(boolean condition, Customer loginCustomer) {
		try {
			assertTrue(true, service.loginCustomer("rrj.com","rrjn@123"));}
			catch (Exception e) {
				fail("No Account Found");
			}
		
		
	}

	@Test
	void testGetCustomerId() {
		try {
			assertEquals("rrjn123@gmail.com",service.getCustomerId("rrjn123@gmail.com"));
		} catch (Exception e) {
			fail("No Account Found");
		}
	}

	

}
