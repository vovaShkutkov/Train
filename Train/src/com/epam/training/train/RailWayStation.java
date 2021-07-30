package com.epam.training.train;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import com.epam.training.train.Train;



public class RailWayStation {

	
	
	private static ArrayList<Train> pointer;
	
	public static ArrayList<Train> getPointer() {
		return pointer;
	}

	public static void setPointer(ArrayList<Train> pointer) {
		RailWayStation.pointer = pointer;
	}

	

	static {
		setPointer(new ArrayList<Train>());
		
		getPointer().add(new Train ("Orsha", 1001, 10));
		getPointer().add(new Train ("Lida", 1010, 9));
		getPointer().add(new Train ("Krichev", 1100, 8));
		getPointer().add(new Train ("Minsk", 1200, 7));
		getPointer().add(new Train ("Vitebsk", 1020, 6));
		getPointer().add(new Train ("Orsha", 3001, 0));
		getPointer().add(new Train ("Lida", 3010, 19));
		getPointer().add(new Train ("Krichev", 3100, 18));
		getPointer().add(new Train ("Minsk", 3200, 17));
		getPointer().add(new Train ("Vitebsk", 3020, 16));
		getPointer().add(new Train ("Orsha", 2001, 12));
		getPointer().add(new Train ("Lida", 2010, 7));
		getPointer().add(new Train ("Krichev", 2100, 6));
		getPointer().add(new Train ("Minsk", 2200, 5));
		getPointer().add(new Train ("Vitebsk", 2020, 8));
		
		
				
	}
	
	

}

	
