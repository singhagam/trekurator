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
@Table(name="trek_detail")
public class TrekDetail
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@OneToMany (cascade = CascadeType.ALL , mappedBy = "trekDetail")
	private List<TrekSchedule> trekSchdule;
	
	@Column(name = "trek_name")
	private String trekName;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "difficulty")
	private String difficulty;
	
	@Column(name = "trek_description")
	private String trekDescriptiont;
	
	@Column(name = "short_itenrary")
	private String shortItinerary;
	
	@Column(name = "detailed_itenrary")
	private String detailedItnierary;
	
	@Column(name = "altitutde")
	private String altitutde;
	
	@Column(name = "duration")
	private String duration;
	
	@Column(name = "distance")
	private String distance;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "base_camp")
	private String baseCamp;
	
	@Column(name = "visitng_time")
	private String visitngTime;
	
	@Column(name = "services")
	private String services;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<TrekSchedule> getTrekSchdule() {
		return trekSchdule;
	}

	public void setTrekSchdule(List<TrekSchedule> trekSchdule) {
		this.trekSchdule = trekSchdule;
	}

	public String getTrekName() {
		return trekName;
	}

	public void setTrekName(String trekName) {
		this.trekName = trekName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getTrekDescriptiont() {
		return trekDescriptiont;
	}

	public void setTrekDescriptiont(String trekDescriptiont) {
		this.trekDescriptiont = trekDescriptiont;
	}

	public String getShortItinerary() {
		return shortItinerary;
	}

	public void setShortItinerary(String shortItinerary) {
		this.shortItinerary = shortItinerary;
	}

	public String getDetailedItnierary() {
		return detailedItnierary;
	}

	public void setDetailedItnierary(String detailedItnierary) {
		this.detailedItnierary = detailedItnierary;
	}

	public String getAltitutde() {
		return altitutde;
	}

	public void setAltitutde(String altitutde) {
		this.altitutde = altitutde;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBaseCamp() {
		return baseCamp;
	}

	public void setBaseCamp(String baseCamp) {
		this.baseCamp = baseCamp;
	}

	public String getVisitngTime() {
		return visitngTime;
	}

	public void setVisitngTime(String visitngTime) {
		this.visitngTime = visitngTime;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}
	
	
	
}