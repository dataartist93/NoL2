package com.nol2.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;

public class PrePassView extends JFrame{
	
	public JButton bt_rv;
	public JLabel la_r_time,la_hr,la_min,la_person1,la_person11;
	public JLabel la_person2,la_limit,la_loc,la_atTime;
	public JTextArea ta_person2,ta_limit,ta_loc,ta_atTime;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	
	
	public PrePassView() {
		setTitle("PrePass");
		
		la_r_time = new JLabel("탑승시간 ");
		la_r_time.setFont(new Font("굴림", Font.BOLD, 16));
		la_hr = new JLabel("시");
		la_min = new JLabel("분");
		la_person1 = new JLabel("탑승인원 ");
		la_person1.setFont(new Font("굴림", Font.BOLD, 16));
		la_person11= new JLabel("명");
		la_person2= new JLabel("탑승인원");
		la_person2.setFont(new Font("굴림", Font.BOLD, 16));
		la_limit= new JLabel("탑승제한");
		la_limit.setFont(new Font("굴림", Font.BOLD, 16));
		la_loc= new JLabel("탑승위치");
		la_loc.setFont(new Font("굴림", Font.BOLD, 16));
		la_atTime= new JLabel("운행시간");
		la_atTime.setFont(new Font("굴림", Font.BOLD, 16));
		ta_person2=new JTextArea("10:00 ~ 22:00");
		ta_person2.setBackground(Color.WHITE);
		ta_limit=new JTextArea("6명");
		ta_loc=new JTextArea("130cm 미만");
		ta_atTime=new JTextArea("가든스테이지 좌측 후면");
		
		bt_rv = new JButton("예약하기");
		bt_rv.setFont(new Font("굴림", Font.PLAIN, 16));
		
		la_r_time.setBounds(14, 26, 74, 30);
		la_hr.setBounds(160, 27, 24, 30);
		la_min.setBounds(246, 27, 24, 31);
		la_person1.setBounds(14, 72, 74, 37);
		la_person11.setBounds(160, 79, 24, 25);
		la_person2.setBounds(14, 273, 74, 30);
		la_limit.setBounds(14, 327, 74, 37);
		la_loc.setBounds(14, 376, 74, 34);
		la_atTime.setBounds(14, 217, 74, 44);
		bt_rv.setBounds(68, 146, 177, 37);
		ta_person2.setBounds(104, 229, 177, 25);
		ta_limit.setBounds(102, 278, 179, 25);
		ta_loc.setBounds(104, 335, 177, 25);
		ta_atTime.setBounds(102, 383, 179, 25);
		
		getContentPane().setLayout(null);
		getContentPane().add(la_r_time);
		getContentPane().add(la_hr);
		getContentPane().add(la_min);
		getContentPane().add(la_person1);
		getContentPane().add(la_person11);
		getContentPane().add(bt_rv);
		getContentPane().add(la_person2);
		getContentPane().add(la_limit);
		getContentPane().add(la_atTime);
		getContentPane().add(la_loc);
		getContentPane().add(ta_person2);
		getContentPane().add(ta_limit);
		getContentPane().add(ta_loc);
		getContentPane().add(ta_atTime);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("10");
		comboBox.addItem("11");
		comboBox.addItem("12");
		comboBox.addItem("13");
		comboBox.addItem("14");
		comboBox.addItem("15");
		comboBox.addItem("16");
		comboBox.addItem("17");
		comboBox.addItem("18");
		comboBox.addItem("19");
		comboBox.addItem("20");
		comboBox.addItem("21");
		comboBox.addItem("22");
		comboBox.setBounds(99, 28, 57, 29);
		getContentPane().add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.addItem("0");
		comboBox_1.addItem("15");
		comboBox_1.addItem("30");
		comboBox_1.addItem("45");
		comboBox_1.setBounds(198, 26, 45, 30);
		getContentPane().add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(99, 76, 57, 30);
		comboBox_2.addItem("1");
		comboBox_2.addItem("2");
		comboBox_2.addItem("3");
		comboBox_2.addItem("4");
		comboBox_2.addItem("5");
		comboBox_2.addItem("6");
		comboBox_2.addItem("7");
		comboBox_2.addItem("8");
		comboBox_2.addItem("9");
		comboBox_2.addItem("10");
		getContentPane().add(comboBox_2);
		
		
		setBounds(350, 200, 325, 482);
		setVisible(true);
		setResizable(false);
	}
	public static void main(String[] args) {
		new PrePassView();
	}
	
}
