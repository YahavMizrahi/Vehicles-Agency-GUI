/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


import agency.DriverCarAgency;

public class MenuFrame extends JFrame {

	private AddFrame addFrame;
	private JButton exitButton;
	private JButton buyButton;
	private JButton testDriveButton;
	private FlagFrame flagFrame;
	private JButton resetKMButton;
	private JButton addVehicleButton;
	private JButton changeFlagButton;
	private JPanel buttonPanel;
	private JPanel picPanel;
	private JScrollPane picScroll;
	private static ArrayList< JRadioButton> radioButtonArray;
	public static ArrayList<JRadioButton> getRadioButtonArray() {
		return radioButtonArray;
	}

	private ButtonGroup bg;
	
	MenuFrame(){

		this.setTitle("The Agency-Menu");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Photos\\icon.jpeg"));
		this.setSize(666,550);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		buttonPanel=new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setBounds(0,425,666,120);
		
		picPanel=new JPanel();
		picPanel.setBounds(0, 0, 580, 420);
		picPanel.setLayout(new GridLayout(2,4,10,10));
		
		JPanel borderPanel=new JPanel();
		borderPanel.add(picPanel,BorderLayout.CENTER);
		
		picScroll=new JScrollPane(borderPanel);
		picScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		picScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		picScroll.setBounds(0, 0, 666, 410);
		
		radioButtonArray=new ArrayList<JRadioButton>();
		bg=new ButtonGroup ();		
		addFrame=new AddFrame();
		
		if(DriverCarAgency.getV().size()>0)
			updateRadioButtonImage();
		
		exitButton=new JButton("Exit") ;
		exitButton.setBounds(450, 40, 150, 36);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		buttonPanel.add(exitButton);
		
		
		
		buyButton=new JButton("Buy Vehicles") ;
		buyButton.setBounds(50, 0, 150, 36);
		buyButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(DriverCarAgency.getV().size()==0)
					JOptionPane.showMessageDialog(null, "There are no cars in the agency!!!");
				else
					for(int i=0;i<DriverCarAgency.getV().size();i++)
					{
						if(radioButtonArray.get(i).isSelected())
						{
							DriverCarAgency.getV().remove(i);
							DriverCarAgencyGui.getImageOwendVehicles().remove(i);
							picPanel.remove(radioButtonArray.get(i));
							radioButtonArray.remove(i);
							JOptionPane.showMessageDialog(null, "Enjoy your new vehicles!!!");

							break;
						}
					}
				picPanel.revalidate();
				picPanel.repaint();
			}
		});
		buttonPanel.add(buyButton);


		testDriveButton=new JButton("Test Drive") ;
		testDriveButton.setBounds(250, 0, 150, 36);
		testDriveButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(DriverCarAgency.getV().size()==0)
					JOptionPane.showMessageDialog(null, "There are no cars in the agency!!!");
				else
					for(int i=0;i<DriverCarAgency.getV().size();i++)
					{
						if(radioButtonArray.get(i).isSelected()) {
							try {
							int km=Integer.valueOf(JOptionPane.showInputDialog("Enter how far is the test drive?",0));	
							DriverCarAgency.getV().get(i).setKm(km);
							}
							catch (Exception e1){
								JOptionPane.showMessageDialog(null,e1);

							}
							radioButtonArray.get(i).setToolTipText(DriverCarAgency.getV().get(i).toString());
							break;			
							}
					}
						
			}});
		buttonPanel.add(testDriveButton);
		
		resetKMButton=new JButton("Reset KM") ;
		resetKMButton.setBounds(50, 40, 150, 36);
		resetKMButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(DriverCarAgency.getV().size()==0)
					JOptionPane.showMessageDialog(null, "There are no cars in the agency!!!");
				else {
					int yesORno=JOptionPane.YES_NO_OPTION;
					JOptionPane.showConfirmDialog(null,"Are you sure you want reast Km for all vehicles?");
					if(yesORno==JOptionPane.YES_OPTION)
						for(int i=0;i<DriverCarAgency.getV().size();i++) {
							radioButtonArray.get(i).setToolTipText(DriverCarAgency.getV().get(i).toString());
						DriverCarAgency.resetKMToAllVehicles();	
						}
					}
			}
		});
		buttonPanel.add(resetKMButton);
		
		flagFrame=new FlagFrame();
		changeFlagButton=new JButton("Change Flag") ;
		changeFlagButton.setBounds(250, 40, 150, 36);
		changeFlagButton.addActionListener(new ActionListener() {
			
	
			public void actionPerformed(ActionEvent e) {
				if(DriverCarAgency.getV().size()==0)
					JOptionPane.showMessageDialog(null, "There are no cars in the agency!!!");
				else 
					flagFrame.setVisible(true);		
				for(int i=0;i<DriverCarAgency.getV().size();i++) 
					radioButtonArray.get(i).setToolTipText(DriverCarAgency.getV().get(i).toString());
			}
		});
		buttonPanel.add(changeFlagButton);
			
		addVehicleButton=new JButton("Add Vehicle") ;
		addVehicleButton.setBounds(450, 0, 150, 36);
		addVehicleButton.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				addFrame.setVisible(true);
				dispose();
			}
		});
		buttonPanel.add(addVehicleButton);

		invalidate();
		validate();
		repaint();
		this.add(picScroll);
		this.add(buttonPanel);

	}
	
	public void updateRadioButtonImage() {
			for(int i=0;i<DriverCarAgency.getV().size();i++)
			{
				ImageIcon image=new ImageIcon(DriverCarAgencyGui.getImageOwendVehicles().get(i).getImage());
				radioButtonArray.add(new JRadioButton(image));
				picPanel.add(radioButtonArray.get(i));
				bg.add(radioButtonArray.get(i));
				radioButtonArray.get(i).setBorderPainted(true);
				radioButtonArray.get(i).setToolTipText(DriverCarAgency.getV().get(i).toString());
			}

	}
}
