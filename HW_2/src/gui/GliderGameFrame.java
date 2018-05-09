/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
package gui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import agency.DriverCarAgency;
import vehicles.GliderGame;

public class GliderGameFrame {

	public static void addGliderGameToList() {
		GliderGame gliderGame=new GliderGame();
		DriverCarAgency.getV().add(gliderGame);
		JOptionPane.showMessageDialog(null, "Successfully added!!!");
	}
	GliderGameFrame(JPanel mainPanel)
	{
		/*source power - label + text filler*/
	}
}
