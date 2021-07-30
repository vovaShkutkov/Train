package com.epam.training.train;

import java.util.Arrays;

public class Train {

	private String trainStation;
	private int trainNumber;
	private int timeDeparture;
	
	
	public Train(String trainStation, int trainNumber, int timeDeparture){
		
		this.trainStation = trainStation;
		this.trainNumber = trainNumber;
		this.timeDeparture = timeDeparture;
	}


	public String getTrainStation() {
		return trainStation;
	}


	public void setTrainStation(String trainStation) {
		this.trainStation = trainStation;
	}


	public int getTrainNumber() {
		return trainNumber;
	}


	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}


	public int getTimeDeparture() {
		return timeDeparture;
	}


	public void setTimeDeparture(int timeDeparture) {
		this.timeDeparture = timeDeparture;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + timeDeparture;
		result = prime * result + trainNumber;
		result = prime * result + ((trainStation == null) ? 0 : trainStation.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (timeDeparture != other.timeDeparture)
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		if (trainStation == null) {
			if (other.trainStation != null)
				return false;
		} else if (!trainStation.equals(other.trainStation))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Train [trainStation=" + trainStation + ", trainNumber=" + trainNumber + ", timeDeparture="
				+ timeDeparture + "]";
	}


	
	

}
