package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private long id;
	private String name;
	private int phoneNo;
	public User(long id, String name, int phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + "]";
	}
	
}
