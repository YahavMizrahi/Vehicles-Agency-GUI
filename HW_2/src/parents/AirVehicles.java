package parents;

import abstractClass.Vehicles;

/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
public class AirVehicles extends Vehicles {
	private String use;
	/**
	 * constructor of AirVehicles.
	 * @param model
	 * @param numOfPassengers: number of passengers who can enter the MarineVehicles.
	 * @param maxSpeed: maximum speed of MarineVehicles.
	 * @param use: civilian or militery use
	 */
	public AirVehicles(String model,int numOfPassengers,int maxSpeed,String use) {
		super(model,numOfPassengers,maxSpeed);
		this.use=use;
	}
	/**
	 * return String of parameters of the class
	 */
	public String toString() {
		return super.toString()+this.use;
	}
	/**
	 * This function return true or false if the vehicles equal.
	 */
	public boolean equals(Object f) {
		if (f instanceof AirVehicles)
			return this.use.equals(((AirVehicles) f).use)&&super.equals(f);
		return false;
	}
}
