/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
package gui;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import abstractClass.Vehicles;
import agency.DriverCarAgency;
import interfaces.IMarineVehicles;
import interfaces.IVehicles;
import parents.MarineVehicles;
import vehicles.Frigate;

public class FrigateFrame {
	private static JTextField modelTF = new JTextField("");
	private static JTextField numPassengersTF = new JTextField("");
	private static JTextField maxSpeedTF = new JTextField("");
	private static JTextField countryFlagTF = new JTextField("");
	static ButtonGroup bg=new ButtonGroup ();
	static JRadioButton radioChoose1 = new JRadioButton("With the wind");
	static JRadioButton radioChoose2= new JRadioButton("Against the wind");

	public static void addFrigateToList() {
		String windDirection;
		if(radioChoose1.isSelected())
			windDirection="With the direction of the wind";
		else
			windDirection="Against the direction of the wind";
		if(!modelTF.getText().equals("")&&!numPassengersTF.getText().equals("")&&!maxSpeedTF.getText().equals("")&&!countryFlagTF.getText().equals(""))
		{
			MarineVehicles frigate=new Frigate(modelTF.getText(),Integer.valueOf(numPassengersTF.getText()),Integer.valueOf(maxSpeedTF.getText()),windDirection,countryFlagTF.getText());
			DriverCarAgency.getV().add(frigate);
			DriverCarAgency.getShip().add(frigate);
			JOptionPane.showMessageDialog(null, "Successfully added!!!");
			resetTextField();
		}
		else
			JOptionPane.showMessageDialog(null, "Fill out the details!!!");
	}
	
	public static void resetTextField() {
		modelTF.setText("");
		numPassengersTF.setText("");
		maxSpeedTF.setText("");
		countryFlagTF.setText("");
	}

	FrigateFrame(JPanel mainPanel)
	{
		/*model - label + text filler*/
		
		JLabel modelLabel = new JLabel("Model:");
		modelLabel.setBounds(12, 98, 150, 30);
		mainPanel.add(modelLabel);
		modelTF.setBounds(165, 98, 182, 25);
		mainPanel.add(modelTF);
		
		/*number of passenger - label + text filler*/
		
		JLabel numPassengersLabel = new JLabel("Number Of Passengers:");
		numPassengersLabel.setBounds(12, 138, 150, 30);
		mainPanel.add(numPassengersLabel);
		numPassengersTF.setBounds(165, 138, 182, 25);
		mainPanel.add(numPassengersTF);
		
		/*max speed - label + text filler*/
		
		JLabel maxSpeedLabel = new JLabel("Maximum Speed:");
		maxSpeedLabel.setBounds(12, 178, 150, 30);
		mainPanel.add(maxSpeedLabel);
		maxSpeedTF.setBounds(165, 178, 182, 25);
		mainPanel.add(maxSpeedTF);
		
		/*cuntryFlag - label + text filler*/
		
		JLabel countryFlagLabel = new JLabel("Under Country Flag:");
		countryFlagLabel.setBounds(12, 218, 150, 30);
		mainPanel.add(countryFlagLabel);
		countryFlagTF.setBounds(165, 218, 182, 25);
		mainPanel.add(countryFlagTF);
		
		/*radio 1*/
		
		radioChoose1.setBounds(22, 288, 127, 25);
		mainPanel.add(radioChoose1);
		/*radio 2 */
		

		radioChoose2.setBounds(22, 328, 250, 25);
		mainPanel.add(radioChoose2);

		
		bg.add(radioChoose1);
		bg.add(radioChoose2);
		radioChoose1.setSelected(true);
		
		JLabel  typeOfRoadLabel = new JLabel("Direction:");
		typeOfRoadLabel.setBounds(12, 258, 150, 30);
		mainPanel.add(typeOfRoadLabel);
		
	}
	




}
