package com.nol2.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FindID  extends JFrame{
	public JTextField tf_name,tf_ssn1,tf_ssn2;
	public JButton bt_submit;
	JLabel la_n,la_ssn1,la_ssn2;
	
	public FindID() {
		tf_name = new JTextField();
		tf_ssn1 = new JTextField();
		tf_ssn2 = new JPasswordField();
		
		 bt_submit = new JButton("확인");
		 
		 la_n = new JLabel("이름 :");
		
		 tf_name.setBounds(80,150,100,25);
		 
		 tf_ssn1.setBounds(80,190,50,25);
		
		 tf_ssn2.setBounds(140,190,50,25);
		 
		 bt_submit.setBounds(50,370,90,25);
		 
		 la_n.setBounds(10,150,100,25);
		 
		 setLayout(null);
		 add(tf_name);
		add(tf_ssn1);
		add(tf_ssn2);
		add(bt_submit);
		add(la_n);
		
		setBounds(350,200,300,450);		
		//setVisible(true);
		setResizable(false);
	}//
	 public void showMsg(String msg) {
		 JOptionPane.showMessageDialog(this, msg); 
	  }//showMsg
	 
	
}
