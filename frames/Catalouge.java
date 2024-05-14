package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import classes.*;

public class Catalouge extends JFrame implements ActionListener{
	JPanel panel;
	Color mycolor,mycolor2;
	Font myfont, myfont2;
	ImageIcon img,img2,img3,img4,img5;
	ImageIcon atlasIco_img ;
	JLabel jersy,shorts,equipment,chose,imagelabel,imagelabel2,imagelabel3,imagelabel4,imagelabel5;

	JButton catButton, favButton, lifeButton,cartButton,signupButton,jersyButton,shortsButton,equipmentButton,backButton;

	public Catalouge() {

		super("Catalogue");
		this.setSize(1000, 600);
		this.setLocation(100, 60);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);



		atlasIco_img=new ImageIcon("Images/atlasICO.png");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(atlasIco_img.getImage());


		mycolor = new Color(250, 250, 250);
		mycolor2 = new Color(0, 0, 0);
		myfont = new Font("Calibri", Font.BOLD, 18);
		myfont2 = new Font("Roboto", Font.BOLD, 38);

		jersy =new JLabel("jersy");
		jersy.setBounds(100,450,300,50);
		jersy.setBackground(mycolor);
		jersy.setForeground(mycolor2);
		jersy.setFont(myfont2);
		jersy.setOpaque(true);
		panel.add(jersy);

		shorts =new JLabel("shorts");
		shorts.setBounds(400,450,250,30);
		shorts.setBackground(mycolor);
		shorts.setForeground(mycolor2);
		shorts.setFont(myfont2);
		shorts.setOpaque(true);
		panel.add(shorts);

		equipment =new JLabel("equipments");
		equipment.setBounds(690,450,300,50);
		equipment.setBackground(mycolor);
		equipment.setForeground(mycolor2);
		equipment.setFont(myfont2);
		equipment.setOpaque(true);
		panel.add(equipment);

		chose =new JLabel("Chose your style");
		chose.setBounds(300,500,600,50);
		chose.setBackground(mycolor);
		chose.setForeground(mycolor2);
		chose.setFont(myfont2);
		chose.setOpaque(true);
		panel.add(chose);

		catButton = new JButton("CATALOGUE");
		catButton.setBounds(470, 10, 120, 20);
		catButton.setBackground(Color.WHITE);
		catButton.setEnabled(false);
		panel.add(catButton);
		
		favButton= new JButton("FAVOURATE");
		favButton.setBounds(590, 10, 120, 20);
		favButton.setBackground(Color.WHITE);
		panel.add(favButton);

		lifeButton = new JButton("LIFESTYLE");
		lifeButton.setBounds(710, 10, 120, 20);
		lifeButton.setBackground(Color.WHITE);
		panel.add(lifeButton);

		img2 = new ImageIcon("Images/cart4.png");
		cartButton = new JButton(img2);
		cartButton.setBounds(830, 0, 50, 50);
		cartButton.setBorderPainted(false);
		cartButton.setBackground(Color.WHITE);
		panel.add(cartButton);

		signupButton = new JButton("Logout");
		signupButton.setBounds(880, 10, 100, 20);
		signupButton.setBackground(Color.WHITE);
		signupButton.addActionListener(this);
		panel.add(signupButton);

		backButton =new JButton("Back");
		backButton.setBounds(5,5,80,20);
		backButton.setBackground(Color.WHITE);
		backButton.addActionListener(this);
		panel.add(backButton);



//		img = new ImageIcon("image.png");
//		img2 = new ImageIcon("cart.png");
		// img3 = new ImageIcon("Images/jersy2.png");
		img3 = new ImageIcon("Images/jersy2.png");
		// img4 = new ImageIcon("Images/equipment2.png");
		img4 = new ImageIcon("Images/equipment2.png");
		// img5 = new ImageIcon("Images/shorts2.png");
		img5 = new ImageIcon("Images/shorts2.png");


		jersyButton = new JButton(img3);
		jersyButton.setBounds(20,50,300,400);
		jersyButton.setBackground(Color.WHITE);
		jersyButton.addActionListener(this);
		panel.add(jersyButton);

		shortsButton = new JButton(img5);
		shortsButton.setBounds(340,50,300,400);
		shortsButton.setBackground(Color.WHITE);
		panel.add(shortsButton);

		equipmentButton = new JButton(img4);
		equipmentButton.setBounds(660,50,300,400);
		equipmentButton.setBackground(Color.WHITE);
		equipmentButton.addActionListener(this);
		panel.add(equipmentButton);

		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae){

		if(ae.getSource() == jersyButton){

			jersy2 j1 = new jersy2();
			j1.setVisible(true);
			this.setVisible(false);

		}
		else if(ae.getSource() == equipmentButton){

			equipments e1 = new equipments();
			e1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == backButton){

			Homepage h1 = new Homepage();
			h1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == signupButton){

			Welcome f1 = new Welcome();
			f1.setVisible(true);
			this.setVisible(false);

		}

	   
	}
}
