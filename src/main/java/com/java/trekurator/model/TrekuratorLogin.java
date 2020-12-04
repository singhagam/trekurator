package com.java.trekurator.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="login")
@Access(value=AccessType.FIELD)
public class TrekuratorLogin
{
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "email_id")
	private String EmailId;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "createdOn")
	private String createdOn;
	
	@Column(name = "UpdatedOn")
	private String updateOn;
	
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getUpdateOn() {
		return updateOn;
	}
	public void setUpdateOn(String updateOn) {
		this.updateOn = updateOn;
	}
}