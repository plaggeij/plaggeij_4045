package com.plantplaces.dto;

public class SpecimenDTO {

	private String latitude;
	private String longitude;
	private int specimenId;
	private String description;
	
	public int getSpecimenId() {
		return specimenId;
	}
	
	public void setSpecimenId(int specimenId) {
		this.specimenId = specimenId;
	}
	
	public String getLatitude() {
		return latitude;
	}
	
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public String getLongitude() {
		return longitude;
	}
	
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return specimenId + " " + latitude + " " + longitude + " " + description;
	}
}
