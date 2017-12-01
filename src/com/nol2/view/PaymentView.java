package com.nol2.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PaymentView extends JFrame{
	
	JPanel p1,p2,p3;
	public JComboBox<String> cellphone, card;
	public JButton bt_confirm, bt_cancle;
	JLabel la_pay, la_discount;
	
	public PaymentView() {
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		
		String payment[] = {"핸드폰", "카드"}; 
		cellphone = new JComboBox<>(payment);
		card = new JComboBox<>(payment);
		
		bt_confirm = new JButton("확인");
		bt_cancle = new JButton("취소");
		
		la_pay = new JLabel("결제");
		la_discount = new JLabel("할인");
		
		
		setLayout(null);
		
		p1.setLayout(new GridLayout(2, 1));
		
		setTitle("결제창");
		setBounds(500,200,380,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new PaymentView();
	}
}
