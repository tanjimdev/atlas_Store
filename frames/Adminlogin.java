package frames;

import classes.account;
import classes.adminAcount;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import classes.*;

public class Adminlogin extends JFrame implements ActionListener{
    JPanel panel;
	Color mycolor,myColor2;
	Font myfont,myFont2;
	ImageIcon img;
	ImageIcon atlasIco_img ;
	JLabel adminLabel,getStartedLabel,namelabel,passlabel,imagelabel,txtLabel;
	JTextField namefield;
	JPasswordField passfield;

	JButton loginButton,backButton,createaccButton;

    public Adminlogin(){

		super("Adminlogin");
		this.setSize(1000,600);
		this.setLocation(100,60);
		
		mycolor=new Color(250,250,250);
		// mycolor2 = new Color(100,100,100);
		myfont = new Font("Calibri", Font.BOLD, 18);
		// myFont2 = new Font("Calibri", Font.BOLD, 18);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);



		atlasIco_img=new ImageIcon("Images/atlasICO.png");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(atlasIco_img.getImage());

		adminLabel=new JLabel("Shop Admin");
		adminLabel.setBounds(100,70,200,30);
		adminLabel.setFont(new Font("Calibri", Font.BOLD, 26));
		adminLabel.setForeground(Color.CYAN);
		panel.add(adminLabel);

		getStartedLabel=new JLabel("Get Started");
		getStartedLabel.setBounds(100, 120, 200, 30);
		getStartedLabel.setFont(new Font("Calibri",Font.BOLD,28));
		panel.add(getStartedLabel);
		
		
		namelabel=new JLabel("Admin Name :");
		namelabel.setBounds(100, 180, 150, 30);
		namelabel.setFont(myfont);
		panel.add(namelabel);
		
		namefield = new JTextField();
		namefield.setBounds(100,210,150,30);
		namefield.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		namefield.setCaretColor(Color.white);
		// namefield.setBorder(null);
		namefield.setOpaque(true);
		panel.add(namefield);
		
		passlabel=new JLabel("Password :");
		passlabel.setBounds(100,250,150,30);
		passlabel.setFont(myfont);
		panel.add(passlabel);
		
		passfield=new JPasswordField();
		passfield.setBounds(100,280,150,30);
		passfield.setEchoChar('*');
		panel.add(passfield);

		loginButton = new JButton("Login");
		loginButton.setBounds(80,350,200,50);
		loginButton.setBackground(Color.CYAN);
		loginButton.addActionListener(this);
		panel.add(loginButton);

		backButton =new JButton("Back");
		backButton.setBounds(5,5,80,20);
		backButton.setBackground(Color.WHITE);
		backButton.addActionListener(this);
		panel.add(backButton);

		txtLabel=new JLabel("");
		txtLabel.setBounds(100, 180, 150, 30);
		txtLabel.setFont(myfont);
		panel.add(txtLabel);

		// createaccButton =new JButton("Create Account");
		// createaccButton.setBounds(80,420,130,20);
		// createaccButton.setBackground(Color.WHITE);
		// panel.add(createaccButton);

		// img = new ImageIcon("Images/admin2.png");
		img = new ImageIcon("Images/admin2.png");
		imagelabel = new JLabel(img);
		imagelabel.setBounds(500,0,500,600);
		panel.add(imagelabel);

        this.add(panel);
	}

	public void actionPerformed(ActionEvent ae){

		String name =namefield.getText();
		String pass =new String(passfield.getPassword());

		adminAcount ac = new adminAcount();


		if(ae.getSource() == loginButton){

			if(name.isEmpty()||pass.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Fill up all");
			}

			else if(ac.checkaccount(name,pass)==true){

				showInfo showInfo1 = new showInfo();
				showInfo1.setVisible(true);
				this.setVisible(false);

			}
			else{

				JOptionPane.showMessageDialog(this,"Name or Password Incorrect ");

			}
		}



		if(ae.getSource() == backButton){

			Welcome f1 = new Welcome();
			f1.setVisible(true);
			this.setVisible(false);

		}




			}


		}


	
	


