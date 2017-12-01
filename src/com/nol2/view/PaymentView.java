package com.nol2.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PaymentView extends JFrame{
	
	JPanel p1,p2,p3;
	public JButton bt_confirm, bt_cancle;
	JLabel la_pay, la_discount;
	
	public PaymentView() {
		

		
		String payment[] = {"핸드폰", "카드"}; 

		
		bt_confirm = new JButton("확인");
		bt_cancle = new JButton("취소");
		
		la_pay = new JLabel("결제");
		la_discount = new JLabel("할인");
		
		getContentPane().setLayout(null);
		
		la_pay.setBounds(47, 203, 39, 35);
		la_discount.setBounds(47, 264, 39, 35);
		bt_confirm.setBounds(64, 355, 99, 30);
		bt_cancle.setBounds(200, 355, 110, 30);
		
		getContentPane().add(la_pay);
		getContentPane().add(la_discount);
		getContentPane().add(bt_confirm);
		getContentPane().add(bt_cancle);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("--선택--");
		comboBox.addItem("핸드폰");
		comboBox.addItem("카드");
		comboBox.setBounds(85, 200, 214, 40);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("--선택--");
		comboBox_1.addItem("제휴카드");
		comboBox_1.addItem("통신사할인");
		comboBox_1.setBounds(85, 259, 214, 40);
		getContentPane().add(comboBox_1);

		
		setTitle("결제창");
		setBounds(500,200,380,500);
		setVisible(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

}
