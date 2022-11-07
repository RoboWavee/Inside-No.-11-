package com.tc.train.view;

import java.util.List;
import com.tc.train.bean.*;
import com.tc.train.logic.*;

import com.tc.train.bean.Depo;
import com.tc.train.bean.Train;

public class DepoView {

	public void printDepo(Depo dep) {

		for (Train tr : dep.getAllTrains()) {

			System.out.println("\nTRAIN NUMBER: " + tr.getTrainNumber() + "\nDESTINATION: " + tr.getDestination()
					+ "\nTIME: " + tr.getDepartureTime());

			System.out.println();

		}
	}

	public void printTrain(Train tr) {

		System.out.print("\nTRAIN NUMBER: " + tr.getTrainNumber() + "\nDESTINATION: " + tr.getDestination()
		+ "\nTIME: " + tr.getDepartureTime());

	}
}
