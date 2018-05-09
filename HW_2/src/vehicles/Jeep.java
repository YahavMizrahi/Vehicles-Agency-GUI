package vehicles;

import interfaces.ILandVehicles;
import interfaces.Motorized;
import interfaces.TradeUse;
import parents.LandVehicles;

/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
public class Jeep extends LandVehicles implements Motorized, TradeUse,ILandVehicles {
	private int avgFuel;
	private int avgEngineLife;
	/**
	 * 
	 * @param model
	 * @param maxSpeed:  maximum speed of MarineVehicles.
	 * @param avgFuel: average fuel.
	 * @param avgEngineLife: average engine life.
	 */
	public Jeep(String model, int maxSpeed, int avgFuel, int avgEngineLife) {
		super(model, 5, maxSpeed, 4, "asphalt");
		this.avgFuel = avgFuel;
		this.avgEngineLife = avgEngineLife;
	}
	/**
	 * return average fuel consumption.
	 */
	public double AverageFuelConsumption() {
		return this.avgFuel;
	}
	/**
	 * return engine life.
	 */
	public double engineLife() {
		return this.avgEngineLife;
	}
	/**
	 * return String of trade license.
	 */
	public String tradeLicense() {
		return "MINI";
	}
	/**
	 * return String of parameters of the class
	 */
	public String toString() {
		return "Jeep: "+ super.toString()+ ".\naverage fuel consumption " + this.avgFuel + " L ,lifetime of " + this.engineLife() + " years.";
	}
	/**
	 * This function return true or false if the vehicles equal.
	 */
	public boolean equals(Object j) {
		if (j instanceof Jeep)
			return super.equals(j)
					&& this.avgEngineLife == ((Jeep) j).avgEngineLife && this.avgFuel == ((Jeep) j).avgFuel;
		return false;
	}
}
