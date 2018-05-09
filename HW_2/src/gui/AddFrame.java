/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AddFrame extends JFrame 
{

	private JPanel mainPanel;
	
	/*array for all owend Images of the cars*/
	
	/*radio buttons +ImageIcon -for images option*/
	private JRadioButton radioChoose1 ;
	private ImageIcon icon1;
	private JRadioButton radioChoose2;
	private ImageIcon icon2;
	private JRadioButton radioChoose3;
	private ImageIcon icon3;	
	private JRadioButton radioChoose4;
	private ImageIcon icon4;
	private MenuFrame menuFrame;
	private CrewsFrame crewsFrame;
	private GliderSpywareFrame gliderSpyWareFrame;
	private GliderGameFrame gameGliderFrame;
	private FrigateFrame frigateFrame;
	private JeepFrame jeepFrame;
	private AmphicarFrame amphicarFrame;
	private BicycleFrame bicycleFrame;

	
	AddFrame()
	{
		this.setTitle("The Agency-Add Vehicles");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Photos\\icon.jpeg"));
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		mainPanel=new JPanel();
		mainPanel.setLayout(null);
		
		JLabel welcomeLabel=new JLabel();
		welcomeLabel.setBounds(15, 80, 767,558);
		ImageIcon welcomeImage=new ImageIcon("src\\Photos\\Welcome.png");
		welcomeLabel.setIcon(welcomeImage);
		mainPanel.add(welcomeLabel);
		
		JButton addButton=new JButton("Add Vehicles") ;
		addButton.setBounds(12, 700, 150, 36);
		mainPanel.add(addButton);	
		JButton nextButton=new JButton("Next") ;
		
		/*radio 1*/
		radioChoose1 = new JRadioButton();
		icon1=new ImageIcon();
		radioChoose1.setBounds(435, 40, 127, 25);
		JLabel image1=new JLabel();
		image1.setBounds(435, 70, 290, 170);
		
		/*radio 2*/
		radioChoose2 = new JRadioButton();
		icon2=new ImageIcon();
		radioChoose2.setBounds(435, 240, 127, 25);
		JLabel image2=new JLabel();
		image2.setBounds(435, 270, 290, 170);
		
		/*radio 3*/
		radioChoose3 = new JRadioButton();
		icon3=new ImageIcon();	
		radioChoose3.setBounds(435, 440, 127, 25);
		JLabel image3=new JLabel();
		image3.setBounds(435, 470, 290, 170);
		
		/*radio 4*/
		radioChoose4= new JRadioButton("Choose Photo from your computer");
		radioChoose4.setBounds(22, 440, 250, 25);
		JLabel image4=new JLabel();
		image4.setBounds(22, 470, 290, 170);
		
		ButtonGroup bg=new ButtonGroup ();
		bg.add(radioChoose1);
		bg.add(radioChoose2);
		bg.add(radioChoose3);
		bg.add(radioChoose4);
		radioChoose1.setSelected(true);

		JComboBox<String> box=new JComboBox<String>();
		box.setBounds(12, 13, 150, 36);
		box.addItem("Vehicles");
		box.addItem("Jeep");
		box.addItem("Bicycle");
		box.addItem("Glider-Game");
		box.addItem("Glider-Spyware");
		box.addItem("Frigate");
		box.addItem("Crews");
		box.addItem("Amphicar");
		
		box.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				Object selected=box.getSelectedItem();
				mainPanel.removeAll();
				mainPanel.add(box);
				mainPanel.add(addButton);
				mainPanel.add(nextButton);
				if(selected.equals("Frigate")) {
					frigateFrame=new FrigateFrame(mainPanel);
					frigateFrame.resetTextField();
					changeImages("Frigate");
				}
				else if(selected.equals("Glider-Game")) {
					gameGliderFrame=new GliderGameFrame(mainPanel);
					changeImages("Glider-Game");
				}
				else if(selected.equals("Crews")) {
					crewsFrame=new CrewsFrame(mainPanel);
					crewsFrame.resetTextField();
					changeImages("Crews");
				}
				else if(selected.equals("Jeep")) {
					jeepFrame=new JeepFrame(mainPanel);
					jeepFrame.resetTextField();
					changeImages("Jeep");
				}
				else if(selected.equals("Amphicar")) {
					amphicarFrame=new AmphicarFrame(mainPanel);
					amphicarFrame.resetTextField();
					changeImages("Amphicar");
				}
				else if(selected.equals("Bicycle"))
				{
					bicycleFrame=new BicycleFrame(mainPanel);
					bicycleFrame.resetTextField();
					changeImages("Bicycle");
				}
				else if(selected.equals("Glider-Spyware"))
				{
					gliderSpyWareFrame=new GliderSpywareFrame(mainPanel);
					gliderSpyWareFrame.resetTextField();
					changeImages("Glider-Spyware");
				}
				
				/*the main JRadio */
				image1.setIcon(icon1);
				image2.setIcon(icon2);
				image3.setIcon(icon3);
				mainPanel.add(radioChoose1);
				mainPanel.add(image1);
				mainPanel.add(radioChoose2);
				mainPanel.add(image2);
				mainPanel.add(radioChoose3);
				mainPanel.add(image3);
				mainPanel.add(radioChoose4);
				
				radioChoose4.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) {
						JFileChooser fc = new JFileChooser();
						fc.addChoosableFileFilter(new FileNameExtensionFilter("png","PNG","GIF","gif","jpeg","JPEG"));
						fc.setAcceptAllFileFilterUsed(false);
						int returnVal = fc.showOpenDialog(new JFrame());
				        if (returnVal == JFileChooser.APPROVE_OPTION) {
				    		icon4=new ImageIcon(((new ImageIcon(fc.getSelectedFile().getPath()).getImage()).getScaledInstance(290, 174, java.awt.Image.SCALE_SMOOTH)));
				            image4.setIcon(icon4);
				            mainPanel.add(image4);
							mainPanel.repaint();
				        }}});
				mainPanel.repaint();
			}});
		

		addButton.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				try {
					Object selected=box.getSelectedItem();
					if(selected.equals("Jeep"))
						JeepFrame.addJeepToList();
					else if(selected.equals("Bicycle"))
						BicycleFrame.addBicycleToList();
					else if(selected.equals("Frigate"))
						FrigateFrame.addFrigateToList();
					else if(selected.equals("Glider-Game"))
						GliderGameFrame.addGliderGameToList();
					else if (selected.equals("Glider-Spyware"))
						GliderSpywareFrame.addGliderSpywareToList();
					else if(selected.equals("Crews")) 
						CrewsFrame.addCrewsToList();
					else if(selected.equals("Amphicar"))
						AmphicarFrame.addAmphicarToList();
					CheckRadioButtons();
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		
		nextButton.setBounds(222, 700, 150, 36);
		nextButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
				menuFrame=new MenuFrame();
				menuFrame.setVisible(true);
				setVisible(false);
				}
				catch(Exception e3) {
				System.out.println(e3);
				}
			}
		});
		mainPanel.add(nextButton);
		mainPanel.add(box);
		this.add(mainPanel);
	}
	
	public void CheckRadioButtons() {
		ImageIcon icon;
		if(radioChoose1.isSelected())
		{
			icon=new ImageIcon(icon1.getImage());
			DriverCarAgencyGui.addImage(icon);
		}
		else if(radioChoose2.isSelected())
			{
			icon=new ImageIcon(icon2.getImage());
			DriverCarAgencyGui.addImage(icon);
			}
		else if(radioChoose3.isSelected())
		{
			icon=new ImageIcon(icon3.getImage());
			DriverCarAgencyGui.addImage(icon);
		}
		else if(radioChoose4.isSelected())
		{
			DriverCarAgencyGui.addImage(icon4);
		}
	}
	
	/*general mathod for ImageIcon from the frame*/
	public void changeImages(String nameOfVehicleKind)
	{
			String str="src\\Photos\\"+nameOfVehicleKind+"1.jpeg";
			icon1.setImage(new ImageIcon(str).getImage());
			str="src\\Photos\\"+nameOfVehicleKind+"2.jpeg";
			icon2.setImage(new ImageIcon(str).getImage());
			str="src\\Photos\\"+nameOfVehicleKind+"3.jpeg";
			icon3.setImage(new ImageIcon(str).getImage());
	}
	

}

