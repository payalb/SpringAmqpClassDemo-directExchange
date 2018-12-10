package com.example.demo.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order implements Serializable{
	
	private int id;
	private float amountToBeCollected;
	private String address;
	private String userId;
	private long phoneNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getAmountToBeCollected() {
		return amountToBeCollected;
	}
	public void setAmountToBeCollected(float amountToBeCollected) {
		this.amountToBeCollected = amountToBeCollected;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", amountToBeCollected=" + amountToBeCollected + ", address=" + address + ", userId="
				+ userId + ", phoneNumber=" + phoneNumber + "]";
	}
	public Order(int id, float amountToBeCollected, String address, String userId, long phoneNumber) {
		super();
		this.id = id;
		this.amountToBeCollected = amountToBeCollected;
		this.address = address;
		this.userId = userId;
		this.phoneNumber = phoneNumber;
	}
}
