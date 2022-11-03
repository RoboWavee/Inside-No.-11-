package com.tc.train.bean;

import java.util.Date;
import java.util.Objects;

public class Train {

	private int trainNumber;
	private String destination;
	private Date departureTime;

	public Train() {
		super();
	}

	public Train(int trainNumber, String destination, Date departureTime) {

	}

	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ", destination=" + destination + ", departureTime=" + departureTime
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(departureTime, destination, trainNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(departureTime, other.departureTime) && Objects.equals(destination, other.destination)
				&& trainNumber == other.trainNumber;
	}
	
	

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

}
