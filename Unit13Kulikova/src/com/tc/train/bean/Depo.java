package com.tc.train.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Depo {

	private List<Train> allTrains = new ArrayList<Train>();

	public Depo() {
	}

	public List<Train> getAllTrains() {
		return allTrains;
	}

	public void setAllTrains(List<Train> allTrains) {
		this.allTrains = allTrains;
	}

	public Train getAllTrains(int index) {
		return allTrains.get(index);
	}

	public void setAllTrains(int index, Train train) {
		allTrains.set(index, train);
	}

	public void addTrains(Train train) {
		allTrains.add(train);
	}

	public int countTrains() {
		return allTrains.size();
	}

	@Override
	public int hashCode() {
		return Objects.hash(allTrains);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Depo other = (Depo) obj;
		return Objects.equals(allTrains, other.allTrains);
	}

	@Override
	public String toString() {
		return "Depo [allTrains=" + allTrains + "]";
	}

}
