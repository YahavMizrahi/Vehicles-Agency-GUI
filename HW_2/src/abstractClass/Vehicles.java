package abstractClass;

import interfaces.IVehicles;

/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
public abstract class Vehicles implements IVehicles{
	private int km;
	private String model;
	private int numOfPassengers;
	private int maxSpeed;
	/**
	 * \
	 * This constructor Vehicles with the 3 parameters:
	 * @param model
	 * @param numOfPassengers : number of passengers who can enter the vehicles.
	 * @param maxSpeed : maximum speed of vehicles.
	 */
	public Vehicles(String model,int numOfPassengers,int maxSpeed) {
		this.km=0;
		this.model=model;
		this.numOfPassengers=numOfPassengers;
		this.maxSpeed=maxSpeed;		
	}
	/**
	 * updateKM function get integer parameter and add to the km of vehicles.
	 * @param km : number of km of the vehicles.
	 */
	public void updateKM(int km) {
		this.km=this.km+km;
	}
	/**
	 * return String of parameters of the class
	 */
	public String toString() {
		return "Model: "+this.model+", Traveled: "+this.km+" km, Max speed of "+this.maxSpeed+" Mph, "+"can Carry max of "+this.numOfPassengers+" people";
	}
	/**
	 * This function return true or false if the vehicles equal.
	 */
	public boolean equals(Object f) {
		if (f instanceof Vehicles)
			return this.model.equals(((Vehicles) f).model)&&
			this.maxSpeed==((Vehicles)f).maxSpeed&&this.numOfPassengers==((Vehicles)f).numOfPassengers;
		return false;
	}
	
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNumOfPassengers() {
		return numOfPassengers;
	}
	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
