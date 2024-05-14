package frames;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import classes.*;

public class addUsr extends JFrame implements ActionListener{


    JPanel panel;
    JLabel name, cyanBar, gearIcon, hom_lbl, nam_lbl, pass_lbl, email_lbl, phn_lbl;
    JButton adUsr_btn, adAdmi_btn, shoInfo_btn, delUsr_btn, delAdmi_btn,bck2home_btn, add;
    JTextArea textArea;
    JTextField nameField, email, phn;
    JPasswordField passField;

    ImageIcon cyanbar, gearIco, homeIco, atlasIco_img ;
    Font font_large, font_sml, font_mid;
    Color cyan ;


     // the common Layout

    public addUsr(){

            super ("Add User");
            this.setBounds(100,60,1000,638);
            panel=new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.WHITE);

            this.setLocationRelativeTo(null);

            font_large= new Font("Cambria",Font.BOLD,30);
            font_sml=new Font("Arial", Font.PLAIN, 12);



            gearIco=new ImageIcon("Images/gear.png");
            cyanbar=new ImageIcon("Images/CyanBar.jpg");
            homeIco=new ImageIcon("Images/bck2home.png");
            atlasIco_img=new ImageIcon("Images/atlasICO.png");

            //******************************** */

            //must have in every class

            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setIconImage(atlasIco_img.getImage());

            //******************************** */

            name=new JLabel("Admin Panel");
            name.setBounds(76,160,219,30);
            name.setFont(font_large);
            //name.setOpaque(true);
            name.setForeground(Color.WHITE);

            panel.add(name);


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


            email_lbl=new JLabel("Emnil:");
            email_lbl.setBounds(500,205,133,23);
            email_lbl.setFont(new Font("Arial", Font.PLAIN, 12));
            email_lbl.setForeground(Color.BLACK);
            email_lbl.setOpaque(false);
            panel.add(email_lbl);

            email= new JTextField();
            email.setBounds(550+50,205,250,25);
          //nameField.setOpaque(false);
            email.setBorder(BorderFactory.createEmptyBorder());
            email.setBackground(new Color(203,203,203));
            panel.add(email);

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

            phn= new JTextField();
            phn.setBounds(550+50,370,250,25);
          //nameField.setOpaque(false);
            phn.setBorder(BorderFactory.createEmptyBorder());
            phn.setBackground(new Color(203,203,203));
            panel.add(phn);

            add=new JButton("Add");
            add.setBounds(500,440,365,40);
            add.setBackground(new Color(25,198,187));
            add.addActionListener(this);
            panel.add(add);


            //--------------------- E N D --------------------------------------------


            adUsr_btn=new JButton("add User");
            adUsr_btn.setFont(font_sml);
            adUsr_btn.setBounds(142,238,100,34);
            adUsr_btn.setOpaque(true);
            adUsr_btn.setBorderPainted(false);
            adUsr_btn.setBackground(Color.CYAN);
            adUsr_btn.setForeground(Color.black);
            adUsr_btn.addActionListener(this);
            panel.add(adUsr_btn);


            adAdmi_btn=new JButton("add Admin");
            adAdmi_btn.setBounds(142,298,100,34);
            adAdmi_btn.setOpaque(true);
            // turn on or off border
            adAdmi_btn.setBorderPainted(false);
            adAdmi_btn.setBackground(Color.CYAN);
            adAdmi_btn.setForeground(Color.GRAY);
            adAdmi_btn.setFont(font_sml);
            adAdmi_btn.revalidate();
            adAdmi_btn.addActionListener(this);
            panel.add(adAdmi_btn);


            shoInfo_btn=new JButton("show info");
            shoInfo_btn.setFont(font_sml);
            shoInfo_btn.setBounds(142,359,100,34);
            shoInfo_btn.setOpaque(true);
            shoInfo_btn.setBackground(Color.CYAN);
            shoInfo_btn.setForeground(Color.GRAY);
            shoInfo_btn.addActionListener(this);
            panel.add(shoInfo_btn);

            bck2home_btn=new JButton(homeIco);
            bck2home_btn.setSize(68,22);
            bck2home_btn.setLocation(852, 42);
            //turn on or off border
            bck2home_btn.setBorder(null);
            bck2home_btn.setContentAreaFilled(false);
            bck2home_btn.setOpaque(false);
            bck2home_btn.setBorderPainted(false);
            bck2home_btn.addActionListener(this);
            panel.add( bck2home_btn);


           gearIcon =new JLabel(gearIco);
           gearIcon.setBounds(161,98,48,48);
           panel.add(gearIcon);

           cyanBar=new JLabel(cyanbar);
           cyanBar.setBounds(0,0,350,600);
           panel.add(cyanBar);




            // Add the panel to the frame
            this.add(panel);

             }

            public void actionPerformed (ActionEvent ae){

                String username = nameField.getText().trim();
                String userEmail = email.getText().trim();
                String userPassword = new String(passField.getPassword());
                String userPhone = phn.getText().trim();


              if(ae.getSource()==bck2home_btn){
                Welcome f1= new Welcome();
			            f1.setVisible(true);
			            this.setVisible(false);
                }

              else if(ae.getSource()==shoInfo_btn){
                  showInfo showInfo= new showInfo();
			            showInfo.setVisible(true);
			            this.setVisible(false);
                }

              else if(ae.getSource()==adAdmi_btn){
                  //JOptionPane.showMessageDialog(this, "This Option is not available right now");

                  addAdmin a1= new addAdmin();
			            a1.setVisible(true);
			            this.setVisible(false);
                }

                if(ae.getSource() == add) {

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