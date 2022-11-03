package com.tc.train.view;

import java.util.List;

import com.tc.train.bean.Train;

public class DepoView {
	
	public void print(List<Train> dep) {
		
		
		
		for (Train tr : dep) {
			System.out.println(tr.toString());
		}
		System.out.println();

}
}
