package parents;

import abstractClass.Vehicles;
import interfaces.IMarineVehicles;

/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
public class MarineVehicles extends Vehicles implements IMarineVehicles {
	private String windDirection;
	private String country;
	
	/**
	 *Constructor of marine vehicles
	 * @param model
	 * @param numOfPassengers : number of passengers who can enter the MarineVehicles.
	 * @param maxSpeed : maximum speed of MarineVehicles.
	 * @param windDirection : sailed with wind direction or not.
	 * @param country : State under it MarineVehicles.
	 */
	public MarineVehicles(String model,int numOfPassengers,int maxSpeed,String windDirection,String country) {
		super(model,numOfPassengers,maxSpeed);
		this.windDirection=windDirection;
		this.country=country;
	}
	/**
	 * function to change the state under it MarineVehicles.
	 * @param country: State under it MarineVehicles.
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * return String of parameters of the class
	 */
	public String toString() {
		return super.toString()+" the marine vehicles moving "+this.windDirection+ ",under "+this.country+" flag";
	}
	/**
	 * This function return true or false if the vehicles equal.
	 */
	public boolean equals(Object f) {
		if (f instanceof MarineVehicles)
			return this.country.equals(((MarineVehicles) f).country)&&this.windDirection.equals(((MarineVehicles) f).country)&&super.equals(f);
		return false;
	}
	public String getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}
	public String getCountry() {
		return country;
	}
}
