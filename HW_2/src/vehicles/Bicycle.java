/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
package vehicles;

import interfaces.NotMotorized;
import parents.LandVehicles;

public class Bicycle extends LandVehicles implements NotMotorized {
	private String sorcePower;
	
	public Bicycle(String model, int numOfPassengers, int maxSpeed, String typeOfRoad) {
		super(model, numOfPassengers, maxSpeed, 2, typeOfRoad);
		this.sorcePower="Manual";
	}

	public String SourceOfPower() {
		return this.sorcePower;	
		}

	public char energeticScore() {
		return 'A';
	}
	
	public String toString() {
		return "Bicycle:"+super.toString()+"Engine: Energetic Score" + this.energeticScore() + ", Surce power: " + this.sorcePower + ".";
	}
	
	public boolean equals(Object b) {
		if(b instanceof Bicycle)
			return super.equals(b)&& this.sorcePower == ((Bicycle) b).sorcePower;
		return false;
	}

}
