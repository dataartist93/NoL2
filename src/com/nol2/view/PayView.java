package com.nol2.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PayView extends JFrame{

	public JLabel information;
	public JLabel reserve,date_choice;
	public JLabel year,month,date;
	public JLabel adult,child,handy;
	public JLabel adult_define,child_define,handy_define;
	
	public JButton bt_submit,bt_cancle;
	public JComboBox cmb_adult, cmb_handy, cmb_child, cmb_year, cmb_month, cmb_date;
	
	
		
	public PayView() {
		setTitle("결제진행!");
			
		information = new JLabel("이미지");
		reserve = new JLabel("티켓예매");
		date_choice = new JLabel("방문일자/인원 선택");
		year = new JLabel("년");
		month = new JLabel("월");
		date = new JLabel("일");
		adult = new JLabel("어른");
		child = new JLabel("어린이");
		handy = new JLabel("장애우");
		adult_define = new JLabel("만 19세 이상");
		child_define = new JLabel("36개월 이상 ~ 만 12세");
		handy_define = new JLabel("국가유공자, 장애우");
		bt_submit = new JButton("선택");
		bt_cancle = new JButton("취소");
		
		
		cmb_year = new JComboBox();		 
		 	int years= Calendar.getInstance().get(Calendar.YEAR);
		 	for (int i = 0; i < 11; i++) {
				cmb_year.addItem(years+i+"");
			}		 	
		cmb_month = new JComboBox();	
		
		int []dateCnt= {31,28,31,30,31,
				       30,31,31,30,31,
				       30,31};
			for (int i = 1; i < 13; i++) {
				cmb_month.addItem(""+i);
			}
		cmb_date = new JComboBox();
			for (int i = 1; i < 32; i++) {
				cmb_date.addItem(""+i);
			}
			cmb_month.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					cmb_date.removeAllItems();
					int selectedMonth = Integer.parseInt(cmb_month.getSelectedItem().toString());
					int cnt = dateCnt[selectedMonth-1] +1;
					if(selectedMonth==2 ) {
						int selectedYear = Integer.parseInt(cmb_year.getSelectedItem().toString());
						if( (selectedYear%4==0) && (selectedYear%100!=0) || (selectedYear%400==0))
							cnt++;
					}
					for (int i = 1; i <cnt ; i++) {
						cmb_date.addItem(""+i);
					}
				}
			});
		cmb_adult = new JComboBox();
			for (int i = 0; i < 51; i++) {
				cmb_adult.addItem(""+i);
			}
		 cmb_handy = new JComboBox();
			for (int i = 0; i < 51; i++) {
				cmb_handy.addItem(""+i);
			}
		cmb_child = new JComboBox();
			for (int i = 0; i < 51; i++) {
				cmb_child.addItem(""+i);
			}
		
		information.setBounds(14, 12, 566, 216);
		reserve.setBounds(263, 240, 89, 28);
		date_choice.setBounds(86, 302, 208, 18);
		
		cmb_year.setBounds(106, 352, 83, 50);
		year.setBounds(193, 352, 50, 50);
		cmb_month.setBounds(257, 352, 55, 50);
		month.setBounds(326, 352, 50, 50);
		cmb_date.setBounds(381, 353, 55, 50);
		date.setBounds(452, 354, 30, 50);
		
		adult.setBounds(92, 439, 50, 50);
		adult_define.setBounds(92, 474, 106, 28);
		cmb_adult.setBounds(438, 463, 50, 50);
		child.setBounds(92, 522, 50, 50);
		child_define.setBounds(92, 560, 173, 28);
		cmb_child.setBounds(438, 549, 50, 50);
		handy.setBounds(92, 615, 50, 34);
		handy_define.setBounds(92, 650, 151, 28);
		cmb_handy.setBounds(438, 639, 50, 50);
		
		bt_submit.setBounds(110, 740, 173, 42);
		bt_cancle.setBounds(326, 740, 168, 42);
		
		getContentPane().setLayout(null);
		getContentPane().add(information);
		getContentPane().add(reserve);
		getContentPane().add(date_choice);
		getContentPane().add(year);
		getContentPane().add(month);
		getContentPane().add(date);
		getContentPane().add(adult);
		getContentPane().add(child);
		getContentPane().add(handy);
		getContentPane().add(adult_define);
		getContentPane().add(child_define);
		getContentPane().add(handy_define);
		getContentPane().add(cmb_year);
		getContentPane().add(cmb_month);
		getContentPane().add(cmb_date);
		getContentPane().add(cmb_adult);
		getContentPane().add(cmb_child);
		getContentPane().add(cmb_handy);
		getContentPane().add(bt_submit);
		getContentPane().add(bt_cancle);
				
		
		setBounds(1200,100,600,850);
		//setVisible(true);
		setResizable(false);
	
				
	}//생성자
	
	public void init() {
		cmb_adult.setSelectedIndex(0);
		cmb_child.setSelectedIndex(0);
		cmb_handy.setSelectedIndex(0);
		cmb_year.setSelectedIndex(0);
		cmb_month.setSelectedIndex(0);
		cmb_date.setSelectedIndex(0);
	}
}
