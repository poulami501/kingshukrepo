package com.kingshuk.rs.domain;

import com.kingshuk.rs.utility.GlobalConstants;

public class Train {
	
	private String trainNo;
	private String trainName;
	private GlobalConstants.Days[] daysOfOperation;
	private String arrivalTime;
	private String departureTime;
	private String originLocation;
	private String destinationLocation;
	private GlobalConstants.Classes[] availableClasses;
	
	public Train(){}
	
	public Train(String trainNo, String trainName, GlobalConstants.Days[] daysOfOperation,
			String arrivalTime, String departureTime, String originLocation,
			String destinationLocation, GlobalConstants.Classes[] availableClasses) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.daysOfOperation = daysOfOperation;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.originLocation = originLocation;
		this.destinationLocation = destinationLocation;
		this.availableClasses = availableClasses;
	}
	public String getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public GlobalConstants.Days[] getDaysOfOperation() {
		return daysOfOperation;
	}
	public void setDaysOfOperation(GlobalConstants.Days[] daysOfOperation) {
		this.daysOfOperation = daysOfOperation;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getOriginLocation() {
		return originLocation;
	}
	public void setOriginLocation(String originLocation) {
		this.originLocation = originLocation;
	}
	public String getDestinationLocation() {
		return destinationLocation;
	}
	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	public GlobalConstants.Classes[] getAvailableClasses() {
		return availableClasses;
	}
	public void setAvailableClasses(GlobalConstants.Classes[] availableClasses) {
		this.availableClasses = availableClasses;
	}
	
	
	

}
