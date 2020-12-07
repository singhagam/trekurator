package com.trekurator.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="user_login")
public class UserLogin
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@OneToMany (cascade = CascadeType.ALL , mappedBy = "userLogin")
	private List<UserBookingDetails> UserBookingDetails;
	
	@Column(name = "email_id")
	private String EmailId;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "contact_no")
	private String contactNo;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	
	@Column(name = "weight")
	private String Weight;
	
	@Column(name = "height")
	private String height;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "pin_code")
	private String pinCode;
	
	@Column(name = "createdOn")
	private String createdOn;
	
	@Column(name = "UpdatedOn")
	private String updateOn;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<UserBookingDetails> getUserBookingDetails() {
		return UserBookingDetails;
	}

	public void setUserBookingDetails(List<UserBookingDetails> userBookingDetails) {
		UserBookingDetails = userBookingDetails;
	}

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getWeight() {
		return Weight;
	}

	public void setWeight(String weight) {
		Weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
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