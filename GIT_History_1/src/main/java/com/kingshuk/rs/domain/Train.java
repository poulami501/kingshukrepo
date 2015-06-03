package com.kingshuk.rs.domain;

public class Train {
	private enum Days{
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		DAILY
	}
	private enum Classes{
		AC1,
		AC2,
		AC3,
		Sleepers
	}
	private String trainNo;
	private String trainName;
	private Days[] daysOfOperation;
	private String arrivalTime;
	private String departureTime;
	private String originLocation;
	private String destinationLocation;
	private Classes[] availableClasses;
	
	public Train(){}
	
	public Train(String trainNo, String trainName, Days[] daysOfOperation,
			String arrivalTime, String departureTime, String originLocation,
			String destinationLocation, Classes[] availableClasses) {
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
	public Days[] getDaysOfOperation() {
		return daysOfOperation;
	}
	public void setDaysOfOperation(Days[] daysOfOperation) {
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
	public Classes[] getAvailableClasses() {
		return availableClasses;
	}
	public void setAvailableClasses(Classes[] availableClasses) {
		this.availableClasses = availableClasses;
	}
	
	
	

}
