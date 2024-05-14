package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import classes.*;

public class Userlogin extends JFrame implements ActionListener {
	JPanel panel;
	Color mycolor;
	Font myfont;

	JLabel UserLabel, getStartedLabel, namelabel, passlabel,imagelabel;
	JTextField namefield;
	JPasswordField passfield;
	ImageIcon img;
	ImageIcon atlasIco_img ;

	JButton loginButton, backButton, createaccButton;

	public Userlogin() {

		super("Userlogin");
		this.setSize(1000, 600);
		this.setLocation(100, 60);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);

		//******************************** */

		//must have in every class

		ImageIcon atlasIco_img ;

		atlasIco_img=new ImageIcon("Images/atlasICO.png");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(atlasIco_img.getImage());


		//******************************** */

		mycolor = new Color(250, 250, 250);
		myfont = new Font("Calibri", Font.BOLD, 18);


		UserLabel = new JLabel("User");
		UserLabel.setBounds(600, 70, 200, 30);
		UserLabel.setFont(new Font("Calibri", Font.BOLD, 26));
		UserLabel.setForeground(Color.CYAN);
		panel.add(UserLabel);

		getStartedLabel = new JLabel("Get Started");
		getStartedLabel.setBounds(600, 120, 200, 30);
		getStartedLabel.setFont(new Font("Calibri", Font.BOLD, 28));
		panel.add(getStartedLabel);


		namelabel = new JLabel("User Name :");
		namelabel.setBounds(600, 180, 150, 30);
		namelabel.setFont(myfont);
		panel.add(namelabel);

		namefield = new JTextField();
		namefield.setBounds(600, 210, 150, 30);
		panel.add(namefield);

		passlabel = new JLabel("Password :");
		passlabel.setBounds(600, 250, 150, 30);
		passlabel.setFont(myfont);
		panel.add(passlabel);

		passfield = new JPasswordField();
		passfield.setBounds(600, 280, 150, 30);
		passfield.setEchoChar('*');
		panel.add(passfield);

		loginButton = new JButton("Login");
		loginButton.setBounds(580, 350, 200, 50);
		loginButton.setBackground(Color.CYAN);
		loginButton.addActionListener(this);
		panel.add(loginButton);

		backButton = new JButton("Back");
		backButton.setBounds(800, 5, 80, 20);
		backButton.setBackground(Color.WHITE);
		backButton.addActionListener(this);
		panel.add(backButton);

		createaccButton = new JButton("Create Account");
		createaccButton.setBounds(580, 420, 130, 20);
		createaccButton.setBackground(Color.WHITE);
		createaccButton.addActionListener(this);
		panel.add(createaccButton);

		// img = new ImageIcon("Images/user2.png");
		img = new ImageIcon("Images/user2.png");
		imagelabel = new JLabel(img);
		imagelabel.setBounds(0,0,500,600);
		panel.add(imagelabel);

		this.add(panel);
	}

	public void actionPerformed(ActionEvent ae) {

		String command=ae.getActionCommand();

		String name =namefield.getText();
		String pass =new String(passfield.getPassword());

		account ac = new account();

		
		if(ae.getSource() == loginButton){

			if(name.isEmpty()||pass.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Fill up all");
			}

			else if(ac.checkaccount(name,pass)==true){
				
				Homepage h1 = new Homepage();
				h1.setVisible(true);
				this.setVisible(false);
			}
			else{

				JOptionPane.showMessageDialog(this,"Name or Password Incorrect ");

			}
		}
		else if(ae.getSource() == createaccButton){

			userSignUp a1 = new userSignUp();
			a1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == backButton) {

			Welcome f1 = new Welcome();
			f1.setVisible(true);
			this.setVisible(false);

		}

	}

}
