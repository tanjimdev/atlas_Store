package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import classes.*;

public class boot extends JFrame implements ActionListener{
	JPanel panel;
	Color mycolor,mycolor2;
	Font myfont, myfont2;
	ImageIcon img1,img2,img3,img4,img5;
	ImageIcon atlasIco_img ;
	JLabel imagelabel,jlbl1,jlbl2,jlbl3,jlbl4,jlbl5,jlbl6,jlbl7;

	JButton backButton,catButton, favButton, lifeButton,cartButton,signupButton,addcartButton,buyButton;

	public boot() {

		super("Boots");
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
		myfont = new Font("Poppins", Font.BOLD, 18);
		myfont2 = new Font("Copperplate Gothic Light", Font.BOLD, 38);


		catButton = new JButton("Third Kit");
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



		jlbl1 = new JLabel("Adidas Copa Pure || ");
		jlbl1.setBounds(20,340,180,50);
		jlbl1.setForeground(mycolor2);
		jlbl1.setFont(myfont);
		jlbl1.setOpaque(false);
		panel.add(jlbl1);

		jlbl2 = new JLabel("8 $");
		jlbl2.setBounds(20,380,180,50);
		jlbl2.setForeground(mycolor2);
		jlbl2.setFont(myfont);
		jlbl2.setOpaque(true);
		panel.add(jlbl2);

		addcartButton = new JButton("Add to cart");
		addcartButton.setBounds(20,440,100,50);
		addcartButton.setBackground(Color.CYAN);
		addcartButton.setOpaque(true);
		panel.add(addcartButton);

		buyButton = new JButton("buy");
		buyButton.setBounds(140,440,100,50);
		buyButton.setBackground(Color.CYAN);
		buyButton.setOpaque(true);
		panel.add(buyButton);




		jlbl3 = new JLabel("Nike Vapor 15 Elite");
		jlbl3.setBounds(340,340,240,50);
		jlbl3.setForeground(mycolor2);
		jlbl3.setFont(myfont);
		jlbl3.setOpaque(false);
		panel.add(jlbl3);

		jlbl4 = new JLabel("8 $");
		jlbl4.setBounds(340,380,180,50);
		jlbl4.setForeground(mycolor2);
		jlbl4.setFont(myfont);
		jlbl4.setOpaque(true);
		panel.add(jlbl4);

		addcartButton = new JButton("Add to cart");
		addcartButton.setBounds(340,440,100,50);
		addcartButton.setBackground(Color.CYAN);
		addcartButton.setOpaque(true);
		panel.add(addcartButton);

		buyButton = new JButton("buy");
		buyButton.setBounds(460,440,100,50);
		buyButton.setBackground(Color.CYAN);
		buyButton.setOpaque(true);
		panel.add(buyButton);



		jlbl5 = new JLabel("Adidas Messi Signature ");
		jlbl5.setBounds(660,340,240,50);
		jlbl5.setForeground(mycolor2);
		jlbl5.setFont(myfont);
		jlbl5.setOpaque(false);
		panel.add(jlbl5);

		jlbl6 = new JLabel("8 $");
		jlbl6.setBounds(660,380,180,50);
		jlbl6.setForeground(mycolor2);
		jlbl6.setFont(myfont);
		jlbl6.setOpaque(true);
		panel.add(jlbl6);

		addcartButton = new JButton("Add to cart");
		addcartButton.setBounds(660,440,100,50);
		addcartButton.setBackground(Color.CYAN);
		addcartButton.setOpaque(true);
		panel.add(addcartButton);

		buyButton = new JButton("buy");
		buyButton.setBounds(780,440,100,50);
		buyButton.setBackground(Color.CYAN);
		buyButton.setOpaque(true);
		panel.add(buyButton);

		jlbl7 = new JLabel("Boots");
		jlbl7.setBounds(450,520,200,50);
		jlbl7.setForeground(mycolor2);
		jlbl7.setFont(myfont);
		jlbl7.setOpaque(true);
		panel.add(jlbl7);

		//		img = new ImageIcon("image.png");
//		img2 = new ImageIcon("cart.png");
		// img3 = new ImageIcon("Images/img1.png");
		// img4 = new ImageIcon("Images/img2.png");
		// img5 = new ImageIcon("Images/img3.png");

		img1 = new ImageIcon("Images/copa.png");
		imagelabel = new JLabel(img1);
		imagelabel.setBounds(20,50,300,300);
		panel.add(imagelabel);

		img2 = new ImageIcon("Images/nikeb.png");
		imagelabel = new JLabel(img2);
		imagelabel.setBounds(340,50,300,300);
		panel.add(imagelabel);

		img3 = new ImageIcon("Images/messib.png");
		imagelabel = new JLabel(img3);
		imagelabel.setBounds(660,50,300,300);
		panel.add(imagelabel);


		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == backButton){

		equipments e1 = new equipments();
		e1.setVisible(true);
		this.setVisible(false);
	}
	else if(ae.getSource() == signupButton){

		Welcome f1 = new Welcome();
		f1.setVisible(true);
		this.setVisible(false);

	}
}
	   
}
