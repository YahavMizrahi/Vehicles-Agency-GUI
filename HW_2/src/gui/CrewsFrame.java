/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
package gui;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import agency.DriverCarAgency;
import parents.MarineVehicles;
import vehicles.ShipCrews;

public class CrewsFrame {

	private static JTextField modelTF = new JTextField();
	private static JTextField numOfPassengerTF = new JTextField();
	private static JTextField maxSpeedTF = new JTextField();
	private static JTextField countryFlagTF = new JTextField();
	private static JTextField avgFuelTF = new JTextField();
	private static JTextField avgElTF = new JTextField();
	
	public static void addCrewsToList() {
		if(!modelTF.getText().equals("")&&!numOfPassengerTF.getText().equals("")&&!maxSpeedTF.getText().equals("")&&!countryFlagTF.getText().equals("")&&
				!avgFuelTF.getText().equals("")&&!avgElTF.getText().equals(""))
		{
			MarineVehicles crews=new ShipCrews(modelTF.getText(), Integer.valueOf(numOfPassengerTF.getText()), Integer.valueOf(maxSpeedTF.getText()),
					countryFlagTF.getText(),Double.valueOf(avgFuelTF.getText()),Double.valueOf(avgElTF.getText()));
			DriverCarAgency.getShip().add(crews);
			DriverCarAgency.getV().add(crews);
			JOptionPane.showMessageDialog(null, "Successfully added!!!");
			resetTextField();
		}
		else
			JOptionPane.showMessageDialog(null, "Fill out the details!!!");
	}
	
	public static void resetTextField() {
		modelTF.setText("");
		numOfPassengerTF.setText("");
		maxSpeedTF.setText("");
		countryFlagTF.setText("");
		avgFuelTF.setText("");
		avgElTF.setText("");
	}

public CrewsFrame(JPanel mainPanel) {
		/*model - label + text filler*/
		
		JLabel modelLabel = new JLabel("Model:");
		modelLabel.setBounds(12, 98, 150, 30);
		mainPanel.add(modelLabel);
		modelTF.setBounds(165, 98, 182, 25);
		mainPanel.add(modelTF);
		
		/*number of passengers - label + text filler*/
		
		JLabel NumOfPassengerLabel = new JLabel("Number Of Passengers:");
		NumOfPassengerLabel.setBounds(12, 138, 150, 30);
		mainPanel.add(NumOfPassengerLabel);
		numOfPassengerTF.setBounds(165, 138, 182, 25);
		mainPanel.add(numOfPassengerTF);
		
		/*maximum speed - label + text filler*/
		
		JLabel maxSpeedLabel = new JLabel("Maximum Speed:");
		maxSpeedLabel.setBounds(12, 178, 150, 30);
		mainPanel.add(maxSpeedLabel);
		maxSpeedTF.setBounds(165, 178, 182, 25);
		mainPanel.add(maxSpeedTF);
		
		/*type of country flag - label + text filler*/
		
		JLabel  countryFlagLabel = new JLabel("Country Flag:");
		countryFlagLabel.setBounds(12, 218, 150, 30);
		mainPanel.add(countryFlagLabel);
		countryFlagTF.setBounds(165, 218, 182, 25);
		mainPanel.add(countryFlagTF);
		
		/*average fuel - label + text filler*/
		JLabel avgFuelLabel = new JLabel("Average Fuel:");
		avgFuelLabel.setBounds(12, 258, 150, 30);
		mainPanel.add(avgFuelLabel);
		avgFuelTF.setBounds(165, 258, 182, 25);
		mainPanel.add(avgFuelTF);
		
		/*average engine life - label + text filler*/
		JLabel avgElLabel = new JLabel("Average Engine Life:");
		avgElLabel.setBounds(12, 298, 150, 30);
		mainPanel.add(avgElLabel);
		avgElTF.setBounds(165, 298, 182, 25);
		mainPanel.add(avgElTF);
		//return mainPanel;
	}

}
