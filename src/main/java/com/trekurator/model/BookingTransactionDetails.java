package com.trekurator.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="booking_transaction_details")
@Access(value=AccessType.FIELD)
@Data
public class BookingTransactionDetails
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn (name = "user_booking_detail_id")
	private UserBookingDetails userBookingDetailsId;
	
	@Column(name = "gateway_setting_id")
	private String gatewaySettingId;
	
	@Column(name = "transaction_id")
	private String transactionId;
	
	@Column(name = "refernce_transaction_id")
	private String refernceTransactionId;
	
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	
	@Column(name = "amount")
	private String amount;
	
	@Column(name = "status")
	private String status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserBookingDetails getUserBookingDetailsId() {
		return userBookingDetailsId;
	}

	public void setUserBookingDetailsId(UserBookingDetails userBookingDetailsId) {
		this.userBookingDetailsId = userBookingDetailsId;
	}

	public String getGatewaySettingId() {
		return gatewaySettingId;
	}

	public void setGatewaySettingId(String gatewaySettingId) {
		this.gatewaySettingId = gatewaySettingId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getRefernceTransactionId() {
		return refernceTransactionId;
	}

	public void setRefernceTransactionId(String refernceTransactionId) {
		this.refernceTransactionId = refernceTransactionId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}