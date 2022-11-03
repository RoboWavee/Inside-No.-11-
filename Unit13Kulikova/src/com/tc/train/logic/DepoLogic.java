package com.tc.train.logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.tc.train.bean.Depo;
import com.tc.train.bean.Train;

public class DepoLogic {

	public List<Train> sortByNumber(Depo allTrains) {

		return null;
	}

	public List<Train> sortByDestinationAndTime(Depo allTrains) {

		return null;
	}

	public Train findTrain(int number, Depo allTrains) {

		return null;
	}

	public void sortByNumber(List<Train> allTrains) {

		Collections.sort(allTrains, new Comparator<Train>() {
			@Override
			public int compare(Train tr1, Train tr2) {

				return tr1.getTrainNumber() - tr2.getTrainNumber();
			}

		});
	}

	public void sortByDestinationAndTime(List<Train> allTrains) {

		Collections.sort(allTrains, new Comparator<Train>() {
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
}