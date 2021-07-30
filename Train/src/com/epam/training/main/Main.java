package com.epam.training.main;

import java.util.ArrayList;
import com.epam.training.train.Train;
import com.epam.training.train.RailWayStation;
import com.epam.training.logic.Logic;
import com.epam.training.view.View;
import java.util.Scanner;


public class Main {

	
	
	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		int trNum;

		RailWayStation table = new RailWayStation();
		
		System.out.println("Search by Train Number:");
		System.out.print("Enter train number:");
		
		while(!src.hasNextInt()) {
			src.nextLine();
			System.out.println("¬ведено некорретное значение");
			
		} 
		
		
		
		trNum = src.nextInt();
		View.printTrainNumber(table, trNum);
		
	
		System.out.println("Search by Destination:");
		
		View.printTrainStation(table, "Lida", trNum);
	
	}
	
	
	
}
