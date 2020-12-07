package com.trekurator.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="group_member_details")
public class GroupMemberDetails
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn (name = "user_booking_details_id")
	private UserBookingDetails userBookingDetails;
	
	@Column(name = "group_member_name")
	private String fromDate;
	
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserBookingDetails getUserBookingDetails() {
		return userBookingDetails;
	}

	public void setUserBookingDetails(UserBookingDetails userBookingDetails) {
		this.userBookingDetails = userBookingDetails;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
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
	
	
}