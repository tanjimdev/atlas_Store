package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import classes.*;

public class Welcome extends JFrame implements ActionListener {
	JPanel panel;
	Color mycolor, mycolor2,mycolor3;
	Font myfont, myfont2,myfont3;
	ImageIcon img,img2;

	JLabel Welcome,Ftbl,plz,imagelabel;

	JButton admnButton, usrButton;

	public Welcome() {

		super("Welcome");
		this.setSize(1000, 600);
		this.setLocation(100, 60);
		
		
		panel=new JPanel();
		panel.setLayout(null);
		//panel.setBackground(mycolor2);
		// frame.setLocationRelativeTo(null);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//******************************** */

		//must have every class

		this.setLocationRelativeTo(null);
		this.setResizable(false);

		mycolor = new Color(255, 255, 255);
		mycolor2 = new Color(115,251,253);
		mycolor3 = new Color(0,0,0);
		myfont = new Font("Algerian", Font.BOLD, 50);
		myfont2 = new Font("Algerian", Font.PLAIN, 25);
		myfont3 = new Font("Berlin Sans FB Demi", Font.BOLD, 30);

		
		Welcome =new JLabel("WELCOME TO");
		Welcome.setBounds(550,260,380,70);
		//Welcome.setBackground(mycolor);
		Welcome.setForeground(mycolor);
		Welcome.setFont(myfont);
//		Welcome.setOpaque(true);
		panel.add(Welcome);

		Ftbl=new JLabel("Atlas Sports");
		Ftbl.setBounds(580,320,650,50);
		Ftbl.setForeground(mycolor);
		Ftbl.setFont(myfont);
//		Ftbl.setOpaque(true);
		panel.add(Ftbl);

		plz=new JLabel(" Please Login");
		plz.setBounds(590,400,185,50);
		plz.setForeground(mycolor3);
		plz.setFont(myfont2);
		plz.setOpaque(true);
		panel.add(plz);


		

		admnButton = new JButton("ADMIN");
		admnButton.setBounds(550, 480, 120, 50);
		admnButton.setBackground(Color.WHITE);
		admnButton.addActionListener(this);
		panel.add(admnButton);
		
		
		
		usrButton= new JButton("USER");
		usrButton.setBounds(700, 480, 120, 50);
		usrButton.setBackground(Color.WHITE);
		usrButton.setBorder(null);
		usrButton.addActionListener(this);
		panel.add(usrButton);


		img2 = new ImageIcon("Images/atlas.png");
		imagelabel = new JLabel(img2);
		imagelabel.setBounds(330,150,0200,200);
		panel.add(imagelabel);
		
		//img = new ImageIcon("Images/man.png");
		img = new ImageIcon("Images/welcome.png");
		imagelabel = new JLabel(img);
		imagelabel.setBounds(0,0,1000,600);
		panel.add(imagelabel);

		this.add(panel);
	}

	public void actionPerformed(ActionEvent ae){
		
		if(ae.getSource()== admnButton) {

			Adminlogin a1 = new Adminlogin();
			a1.setVisible(true);
			this.setVisible(false);
		}

		else if(ae.getSource()== usrButton){

			Userlogin u1 = new Userlogin();
			u1.setVisible(true);
			this.setVisible(false);
		}

	}
   
}

