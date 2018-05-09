package vehicles;

import interfaces.NotMotorized;
import parents.AirVehicles;

/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
public class GliderGame extends AirVehicles implements NotMotorized {
	private String sorcePower;
	/**
	 * Constructor of GlidetGame
	 */
	public GliderGame() {
		super("Toy", 0, 10, "civil");
		this.sorcePower = "manual";
	}
	/**
	 * return the sorce power of Glider
	 */
	@Override
	public String SourceOfPower() {
		return this.sorcePower;
	}
	/**
	 * return energetic score
	 */
	@Override
	public char energeticScore() {
		return 'A';
	}
	/**
	 * return String of parameters of the class
	 */
	public String toString() {
		return "Glider Game:"+super.toString()+"Engine: Energetic Score" + this.energeticScore() + ", Surce power: " + this.sorcePower + ".";
	}
	/**
	 * This function return true or false if the vehicles equal.
	 */
	public boolean equals(Object g) {
		if(g instanceof GliderGame)
			return super.equals(g)&& this.sorcePower == ((GliderGame) g).sorcePower;
		return false;
	}
}
