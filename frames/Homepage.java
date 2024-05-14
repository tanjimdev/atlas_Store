package frames;


import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import classes.*;


public class Homepage extends JFrame implements ActionListener{
	JPanel panel;
	Color mycolor,mycolor2,mycolor3;
	Font myfont, myFont2;
	ImageIcon img,img2;
	ImageIcon atlasIco_img ;
	JLabel imagelabel;

	JButton catButton, favButton, lifeButton,cartButton,signupButton;

	public Homepage() {

		super("Homepage");
		this.setSize(1000, 600);
		this.setLocation(100, 60);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);



		atlasIco_img=new ImageIcon("Images/atlasICO.png");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(atlasIco_img.getImage());


		mycolor = new Color(50, 250, 250);
		mycolor2 = new Color(100,100,100);
		mycolor3 =new Color(40,39,21,255);
		myfont = new Font("Poppins", Font.BOLD, 18);
		myFont2 = new Font("Calibri", Font.BOLD, 18);

		

		catButton = new JButton("CATALOGUE");
		catButton.setBounds(470, 25, 120, 20);
		catButton.setBackground(Color.WHITE);
		catButton.addActionListener(this);
		panel.add(catButton);
		
		
		
		favButton= new JButton("FAVOURATE");
		favButton.setBounds(590, 25, 120, 20);
		favButton.setBackground(Color.WHITE);
		panel.add(favButton);

		lifeButton = new JButton("LIFESTYLE");
		lifeButton.setBounds(710, 25, 120, 20);
		lifeButton.setBackground(Color.WHITE);
		panel.add(lifeButton);

		// img2 = new ImageIcon("Images/cart2.png");
		img2 = new ImageIcon("Images/cart4.png");
		cartButton = new JButton(img2);
		cartButton.setBounds(830, 10, 50, 50);
		cartButton.setBorderPainted(false);
		cartButton.setBackground(mycolor3);
		panel.add(cartButton);

		 
		signupButton = new JButton("Logout");
		signupButton.setBounds(880, 25, 100, 20);
		signupButton.setBackground(Color.WHITE);
		signupButton.addActionListener(this);
		panel.add(signupButton);

		img = new ImageIcon("Images/atlaslogo.png");
		imagelabel = new JLabel(img);
		imagelabel.setBounds(20,20,60,72);
		panel.add(imagelabel);


		// img = new ImageIcon("Images/Home.png");
		img = new ImageIcon("Images/Home.png");
		imagelabel = new JLabel(img);
		imagelabel.setBounds(0,0,1000,600);
		panel.add(imagelabel);

		
		this.add(panel);
	}

	public void actionPerformed(ActionEvent ae){

		if(ae.getSource() == catButton){

			Catalouge c1 = new Catalouge();
			c1.setVisible(true);
			this.setVisible(false);

		}
		else if(ae.getSource() == signupButton){

			Welcome f1 = new Welcome();
			f1.setVisible(true);
			this.setVisible(false);

		}
	 
	
	}

}
