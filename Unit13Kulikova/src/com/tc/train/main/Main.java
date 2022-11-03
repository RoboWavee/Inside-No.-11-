package com.tc.train.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.tc.train.bean.Depo;
import com.tc.train.bean.Month;
import com.tc.train.bean.Train;
import com.tc.train.logic.DepoLogic;
import com.tc.train.view.DepoView;

public class Main {

	public static void main(String[] args) {

		Date d1 = new Date(2022 - 1900, Month.NOVEMBER, 3, 12, 30);
		Date d2 = new Date(2022 - 1900, Month.NOVEMBER, 19, 22, 35);
		Date d3 = new Date(2022 - 1900, Month.NOVEMBER, 17, 7, 2);
		Date d4 = new Date(2022 - 1900, Month.NOVEMBER, 7, 9, 17);
		Date d5 = new Date(2022 - 1900, Month.NOVEMBER, 28, 14, 11);

			
		Train t1 = new Train(11, "Berlin", d1);
		Train t2 = new Train(2, "Paris", d2);
		Train t3 = new Train(4, "Praga", d3);
		Train t4 = new Train(9, "Rome", d4);
		Train t5 = new Train(16, "Warsaw", d5);
		Train t6 = new Train(7, "Berlin", d4);
		Train t7 = new Train(21, "Paris", d1);
		Train t8 = new Train(18, "Praga", d5);
		Train t9 = new Train(1, "Rome", d2);
		Train t10 = new Train(5, "Warsaw", d3);
		
		Depo allTrains = new Depo();
		
		allTrains.addTrains(t1);
		allTrains.addTrains(t2);
		allTrains.addTrains(t3);
		allTrains.addTrains(t4);
		allTrains.addTrains(t5);
		allTrains.addTrains(t6);
		allTrains.addTrains(t7);
		allTrains.addTrains(t8);
		allTrains.addTrains(t9);
		allTrains.addTrains(t10);
		
		DepoLogic logic = new DepoLogic();
		DepoView view = new DepoView();
		
			logic.sortByNumber(allTrains);
			logic.sortByDestinationAndTime(allTrains);
			
			
			
		}
		
		
}
