package com.nol2.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FindPW_View extends JFrame {

	public JTextField tf_id, tf_tel, tf_jumin1;
	public JPasswordField pf_jumin2;
	public JButton bt_confirm, bt_cancel;
	public JLabel la_id, la_tel, la_jumin1,la_jumin2;

	public FindPW_View() {

		setTitle("Find PW");
		la_id = new JLabel("아이디 :");
		tf_id = new JTextField();

		la_tel = new JLabel("전화번호 :");
		tf_tel = new JTextField();
		
		la_jumin1 = new JLabel("주민등록번호 :");
		tf_jumin1 = new JTextField();
		la_jumin2 = new JLabel("-");
		pf_jumin2 = new JPasswordField();

		bt_confirm = new JButton("확인");
		bt_cancel = new JButton("취소");

		tf_id.setBounds(125, 106, 177, 25);
		la_id.setBounds(57, 106, 57, 25);

		tf_tel.setBounds(125, 180, 177, 30);
		la_tel.setBounds(43, 185, 71, 25);

		la_jumin1.setBounds(14, 145, 100, 25);
		tf_jumin1.setBounds(125, 143, 65, 25);
		la_jumin2.setBounds(194, 144, 18, 30);
		pf_jumin2.setBounds(215, 143, 87, 25);

		bt_confirm.setBounds(30, 235, 123, 42);
		bt_cancel.setBounds(179, 236, 123, 41);


		getContentPane().setLayout(null);
		getContentPane().add(tf_id);
		getContentPane().add(tf_tel);
		getContentPane().add(tf_jumin1);
		getContentPane().add(pf_jumin2);
		getContentPane().add(bt_confirm);
		getContentPane().add(bt_cancel);
		getContentPane().add(la_id);
		getContentPane().add(la_tel);
		getContentPane().add(la_jumin1);
		getContentPane().add(la_jumin2);

		setBounds(350, 200, 350, 350);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}// 생성자

	public void showMsg(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}// showMsg

	public static void main(String[] args) {
		new FindPW_View();
	}// main
}