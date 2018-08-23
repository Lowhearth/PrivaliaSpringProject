package com.privalia.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("student")
@ComponentScan("com.privalia.entity")
public class Student {
	
	private int idStudent;
	private String name;
	private String surname;
	private int age;
	private Address address;
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [idStudent=");
		builder.append(idStudent);
		builder.append(", name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", age=");
		builder.append(age);
		builder.append(", addressID=");
		builder.append(address.getIdAddress());
		builder.append(", addressStreet=");
		builder.append(address.getStreet());
		builder.append("]");
		return builder.toString();
	}
	public Student(@Value("1")int idStudent, @Value("Daniel") String name, @Value("Vilanova") String surname, @Value("25") int age,  Address address) {
		
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.address = address;
	}
	public Student() {
		
	}
	
	

}
