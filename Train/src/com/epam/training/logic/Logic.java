package com.epam.training.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import com.epam.training.train.Train;
import com.epam.training.train.RailWayStation;

public class Logic {
	
	

	public static ArrayList<Train> searchByTrainNumber (RailWayStation table, int trainNumber) {
		
		ArrayList<Train> pointer = table.getPointer();
		ArrayList<Train> value = new ArrayList<Train>();
		
		
		for (int i=0; i<pointer.size(); i++) {
		
			if (pointer.get(i).getTrainNumber()==(trainNumber)) {
				value.add(pointer.get(i));
				
				
		
			}
			
		}
		
				
		return value;
		

	}
	
	public static ArrayList<Train> searchByDestination (RailWayStation table, String trainStation,  int timeDeparture) {
		
		ArrayList<Train> pointer = table.getPointer();
		ArrayList<Train> value1 = new ArrayList<Train>();
		
		
		for (int i=0; i<pointer.size(); i++) {
		
			if (pointer.get(i).getTrainStation()==(trainStation)) {
				value1.add(pointer.get(i));
				
									
			}
		}
		
		return value1;
		
	}
	
	
}
