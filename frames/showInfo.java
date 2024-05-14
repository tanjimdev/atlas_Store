package frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import classes.*;


public class showInfo extends JFrame implements ActionListener{

    JPanel panel;
    JLabel name, cyanBar, gearIcon, hom_lbl,lbl1;
    JButton adUsr_btn, adAdmi_btn, shoInfo_btn, delUsr_btn, delAdmi_btn,bck2home_btn, admInfo, usrInfo;
    JTextArea textArea;
    JTextField nameField;
    JPasswordField passField;
            
    ImageIcon cyanbar, gearIco, homeIco, atlasIco_img ; 
    Font font_large, font_sml, font_mid;
    Color cyan ;
            

    // addAdmin a1;      
    
             public showInfo(){//String s1,String s2,String s3,String s4,addAdmin a1

            super ("ShowInfo");
		        this.setBounds(100,60,1000,638);

            // this.a1=a1;
		
		        panel=new JPanel();
		        panel.setLayout(null);
		        panel.setBackground(Color.WHITE);

            // lbl1 = new JLabel("Info :"+s1+""+s2+""+s3+""+s4);
            // lbl1.setBounds(400,50,400,50);
            // panel.add(lbl1);

                 //******************************** */

                 //must have in every class

                 this.setLocationRelativeTo(null);
                 this.setResizable(false);
                 this.setIconImage(atlasIco_img.getImage());

                 //******************************** */

            font_large= new Font("Cambria",Font.BOLD,30);
            font_sml=new Font("Arial", Font.PLAIN, 12);
            
            

            gearIco=new ImageIcon("Images/gear.png");
            cyanbar=new ImageIcon("Images/CyanBar.jpg");
            homeIco=new ImageIcon("Images/bck2home.png");
            atlasIco_img=new ImageIcon("Images/atlasICO.png");

            this.setIconImage(atlasIco_img.getImage());

            name=new JLabel("Admin Panel");
            name.setBounds(76,160,219,30);
            name.setFont(font_large);
            //name.setOpaque(true);
            name.setForeground(Color.WHITE);

            panel.add(name);
		
	        	

            adUsr_btn=new JButton("add User");
            adUsr_btn.setFont(font_sml);
            adUsr_btn.setBounds(142,238,100,34);
            adUsr_btn.setOpaque(true);
            adUsr_btn.setBorderPainted(false);
            adUsr_btn.setBackground(Color.CYAN);
            adUsr_btn.setForeground(Color.GRAY);
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
            shoInfo_btn.setForeground(Color.BLACK);
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

            //------------------------------------------------------------------

            admInfo= new JButton("Admin Info");
            admInfo.setBounds(680,80,240,30);
            admInfo.setBackground(new Color(25, 198, 187));
            admInfo.setFont(new Font("Arial", Font.PLAIN, 12));
            admInfo.setForeground(Color.WHITE);
            admInfo.setBorderPainted(false);
            panel.add(admInfo);

            usrInfo= new JButton("User Info");
            usrInfo.setBounds(430,80,240,30);
            usrInfo.setBackground(new Color(25, 198, 187));
            usrInfo.setFont(new Font("Arial", Font.PLAIN, 12));
            usrInfo.setForeground(Color.WHITE);
            usrInfo.setBorderPainted(false);
            panel.add(usrInfo);

            

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

              if(ae.getSource()==bck2home_btn){
                Welcome welcome= new Welcome();
			            welcome.setVisible(true);
			            this.dispose();
                }

                // if(ae.getSource()==shoInfo_btn){
                //   showInfo showInfo= new showInfo();
			          //   showInfo.setVisible(true);
                //   // showInfo.setEnabled(false);
			          //   this.dispose();
                // }

                else if(ae.getSource()==adAdmi_btn){
                  //JOptionPane.showMessageDialog(this, "This Option is not available right now");

                  addAdmin a1= new addAdmin();
			            a1.setVisible(true);
			            this.setVisible(false);
                }

                else if(ae.getSource()==adUsr_btn){
                  addUsr u1= new addUsr();
			            u1.setVisible(true);
			            this.setVisible(false);
                }


              
		        }

            



              
            }

       
      

      

        
 




   





    
    

