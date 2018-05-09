package vehicles;


import interfaces.Motorized;
import parents.MarineVehicles;

/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */

public class Frigate extends MarineVehicles implements Motorized {
	private double avgFuel;
	private double avgEngineLife;
	
	/**
	 * Constructor of Frigate
	 * @param model
	 * @param numOfPassengers : number of passengers who can enter the MarineVehicles.
	 * @param maxSpeed : maximum speed of MarineVehicles.
	 * @param windDirection : sailed with wind direction or not.
	 * @param country : State under it MarineVehicles.
	 */
	public Frigate(String model, int numOfPassengers, int maxSpeed, String windDirection, String country) {
		super(model, numOfPassengers, maxSpeed, windDirection, country);
		// TODO Auto-generated constructor stub
		this.avgEngineLife = 4;
		this.avgFuel = 500;
	}
	/**
	 * return the average of fuel consumption.
	 */
	public double AverageFuelConsumption() {
		return this.avgFuel;
	}
	
	/**
	 * return the average of engine life.
	 */
	public double engineLife() {
		return this.avgEngineLife;
	}
	
	/**
	 * return String of parameters of the class
	 */
	public String toString() {
		return "Frigate:"+super.toString()+ ".\nEngine: "
				+ this.AverageFuelConsumption() + "L, lifetime of " + this.avgEngineLife + " years.";
	}
	
	/**
	 * This function return true or false if the Frigate equal.
	 */
	public boolean equals(Object f) {
		if (f instanceof Frigate)
		return super.equals(f)&& this.avgFuel == ((Frigate)f).avgFuel;
		return false;
	}
}
