package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import classes.*;

public class jersy2 extends JFrame implements ActionListener{
	JPanel panel;
	Color mycolor,mycolor2,mycolor3;
	Font myfont, myfont2;
	ImageIcon img,img2,img3,img4,img5;
	ImageIcon atlasIco_img ;
	JLabel Home,Away,third,chose,imagelabel,imagelabel2,imagelabel3,imagelabel4,imagelabel5;

	JButton catButton, favButton, lifeButton,cartButton,signupButton,homeButton,awayButton,thirdButton,backButton;

	public jersy2() {

		super("jersy2");
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
		mycolor3 =new Color(40,39,21,255);
		myfont = new Font("Calibri", Font.BOLD, 18);
		myfont2 = new Font("Copperplate Gothic Light", Font.BOLD, 38);

		Home =new JLabel("HOME");
		Home.setBounds(100,450,300,30);
		Home.setBackground(mycolor);
		Home.setForeground(mycolor2);
		Home.setFont(myfont2);
		Home.setOpaque(true);
		panel.add(Home);

		Away =new JLabel("AWAY");
		Away.setBounds(400,450,250,30);
		Away.setBackground(mycolor);
		Away.setForeground(mycolor2);
		Away.setFont(myfont2);
		Away.setOpaque(true);
		panel.add(Away);

		third =new JLabel("THIRD KIT");
		third.setBounds(690,450,300,30);
		third.setBackground(mycolor);
		third.setForeground(mycolor2);
		third.setFont(myfont2);
		third.setOpaque(true);
		panel.add(third);

		chose =new JLabel("Chose your jersy");
		chose.setBounds(300,500,600,50);
		chose.setBackground(mycolor);
		chose.setForeground(mycolor2);
		chose.setFont(myfont2);
		chose.setOpaque(true);
		panel.add(chose);

		catButton = new JButton("Jersy");
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

		backButton =new JButton("Back");
		backButton.setBounds(5,5,80,20);
		backButton.setBackground(Color.WHITE);
		backButton.addActionListener(this);
		panel.add(backButton);

		img2 = new ImageIcon("Images/cart4.png");
		cartButton = new JButton(img2);
		cartButton.setBounds(830, 0, 50, 50);
		cartButton.setBackground(Color.white);
		panel.add(cartButton);

		signupButton = new JButton("Logout");
		signupButton.setBounds(880, 10, 100, 20);
		signupButton.setBackground(Color.WHITE);
		signupButton.addActionListener(this);
		panel.add(signupButton);


//		img = new ImageIcon("image.png");
//		img2 = new ImageIcon("cart.png");
		img3 = new ImageIcon("Images/homej.png");
		img4 = new ImageIcon("Images/away.png");
		img5 = new ImageIcon("Images/3rd.png");


		homeButton = new JButton(img3);
		homeButton.setBounds(20,50,300,400);
		homeButton.setBackground(Color.WHITE);
		homeButton.addActionListener(this);
		panel.add(homeButton);

		awayButton = new JButton(img4);
		awayButton.setBounds(340,50,300,400);
		awayButton.setBackground(Color.WHITE);
		awayButton.addActionListener(this);
		panel.add(awayButton);

		thirdButton = new JButton(img5);
		thirdButton.setBounds(660,50,300,400);
		thirdButton.setBackground(Color.WHITE);
		thirdButton.addActionListener(this);
		panel.add(thirdButton);

		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == backButton){

			Catalouge c1 = new Catalouge();
			c1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == homeButton){

			jersyhome j1 = new jersyhome();
			j1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == awayButton){

			jersyaway j1 = new jersyaway();
			j1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == thirdButton){

			jersythird j1 = new jersythird();
			j1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == signupButton){

			Welcome f1 = new Welcome();
			f1.setVisible(true);
			this.setVisible(false);

		}
	}
	   
}
