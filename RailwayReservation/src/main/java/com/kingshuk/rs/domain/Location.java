package com.kingshuk.rs.domain;

public class Location {
	private int id;
	private String locationShortName;
	private String locationCode;
	private String locationDesc;
	
	public Location(){}
	
	
	
	public Location(int id, String locationShortName, String locationCode,
			String locationDesc) {
		super();
		this.id = id;
		this.locationShortName = locationShortName;
		this.locationCode = locationCode;
		this.locationDesc = locationDesc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocationShortName() {
		return locationShortName;
	}
	public void setLocationShortName(String locationShortName) {
		this.locationShortName = locationShortName;
	}
	public String getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	public String getLocationDesc() {
		return locationDesc;
	}
	public void setLocationDesc(String locationDesc) {
		this.locationDesc = locationDesc;
	}
	
	

}
