package com.privalia.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("adress")
public class Address {
	
	@Autowired
	@Value("1")
	private int idAddress;
	@Autowired
	@Value("San Juan")
	private String street;
	
	public int getIdAddress() {
		return idAddress;
	}
	public void setIdAdress(int id) {
		this.idAddress = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Address(int id, String street) {
		super();
		this.idAddress = id;
		this.street = street;
	}
	

}
