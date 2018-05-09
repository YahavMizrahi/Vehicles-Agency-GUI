package vehicles;

import interfaces.NotMotorized;
import parents.AirVehicles;

/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
public class GliderSpyware extends AirVehicles implements NotMotorized {
	private String sorcePower;
	/**
	 * Constructor of GliderSpyware.
	 */
	public GliderSpyware(String sorcePower) {
		super("Confidential", 1, 50, "Army");
		// TODO Auto-generated constructor stub
		this.sorcePower = sorcePower;
	}
	/**
	 * return the sorce power of Glider
	 */
	@Override
	public String SourceOfPower() {
		// TODO Auto-generated method stub
		return this.sorcePower;
	}
	/**
	 * return energetic score
	 */
	@Override
	public char energeticScore() {
		// TODO Auto-generated method stub
		return 'C';
	}
	/**
	 * return String of parameters of the class
	 */
	public String toString() {
		return "Glider Spyware: Model:"+super.toString()+"Engine: Energetic Score"+ this.energeticScore()  + ", Surce power: "+ this.sorcePower+"." ; 
	}
	/**
	 * This function return true or false if the vehicles equal.
	 */
	public boolean equals(Object g) {
		if(g instanceof GliderSpyware)
			return super.equals(g)&& this.sorcePower == ((GliderSpyware)g).sorcePower;
		return false;
	}
}
