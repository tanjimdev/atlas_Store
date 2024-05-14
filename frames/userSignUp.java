package frames;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import classes.*;

import classes.*;

public class userSignUp extends JFrame implements ActionListener {


	JPanel panel;
	JLabel backImg_lbl, nam_lbl, pass_lbl, email_lbl, phn_lbl;
	JButton signUp_btn, bck_btn;
	JTextArea textArea;
	JTextField nameField, emailField, phnField;
	JPasswordField passField;

	ImageIcon atlasIco_img, back_Img;
	Font font_large, font_sml, font_mid;
	Color cyan ;


	public userSignUp() {

		super ("Add User");
		this.setBounds(100,60,1000,600);
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);

		this.setLocationRelativeTo(null);

		font_large= new Font("Cambria",Font.BOLD,30);
		font_sml=new Font("Arial", Font.PLAIN, 12);



		atlasIco_img=new ImageIcon("Images/atlasICO.png");
		back_Img=new ImageIcon("Images/user2.png");


		//******************************** */

		//must have in every class

		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(atlasIco_img.getImage());

		//******************************** */




		//-----------------F O R M -----------------------------------------

		nam_lbl=new JLabel("Name :");
		nam_lbl.setBounds(500,135,133,23);
		nam_lbl.setFont(new Font("Arial", Font.PLAIN, 12));
		nam_lbl.setForeground(Color.BLACK);
		nam_lbl.setOpaque(false);
		panel.add(nam_lbl);

		nameField= new JTextField();
		nameField.setBounds(600,135,250,25);
		//nameField.setOpaque(false);
		nameField.setBorder(BorderFactory.createEmptyBorder());
		nameField.setBackground(new Color(203,203,203));
		panel.add(nameField);


		email_lbl=new JLabel("Email:");
		email_lbl.setBounds(500,205,133,23);
		email_lbl.setFont(new Font("Arial", Font.PLAIN, 12));
		email_lbl.setForeground(Color.BLACK);
		email_lbl.setOpaque(false);
		panel.add(email_lbl);

		emailField= new JTextField();
		emailField.setBounds(550+50,205,250,25);
		//nameField.setOpaque(false);
		emailField.setBorder(BorderFactory.createEmptyBorder());
		emailField.setBackground(new Color(203,203,203));
		panel.add(emailField);

		pass_lbl=new JLabel("Password:");
		pass_lbl.setBounds(500,290,133,23);
		pass_lbl.setFont(new Font("Arial", Font.PLAIN, 12));
		pass_lbl.setForeground(Color.BLACK);
		pass_lbl.setOpaque(false);
		panel.add(pass_lbl);

		passField=new JPasswordField();
		passField.setBounds(550+50,290,250,25);
		passField.setBackground(new Color(203,203,203));
		passField.setBorder(null);
		passField.setEchoChar('*');
		panel.add(passField);

		phn_lbl=new JLabel("Phone Number:");
		phn_lbl.setBounds(500,370,133,23);
		phn_lbl.setFont(new Font("Arial", Font.PLAIN, 12));
		phn_lbl.setForeground(Color.BLACK);
		phn_lbl.setOpaque(false);
		panel.add(phn_lbl);

		phnField= new JTextField();
		phnField.setBounds(550+50,370,250,25);
		//nameField.setOpaque(false);
		phnField.setBorder(BorderFactory.createEmptyBorder());
		phnField.setBackground(new Color(203,203,203));
		panel.add(phnField);



		//--------------------- E N D --------------------------------------------

		signUp_btn=new JButton("Sign Up");
		signUp_btn.setBounds(500,470,365,40);
		signUp_btn.setOpaque(true);
		signUp_btn.setBackground(new Color(18, 147, 138));
		signUp_btn.setForeground(Color.WHITE);
		signUp_btn.addActionListener(this);
		//signUp_btn.setContentAreaFilled(false);
		panel.add(signUp_btn);



		bck_btn=new JButton("back");
		bck_btn.setSize(73,31);
		bck_btn.setLocation(870, 50);
		//turn on or off border
		//bck2home_btn.setBorder(null);
		bck_btn.setContentAreaFilled(false);
		bck_btn.setOpaque(true);
		bck_btn.setBorderPainted(false);
		bck_btn.addActionListener(this);
		panel.add( bck_btn);

		backImg_lbl=new JLabel(back_Img);
		backImg_lbl.setBounds(-30,0,500,600);
		panel.add(backImg_lbl);

		// Add the panel to the frame
		this.add(panel);
	}


	public void actionPerformed (ActionEvent ae){

		String username = nameField.getText().trim();
		String userEmail = emailField.getText().trim();
		String userPassword = new String(passField.getPassword());
		String userPhone = phnField.getText().trim();


		if(ae.getSource()==bck_btn){
			Welcome f1= new Welcome();
			f1.setVisible(true);
			this.setVisible(false);
		}



		if(ae.getSource() == signUp_btn) {

			if(username.isEmpty() || userEmail.isEmpty() || userPassword.isEmpty() || userPhone.isEmpty()){

				JOptionPane.showMessageDialog(this,"Fill UP All");
			}
			//pass information to account
			else {
				account account = new account(username, userEmail, userPassword, userPhone);
				account.addaccount();
				JOptionPane.showMessageDialog(this, "Inserted");
			}
		}


	}


	}



