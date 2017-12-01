package com.nol2.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;

public class EventView extends JFrame{

	public JLabel la_title;
	
	public EventView() {
		getContentPane().setForeground(Color.PINK);
		la_title = new JLabel("노리의 모험");
		la_title.setForeground(Color.PINK);
		
		getContentPane().setLayout(null);
		la_title.setBounds(140,12,164,40);
		
		getContentPane().add(la_title);
		
		setLayout(null);
		setBounds(350, 200, 325, 482);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	public void showMsg(String msg) {
	      JOptionPane.showMessageDialog(this, msg);
	}// showMsg
	
	public static void main(String[] args) {
		
		new EventView();
	}//main
}

