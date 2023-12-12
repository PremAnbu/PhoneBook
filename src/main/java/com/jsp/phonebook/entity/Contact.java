package com.jsp.phonebook.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contactId;
	private String contactFirstName;;
	private String ContactLastName;
	private long contactPhoneNo;
	private String contactEmail;
	
	@ManyToOne
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getContactFirstName() {
		return contactFirstName;
	}
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}
	public String getContactLastName() {
		return ContactLastName;
	}
	public void setContactLastName(String contactLastName) {
		ContactLastName = contactLastName;
	}
	public long getContactPhoneNo() {
		return contactPhoneNo;
	}
	public void setContactPhoneNo(long contactPhoneNo) {
		this.contactPhoneNo = contactPhoneNo;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	
}
