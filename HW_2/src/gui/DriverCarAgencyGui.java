/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
package gui;



import java.util.ArrayList;

import javax.swing.*;


public class DriverCarAgencyGui extends JFrame {

	private static ArrayList<ImageIcon> imageOwendVehicles=new ArrayList<ImageIcon>();
		
	public static ArrayList<ImageIcon> getImageOwendVehicles() {
		return imageOwendVehicles;
	}

	public static void setImageOwendVehicles(ArrayList<ImageIcon> imageOwendVehicles) {
		DriverCarAgencyGui.imageOwendVehicles = imageOwendVehicles;
	}

	public static void addImage(ImageIcon icon) {
		imageOwendVehicles.add(icon);
	}
	public static void main(String[] args) {
		AddFrame addFrame=new AddFrame();
		addFrame.setVisible(true);
	}

}
	
