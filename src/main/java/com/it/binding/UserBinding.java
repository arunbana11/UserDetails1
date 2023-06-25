package com.it.binding;

public class UserBinding {

	
	private String name;
	private String city;
	private String pwd;
	private String email;
	private Double salary;
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
	public UserBinding(String name, String city, String pwd, String email, Double salary) {
		super();
		this.name = name;
		this.city = city;
		this.pwd = pwd;
		this.email = email;
		this.salary = salary;
	}
	public UserBinding() {
		super();
	}
	
}
