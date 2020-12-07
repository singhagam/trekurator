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
@Table(name="trek_schedule")
public class TrekSchedule
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn (name = "trekdetail_id")
	private TrekDetail trekDetail;
	
	@Column(name = "from_date")
	private String fromDate;
	
	@Column(name = "to_date")
	private String toDate;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "max_seat")
	private String maxSeat;
	
	@Column(name = "registered_seat")
	private String registeredSeat;
	
	@OneToMany (cascade = CascadeType.ALL , mappedBy = "trekSchedule")
	private List<UserBookingDetails> userBookingDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TrekDetail getTrekDetail() {
		return trekDetail;
	}

	public void setTrekDetail(TrekDetail trekDetail) {
		this.trekDetail = trekDetail;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMaxSeat() {
		return maxSeat;
	}

	public void setMaxSeat(String maxSeat) {
		this.maxSeat = maxSeat;
	}

	public String getRegisteredSeat() {
		return registeredSeat;
	}

	public void setRegisteredSeat(String registeredSeat) {
		this.registeredSeat = registeredSeat;
	}

	public List<UserBookingDetails> getUserBookingDetails() {
		return userBookingDetails;
	}

	public void setUserBookingDetails(List<UserBookingDetails> userBookingDetails) {
		this.userBookingDetails = userBookingDetails;
	}
	
}