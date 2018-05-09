/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */

package vehicles;

import interfaces.ILandVehicles;
import interfaces.IMarineVehicles;
import interfaces.IVehicles;
import interfaces.Motorized;
import parents.LandVehicles;
import parents.MarineVehicles;

public class Amphicar implements IMarineVehicles,ILandVehicles,Motorized,IVehicles {
	
	private LandVehicles land;
	private MarineVehicles marine;
	private double avgFuel;
	private double avgEngineLife;
	
	public Amphicar(String model, int numOfPassengers, int maxSpeed, String windDirection, String country, int numOfWheels, String typeOfRoad,double avgFuel,double avgEngineLife) {
		marine=new MarineVehicles(model, numOfPassengers, maxSpeed, windDirection, country);
		land=new LandVehicles(model, numOfPassengers, maxSpeed, numOfWheels, typeOfRoad);
		this.avgFuel=avgFuel;
		this.avgEngineLife=avgEngineLife;
		}

	public String toString() {
		return "Amphibicar: "+ this.land.toString()+"the marine vehicles moving" +this.marine.getWindDirection()+ ",under "+this.marine.getCountry()+" flag, average Fuel:"+this.avgFuel+"engian life:"+this.avgEngineLife+".";
	}

	public boolean equals(Object f) {
		return false;
	}

	
	public int getNumOfWheels() {
		return this.land.getNumOfWheels();
	}

	
	public void setNumOfWheels(int numOfWheels) {
		this.land.setNumOfWheels(numOfWheels);
		
	}

	
	public String getTypeOfRoad() {
		return this.land.getTypeOfRoad();
	}

	
	public void setTypeOfRoad(String typeOfRoad) {
		this.land.setTypeOfRoad(typeOfRoad);
		
	}

	
	public void setCountry(String country) {
		this.marine.setCountry(country);
	}
	
	public String getCountry() {
		return this.marine.getCountry();
	}

	
	public String getWindDirection() {
		return this.marine.getWindDirection();
	}

	
	public void setWindDirection(String windDirection) {
		this.marine.setWindDirection(windDirection);
		
	}

	
	public double AverageFuelConsumption() {
		return this.avgFuel;
	}

	
	public double engineLife() {
		return this.avgEngineLife;
	}

	
	public int getKm() {
		return this.land.getKm();
	}

	
	public void setKm(int km) {
		this.land.setKm(km);
		this.marine.setKm(km);
		
	}

	
	public String getModel() {
		return this.getModel();
	}

	@Override
	public void setModel(String model) {
		this.land.setModel(model);
		this.marine.setModel(model);
	}

	
	public int getNumOfPassengers() {
		return this.getNumOfWheels();
	}

	
	public void setNumOfPassengers(int numOfPassengers) {
		this.land.setNumOfPassengers(numOfPassengers);
		this.marine.setNumOfPassengers(numOfPassengers);
	}

	
	public int getMaxSpeed() {
		return this.land.getMaxSpeed();
	}

	
	public void setMaxSpeed(int maxSpeed) {
		this.land.setMaxSpeed(maxSpeed);	
		this.marine.setMaxSpeed(maxSpeed);
	}

	
	public void updateKM(int kmTest) {
		this.land.updateKM(kmTest);
		this.marine.updateKM(kmTest);
	}


}
