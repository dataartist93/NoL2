package com.nol2.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FindIDView extends JFrame {
	public JTextField tf_name, tf_jumin1, tf_jumin2;
	public JButton bt_submit, bt_reset;
	JLabel la_n, la_jumin1, la_jumin2;

	public FindIDView() {

		setTitle("Find ID");

		tf_name = new JTextField();
		tf_jumin1 = new JTextField();
		tf_jumin2 = new JPasswordField();

		bt_submit = new JButton("확인");
		bt_reset = new JButton("취소");

		la_n = new JLabel("이름 :");
		la_jumin1 = new JLabel("주민번호 :");
		la_jumin2 = new JLabel("-");

		tf_name.setBounds(90, 69, 175, 25);
		tf_jumin1.setBounds(90, 104, 70, 25);
		la_jumin1.setBounds(16, 104, 70, 25);
		tf_jumin2.setBounds(181, 104, 84, 25);
		la_jumin2.setBounds(167, 104, 10, 25);
		bt_submit.setBounds(14, 172, 110, 30);
		bt_reset.setBounds(155, 172, 110, 30);
		la_n.setBounds(16, 69, 54, 25);

		getContentPane().setLayout(null);
		getContentPane().add(tf_name);
		getContentPane().add(tf_jumin1);
		getContentPane().add(tf_jumin2);
		getContentPane().add(bt_submit);
		getContentPane().add(bt_reset);
		getContentPane().add(la_n);
		getContentPane().add(la_jumin1);
		getContentPane().add(la_jumin2);

		setBounds(350, 200, 301, 285);
		//setVisible(true);
		setResizable(false);
	}

	public void showMsg(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}// showMsg
}
