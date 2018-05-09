package agency;

/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
import java.util.*;

import abstractClass.Vehicles;
import interfaces.IMarineVehicles;
import interfaces.IVehicles;
import parents.MarineVehicles;
import vehicles.Frigate;
import vehicles.GliderGame;
import vehicles.GliderSpyware;
import vehicles.Jeep;

public class DriverCarAgency {
	static Scanner input = new Scanner(System.in);
	static private ArrayList<IVehicles> v = new ArrayList<IVehicles>();
	static private ArrayList<IMarineVehicles> ship = new ArrayList<IMarineVehicles>();

	public static ArrayList<IVehicles> getV() {
		return v;
	}

	public static ArrayList<IMarineVehicles> getShip() {
		return ship;
	}

	public static void main(String[] args) {
		addVehicles();
		agencyOption();
	}

	public static IVehicles creatVehicles(char choose, int ch) {
		int maxSpeed, avgFuel, engineLife, numOfPassengers, wd;
		String model, windDirection = null, country, sorcePower, s;
		switch (choose) {
		case '1':// add Jeep
			System.out.println("Enter model of Jeep:");
			model = input.nextLine();
			input.nextLine();
			s = "Enter maximum speed of Jeep:";
			maxSpeed = checkIntInput(input, s);
			s = ("Enter average Fuel consumption of Jeep:");
			avgFuel = checkIntInput(input, s);
			s = ("Enter average Engine Life of Jeep:");
			engineLife = checkIntInput(input, s);
			return new Jeep(model, maxSpeed, avgFuel, engineLife);
		case '2':// add Frigate
			System.out.println("Enter model of Frigate:");
			model = input.nextLine();
			input.nextLine();
			s = ("Enter number of passengers:");
			numOfPassengers = checkIntInput(input, s);
			s = ("Enter maximum speed of Frigate:");
			maxSpeed = checkIntInput(input, s);
			do {
				s = ("Enter wind direction of Frigate: 1-with the wind, 2-against the direction.");
				wd = checkIntInput(input, s);
			} while (wd != 1 && wd != 2);
			if (wd == 1)
				windDirection = "with the wind";
			else if (wd == 2)
				windDirection = "against the direction";
			System.out.println("Enter country of Frigate:");
			country = input.next();
			MarineVehicles f = new Frigate(model, numOfPassengers, maxSpeed, windDirection, country);
			if (ch == 1)
				ship.add(f);
			return f;
		case '3':// add Glider Spyware
			System.out.println("Enter sorcePower of Glider Spyware:");
			sorcePower = input.next();
			return new GliderSpyware(sorcePower);
		case '4':// add Glider Game
			return new GliderGame();
		}
		return null;
	}
	public static int checkIntInput(Scanner c, String s) {
		System.out.println(s);
		while (!input.hasNextInt()) {
			System.out.println("Invalid input...");
			System.out.println(s);
			c.nextLine();
		}
		int num = c.nextInt();
		c.nextLine();
		return num;
	}
	public static void addVehicles() {
		char choose;
		IVehicles vehicles;
		do {// add vehicles
			System.out.println("Insert 1 to add Jeep.\nInsert 2 to add Frigate.\nInsert 3 to add Glider Spyware."
					+ "\nInsert 4 to add Glider Game.\nInsert 0 if you do not want to add vehicles.");
			choose = input.next().charAt(0);
			if (choose < '0' || choose > '4')
				System.out.println("this option not exist.");
			vehicles = creatVehicles(choose, 1);
			if (vehicles != null)
				v.add(vehicles);
		} while (choose != '0');
	}
	public static void agencyOption() {
		char choose;
			do {// agency option
				if (v.isEmpty()) {
					System.out.println("There are no vehicles in the agency.");
					break;
				}
				System.out.println("Insert 1 to buy vehicles.\nInsert 2 to take the vehicles for a test drive.\n"
						+ "Insert 3 to reset kilometers.\nInsert 4 to change the vessel flag.\nEnter 0 to exit the agency.");
				choose = input.next().charAt(0);
				switch (choose) {
				case '1':// buy Vehicles
					buyVehicles();
					break;
				case '2':// test drive
					testDrive();
					break;
				case '3':// reset KM
					resetKMToAllVehicles();
					break;
				case '4':// set country
					setCountryToAllMarineVehicles();
				}
			} while (choose != '0');
	}
	public static void buyVehicles() {
		char choose;
		for (int i = 0; i < v.size(); i++)
			System.out.println(v.get(i) + "\n");
		System.out.println("Insert 1 to buy Jeep.\nInsert 2 to buy Frigate."
				+ "\nInsert 3 to buy Glider Spyware.\nInsert 4 to buy Glider Game.");
		choose = input.next().charAt(0);
		IVehicles veh = creatVehicles(choose, 2);
		if (v.contains(veh)) {
			v.remove(veh);
			if (choose=='2')
				ship.remove(veh);
			System.out.println("Enjoy your new vehicles.");
		} else
			System.out.println("This vehicles does not exist.");
	}
	public static void testDrive() {
		char choose;
		String str;
		System.out.println("Insert 1 for a test drive on a jeep.\nInsert 2 for a test drive on a Frigate.\n"
				+ "Insert 3 for a test drive on a Glider Spyware.\nInsert 4 for a test drive on a Glider Game.");
		choose = input.next().charAt(0);
		int kmTest;
		IVehicles vehi = creatVehicles(choose, 2);
		if (v.contains(vehi)) {
			str = ("Enter how many kilometers you want to travel:");
			kmTest = checkIntInput(input, str);
			v.get(v.indexOf(vehi)).updateKM(kmTest);
		} else
			System.out.println("This vehicles does not exist.");
	}
	public static void resetKMToAllVehicles() {
		for (int i = 0; i < v.size(); i++)
			v.get(i).setKm(0);
	}
	public static void setCountryToAllMarineVehicles() {
		String country;
		System.out.println("Enter cuntry:");
		country = input.next();
		for (int i = 0; i < ship.size(); i++)
			ship.get(i).setCountry(country);
	}
}
