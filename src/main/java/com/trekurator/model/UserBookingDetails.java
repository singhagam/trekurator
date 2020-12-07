package com.trekurator.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_booking_details")
public class UserBookingDetails
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn (name = "trekschedule_id")
	private TrekSchedule trekSchedule;
		
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn (name = "user_login_id")
	private UserLogin userLogin;
	
	@Column(name = "booking_status")
	private String bookingStatus;
	
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
	
	@OneToMany (cascade = CascadeType.ALL , mappedBy = "userBookingDetails")
	private List<GroupMemberDetails> groupMemberDetails;
	
	@OneToMany (cascade = CascadeType.ALL , mappedBy = "userBookingDetailsId")
	private List<BookingTransactionDetails> bookingTransactionDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TrekSchedule getTrekSchedule() {
		return trekSchedule;
	}

	public void setTrekSchedule(TrekSchedule trekSchedule) {
		this.trekSchedule = trekSchedule;
	}

	public UserLogin getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
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

	public List<GroupMemberDetails> getGroupMemberDetails() {
		return groupMemberDetails;
	}

	public void setGroupMemberDetails(List<GroupMemberDetails> groupMemberDetails) {
		this.groupMemberDetails = groupMemberDetails;
	}

	public List<BookingTransactionDetails> getBookingTransactionDetails() {
		return bookingTransactionDetails;
	}

	public void setBookingTransactionDetails(List<BookingTransactionDetails> bookingTransactionDetails) {
		this.bookingTransactionDetails = bookingTransactionDetails;
	}
	
	
}