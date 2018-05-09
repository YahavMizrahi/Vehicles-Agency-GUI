/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
package vehicles;


import interfaces.Motorized;
import interfaces.TradeUse;
import parents.MarineVehicles;

public class ShipCrews extends MarineVehicles implements Motorized, TradeUse {
	private double avgFuel;
	private double avgEngineLife;
	
	public ShipCrews(String model, int numOfPassengers, int maxSpeed, String country,double avgFuel, double avgEngineLife) {
		super(model, numOfPassengers, maxSpeed, "with the wind", country);
		this.avgEngineLife = avgEngineLife;
		this.avgFuel =avgFuel ;	}

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

	public String tradeLicense() {
		// TODO Auto-generated method stub
		return "Unlimited";
	}

	/**
	 * return String of parameters of the class
	 */
	public String toString() {
		return "Crews:"+super.toString()+ ".\nEngine: "
				+ this.AverageFuelConsumption() + "L, lifetime of " + this.avgEngineLife + " years.";
	}
	/**
	 * This function return true or false if the Crews equal.
	 */
	public boolean equals(Object c) {
		if (c instanceof ShipCrews)
		return super.equals(c)&& this.avgFuel == ((ShipCrews)c).avgFuel;
		return false;
	}
}
