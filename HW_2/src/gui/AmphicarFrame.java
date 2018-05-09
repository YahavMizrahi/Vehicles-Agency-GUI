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

import agency.DriverCarAgency;

import vehicles.*;

public class AmphicarFrame {
	
	private static JTextField modelTF = new JTextField();
	private static JTextField numOfPassengerTF = new JTextField();
	private static JTextField maxSpeedTF = new JTextField();
	private static JTextField countryFlagTF = new JTextField();
	private static JTextField avgFuelTF = new JTextField();
	private static JTextField avgElTF = new JTextField();
	private static JTextField numOfWheelsTF = new JTextField();
	private static JRadioButton radioChoose1 = new JRadioButton("With the wind");
	private static JRadioButton radioChoose2= new JRadioButton("Against the wind");
	private static ButtonGroup bg1=new ButtonGroup ();
	private static JRadioButton radioChoose3 = new JRadioButton("Gravel Road");
	private static JRadioButton radioChoose4= new JRadioButton("Dirt Road");
	private static ButtonGroup bg2=new ButtonGroup ();

	
	public static void addAmphicarToList() {
		String windDirection;
		if(radioChoose1.isSelected())
			windDirection="With the direction of the wind";
		else
			windDirection="Against the direction of the wind";
		String typeOfroad;
		if(radioChoose3.isSelected())
			typeOfroad="Gravel Road";
		else
			typeOfroad="Dirt Road";
		if(!modelTF.getText().equals("")&&!maxSpeedTF.getText().equals("")&&!avgFuelTF.getText().equals("")&&!avgElTF.getText().equals(""))	
		{
			Amphicar amphicar=new Amphicar(modelTF.getText(),Integer.valueOf(numOfPassengerTF.getText()),Integer.valueOf(maxSpeedTF.getText()),windDirection,
					countryFlagTF.getText(),Integer.valueOf(numOfWheelsTF.getText()),typeOfroad,Double.valueOf(avgFuelTF.getText()),
					Double.valueOf(avgElTF.getText()));
			
			DriverCarAgency.getV().add(amphicar);
			DriverCarAgency.getShip().add(amphicar);
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
		numOfWheelsTF.setText("");
	}

	AmphicarFrame(JPanel mainPanel)
	{
		
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
		
		/*number of wheels - label + text filler*/
		JLabel numOfWheelsLabel = new JLabel("Number Of Wheels:");
		numOfWheelsLabel.setBounds(12, 338, 150, 30);
		mainPanel.add(numOfWheelsLabel);	
		numOfWheelsTF.setBounds(165, 338, 182, 25);
		mainPanel.add(numOfWheelsTF);
		
		
		JLabel directionLabel = new JLabel("Direction:");
		directionLabel.setBounds(12, 375, 150, 30);
		mainPanel.add(directionLabel);
		
		/*radio 1*/
		radioChoose1.setBounds(110, 378, 127, 25);
		mainPanel.add(radioChoose1);
		
		/*radio 2 */
		radioChoose2.setBounds(240, 378, 150, 25);
		mainPanel.add(radioChoose2);
		
		bg1.add(radioChoose1);
		bg1.add(radioChoose2);
		radioChoose1.setSelected(true);
		
		JLabel typeofroadLabel = new JLabel("Type of road:");
		typeofroadLabel.setBounds(12, 395, 150, 30);
		mainPanel.add(typeofroadLabel);

		/*radio 3*/
		radioChoose3.setBounds(110, 400, 127, 25);
		mainPanel.add(radioChoose3);
		
		/*radio 4 */
		radioChoose4.setBounds(240, 400, 150, 25);
		mainPanel.add(radioChoose4);
		
		bg2.add(radioChoose1);
		bg2.add(radioChoose2);
		radioChoose3.setSelected(true);
		
		
	}

}
