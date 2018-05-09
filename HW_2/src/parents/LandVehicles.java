package parents;

import abstractClass.Vehicles;
import interfaces.ILandVehicles;

/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
public class LandVehicles extends Vehicles implements ILandVehicles {
	private int numOfWheels;
	private String typeOfRoad;
	
	 /**
	  *Constructor of land vehicles
	  * @param model
	  * @param numOfPassengers: number of passengers who can enter the MarineVehicles.
	  * @param maxSpeed: maximum speed of MarineVehicles.
	  * @param numOfWheels: number wheels of land vehicles.
	  * @param typeOfRoad: the road that the vehicles can drive.
	  */
	public LandVehicles(String model,int numOfPassengers,int maxSpeed,int numOfWheels,String typeOfRoad) {
		super(model,numOfPassengers,maxSpeed);
		this.numOfWheels=numOfWheels;
		this.typeOfRoad=typeOfRoad;
	}
	/**
	 * return String of parameters of the class
	 */
	public String toString() {
		return super.toString()+ "the land vehicles has "+this.numOfWheels+" wheels, and he moving on "+this.typeOfRoad;
	}
	/**
	 * This function return true or false if the vehicles equal.
	 */
	public boolean equals(Object f) {
		if (f instanceof LandVehicles)
			return this.numOfWheels==((LandVehicles)f).numOfWheels&&this.typeOfRoad.equals(((LandVehicles) f).typeOfRoad)&&super.equals(f);
		return false;
	}
	
	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	public String getTypeOfRoad() {
		return typeOfRoad;
	}
	public void setTypeOfRoad(String typeOfRoad) {
		this.typeOfRoad = typeOfRoad;
	}
}
