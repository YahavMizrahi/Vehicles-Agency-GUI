/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
package gui;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import agency.DriverCarAgency;
import interfaces.IMarineVehicles;


public class FlagFrame extends JFrame {
	
	private JRadioButton []flagRadioButton;
	private ImageIcon []flagIcon;
	private JLabel []flagLabel;
	private JPanel flagPanel;
	private ButtonGroup bg;
	private JButton changeButton;
	
	FlagFrame(){
		this.setTitle("The Agency-Flag");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Photos\\icon.jpeg"));
		this.setSize(560, 230);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		flagPanel=new JPanel();
		flagPanel.setLayout(null);
		
		flagRadioButton=new JRadioButton[7];
		bg=new ButtonGroup ();
		flagLabel=new JLabel[7];
		flagIcon=new ImageIcon[7];
		changeButton=new JButton("OK");
		changeButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				getSelectRadioButton(DriverCarAgency.getShip());
				setVisible(false);
				for(int i=0;i<MenuFrame.getRadioButtonArray().size();i++)
					MenuFrame.getRadioButtonArray().get(i).setToolTipText(DriverCarAgency.getV().get(i).toString());


			}
		});

		for(int i=0,j=0;i<7;i++) {
			flagLabel[i]=new JLabel();
			flagIcon[i]=new ImageIcon();
			if(i==0) {
				flagRadioButton[i]=new JRadioButton("Israel");
				flagIcon[i].setImage(new ImageIcon("src\\Photos\\Israel.jpeg").getImage());
			}
			else if(i==1){	
				flagRadioButton[i]=new JRadioButton("USA");
				flagIcon[i].setImage(new ImageIcon("src\\Photos\\USA.jpeg").getImage());	
			}
			else if(i==2) {
				flagRadioButton[i]=new JRadioButton("Germany");
				flagIcon[i].setImage(new ImageIcon("src\\Photos\\Germany.jpeg").getImage());
			}
			else if(i==3) {
				flagRadioButton[i]=new JRadioButton("Italy");
				flagIcon[i].setImage(new ImageIcon("src\\Photos\\Italy.jpeg").getImage());
			}
			else if(i==4) {
				flagRadioButton[i]=new JRadioButton("Greece");
				flagIcon[i].setImage(new ImageIcon("src\\Photos\\Greece.jpeg").getImage());
			}
			else if(i==5) {
				flagRadioButton[i]=new JRadioButton("Somalia");
				flagIcon[i].setImage(new ImageIcon("src\\Photos\\Somalia.jpeg").getImage());
			}
			else if(i==6) {
				flagRadioButton[i]=new JRadioButton("Pirate");
				flagIcon[i].setImage(new ImageIcon("src\\Photos\\Pirate.jpeg").getImage());
				flagPanel.add(changeButton);
			}
			if(i%2!=0) {
				flagRadioButton[i].setBounds(12+j*70,90, 100, 25);
				flagLabel[i].setBounds(20+j*70, 118, 50, 36);
				changeButton.setBounds(20+j*100, 110, 100, 50);

				j=j+2;
			}
			else {
				flagRadioButton[i].setBounds(12+i*70,12, 100, 25);
				flagLabel[i].setBounds(20+i*70, 40, 50, 36);
			}
			flagPanel.add(flagRadioButton[i]);
			flagLabel[i].setIcon(flagIcon[i]);
			flagPanel.add(flagLabel[i]);
			bg.add(flagRadioButton[i]);
		}
		flagRadioButton[0].setSelected(true);
		
		
		this.add(flagPanel);
	}

	public void getSelectRadioButton(ArrayList<IMarineVehicles> arrayList) {
		if(flagRadioButton[0].isSelected())
			for(int i=0;i<arrayList.size();i++)
				DriverCarAgency.getShip().get(i).setCountry("Israel");
		if(flagRadioButton[1].isSelected())
			for(int i=0;i<arrayList.size();i++)
				DriverCarAgency.getShip().get(i).setCountry("USA");
		if(flagRadioButton[2].isSelected())
			for(int i=0;i<arrayList.size();i++)
				DriverCarAgency.getShip().get(i).setCountry("Germany");
		if(flagRadioButton[3].isSelected())
			for(int i=0;i<arrayList.size();i++)
				DriverCarAgency.getShip().get(i).setCountry("Italy");
		if(flagRadioButton[4].isSelected())
			for(int i=0;i<arrayList.size();i++)
				DriverCarAgency.getShip().get(i).setCountry("Greece");
		if(flagRadioButton[5].isSelected())
			for(int i=0;i<arrayList.size();i++)
				DriverCarAgency.getShip().get(i).setCountry("Somalia");
		if(flagRadioButton[6].isSelected())
			for(int i=0;i<arrayList.size();i++)
				DriverCarAgency.getShip().get(i).setCountry("Pirate");
	}
	
}
