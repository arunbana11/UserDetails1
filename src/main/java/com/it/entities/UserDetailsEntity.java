package com.it.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserDetailsEntity {

	@Id
	@GeneratedValue
	private Integer userId;
	private String name;
	private String city;
	private String pwd;
	private String email;
	private Double salary;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public UserDetailsEntity(Integer userId, String name, String city, String pwd, String email, Double salary) {
		super();
		this.userId = userId;
		this.name = name;
		this.city = city;
		this.pwd = pwd;
		this.email = email;
		this.salary = salary;
	}
	public UserDetailsEntity() {
		super();
	}
	
	
	
}
