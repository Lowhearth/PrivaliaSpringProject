package com.privalia.entity.annotations;

import org.springframework.stereotype.Component;

@Component("adress")
public class Address {
	
	private int idAddress;
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
