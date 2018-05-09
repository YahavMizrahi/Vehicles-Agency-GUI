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
import vehicles.Bicycle;

public class BicycleFrame {

	private static JTextField modelTF = new JTextField();
	private static JTextField numOfPassengerTF = new JTextField();
	private static JTextField maxSpeedTF = new JTextField();
	private static ButtonGroup bg=new ButtonGroup ();
	private static JRadioButton radioChoose1 = new JRadioButton("Gravel Road");
	private static JRadioButton radioChoose2= new JRadioButton("Dirt Road");
	
	public static void addBicycleToList(){
		String typeOfroad;
		if(radioChoose1.isSelected())
			typeOfroad="Gravel Road";
		else
			typeOfroad="Dirt Road";
		if(!modelTF.getText().equals("")&&!maxSpeedTF.getText().equals("")&&!numOfPassengerTF.getText().equals("")) {
			DriverCarAgency.getV().add(new Bicycle(modelTF.getText(),Integer.valueOf(maxSpeedTF.getText()),Integer.valueOf(numOfPassengerTF.getText()),typeOfroad));
			JOptionPane.showMessageDialog(null, "Successfully added!!!");
			resetTextField();
		}
		else
			JOptionPane.showMessageDialog(null, "Fill out the details!!!");
	}

	public static void resetTextField(){
		modelTF.setText("");
		numOfPassengerTF.setText("");
		maxSpeedTF.setText("");
	}
	
	BicycleFrame(JPanel mainPanel) {
		
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
		
		/*type of road - label + text filler*/
		
		/*radio 1*/
		
		radioChoose1.setBounds(22, 258, 127, 25);
		mainPanel.add(radioChoose1);
		/*radio 2 */
		

		radioChoose2.setBounds(22, 298, 250, 25);
		mainPanel.add(radioChoose2);

		
		bg.add(radioChoose1);
		bg.add(radioChoose2);
		radioChoose1.setSelected(true);
		
		JLabel  typeOfRoadLabel = new JLabel("Type Of Road:");
		typeOfRoadLabel.setBounds(12, 218, 150, 30);
		mainPanel.add(typeOfRoadLabel);
	
	}
}
