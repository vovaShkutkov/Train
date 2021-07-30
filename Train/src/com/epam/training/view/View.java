package com.epam.training.view;

import java.util.ArrayList;
import com.epam.training.train.Train;
import com.epam.training.train.RailWayStation;
import com.epam.training.logic.Logic;

public class View {

	public static void printTrainNumber (RailWayStation table, int trainNumber ) {

		ArrayList<Train> pointer = Logic.searchByTrainNumber(table, trainNumber);
		for (Train element : pointer) {
			System.out.println(element);
		}
			
	}
	
	public static void printTrainStation (RailWayStation table, String trainStation, int timeDeparture ) {

		ArrayList<Train> pointer = Logic.searchByDestination(table, trainStation, timeDeparture);
		for (Train element : pointer) {
			System.out.println(element);
		}
			
	}
	
	

}
