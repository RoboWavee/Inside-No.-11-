package com.tc.train.logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.tc.train.bean.Depo;
import com.tc.train.bean.Train;

public class DepoLogic {

	public Train findTrain(int number, Depo d) {

		for (Train tr : d.getAllTrains()) {

			if (number == tr.getTrainNumber()) {
				return tr;
			}

		}
		return null;

	}

	public Train findTrainByDest(String dest, Depo d) {

		for (Train tr : d.getAllTrains()) {

			if (dest == tr.getDestination()) {
				return tr;
			}

		}
		return null;

	}

	public void sortByNumber(Depo dep) {

		Collections.sort(dep.getAllTrains(), new Comparator<Train>() {
			@Override
			public int compare(Train tr1, Train tr2) {

				return tr1.getTrainNumber() - tr2.getTrainNumber();
			}

		});
	}

	public void sortByDestinationAndTime(Depo dep) {

		Collections.sort(dep.getAllTrains(), new Comparator<Train>() {
			@Override
			public int compare(Train tr1, Train tr2) {
				if (tr1.getDestination() == tr2.getDestination()) {
					return tr1.getDepartureTime().compareTo(tr2.getDepartureTime());
				} else {

					return tr1.getDestination().compareTo(tr2.getDestination());

				}

			}

		});

	}

	@Override
	public String toString() {
		return "DepoLogic [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
