/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
package gui;
import vehicles.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import agency.DriverCarAgency;


public class JeepFrame extends AddFrame{
	
	private static JTextField modelTF = new JTextField();
	private static JTextField maxSpeedTF = new JTextField();
	private static JTextField avgFuelTF = new JTextField();
	private static JTextField avgElTF = new JTextField();

	
	public static void addJeepToList(/*ArrayList<IVehicles> vehicle*/)
	{
		if(!modelTF.getText().equals("")&&!maxSpeedTF.getText().equals("")&&!avgElTF.getText().equals("")&&!avgFuelTF.getText().equals(""))
		{
			DriverCarAgency.getV().add(new Jeep(modelTF.getText(),Integer.valueOf(maxSpeedTF.getText()),Integer.valueOf(avgFuelTF.getText()),Integer.valueOf(avgElTF.getText())));
			JOptionPane.showMessageDialog(null, "Successfully added!!!");
			resetTextField();
		}
		else
			JOptionPane.showMessageDialog(null, "Fill out the details!!!");
	}

	public static void resetTextField() {
		modelTF.setText("");
		maxSpeedTF.setText("");
		avgFuelTF.setText("");
		avgElTF.setText("");
	}
	
	JeepFrame(JPanel mainPanel) {
		
		/*model - label + text filler*/
		JLabel modelLabel = new JLabel("Model:");
		modelLabel.setBounds(12, 98, 150, 30);
		mainPanel.add(modelLabel);
		modelTF.setBounds(165, 98, 182, 25);
		mainPanel.add(modelTF);
		
		/*max speed - label+ text filler */
		JLabel maxSpeedLabel = new JLabel("Maximum Speed:");
		maxSpeedLabel.setBounds(12, 138, 150, 30);
		mainPanel.add(maxSpeedLabel);
		maxSpeedTF.setBounds(165, 138, 182, 25);
		mainPanel.add(maxSpeedTF);
		
		/*average fuel - label + text filler*/
		JLabel avgFuelLabel = new JLabel("Average Fuel:");
		avgFuelLabel.setBounds(12, 178, 150, 30);
		mainPanel.add(avgFuelLabel);
		avgFuelTF.setBounds(165, 178, 182, 25);
		mainPanel.add(avgFuelTF);
		
		/*average engine life - label + text filler*/
		JLabel avgElLabel = new JLabel("Average Engine Life:");
		avgElLabel.setBounds(12, 218, 150, 30);
		mainPanel.add(avgElLabel);
		avgElTF.setBounds(165, 218, 182, 25);
		mainPanel.add(avgElTF);
		
		
	}

}
