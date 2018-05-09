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
import vehicles.GliderSpyware;

public class GliderSpywareFrame {
	
	static JTextField SourcePowerTF = new JTextField();

	public static void addGliderSpywareToList() {
		if(!SourcePowerTF.getText().equals("")) {
			DriverCarAgency.getV().add(new GliderSpyware(SourcePowerTF.getText()));
			JOptionPane.showMessageDialog(null, "Successfully added!!!");
			resetTextField();
		}
		else
			JOptionPane.showMessageDialog(null, "Fill out the details!!!");
	}
	public static void resetTextField() {
		SourcePowerTF.setText("");
	}
	
	GliderSpywareFrame(JPanel mainPanel)
	{
		/*source power - label + text filler*/
		JLabel SourcePowerLabel = new JLabel("Source Power:");
		SourcePowerLabel.setBounds(12, 98, 150, 30);
		mainPanel.add(SourcePowerLabel);
		SourcePowerTF.setBounds(165, 98, 182, 25);
		mainPanel.add(SourcePowerTF);
	}
}
