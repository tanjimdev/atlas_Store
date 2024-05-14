package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import classes.*;

public class jersy extends JFrame {
	JPanel panel;
	Color mycolor,mycolor2;
	Font myfont, myfont2;
	ImageIcon img,img2,img3,img4,img5;
	ImageIcon atlasIco_img ;
	JLabel Home,Away,third,chose,imagelabel,imagelabel2,imagelabel3,imagelabel4,imagelabel5;

	JButton catButton, favButton, lifeButton,cartButton,signupButton,homeButton,awayButton,thirdButton;

	public jersy() {

		super("jersy");
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

		catButton = new JButton("CATALOGUE");
		catButton.setBounds(400, 10, 120, 20);
		catButton.setBackground(Color.WHITE);
		panel.add(catButton);
		
		favButton= new JButton("FAVOURATE");
		favButton.setBounds(520, 10, 120, 20);
		favButton.setBackground(Color.WHITE);
		panel.add(favButton);

		lifeButton = new JButton("LIFESTYLE");
		lifeButton.setBounds(640, 10, 120, 20);
		lifeButton.setBackground(Color.WHITE);
		panel.add(lifeButton);

//		cartButton = new JButton(img2);
		cartButton = new JButton("CART");
		cartButton.setBounds(760, 10, 120, 20);
		cartButton.setBackground(Color.WHITE);
		cartButton.setOpaque(true);
		panel.add(cartButton);

		signupButton = new JButton("SIGN UP");
		signupButton.setBounds(880, 10, 100, 20);
		signupButton.setBackground(Color.CYAN);
		panel.add(signupButton);


//		img = new ImageIcon("image.png");
//		img2 = new ImageIcon("cart.png");
		img3 = new ImageIcon("Images/home.png");
		img4 = new ImageIcon("Images/away.png");
		img5 = new ImageIcon("Images/3rd.png");


		homeButton = new JButton(img3);
		homeButton.setBounds(20,40,300,400);
		homeButton.setBackground(Color.WHITE);
		panel.add(homeButton);

		awayButton = new JButton(img4);
		awayButton.setBounds(340,40,300,400);
		awayButton.setBackground(Color.WHITE);
		panel.add(awayButton);

		thirdButton = new JButton(img5);
		thirdButton.setBounds(660,40,300,400);
		thirdButton.setBackground(Color.WHITE);
		panel.add(thirdButton);

		this.add(panel);
	}
	   
}
