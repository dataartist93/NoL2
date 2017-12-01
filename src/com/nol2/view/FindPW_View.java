package com.nol2.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FindPW_View extends JFrame {

	public JTextField tf_id, tf_tel1,tf_tel2,tf_tel3, tf_jumin1;
	public JPasswordField pf_jumin2;
	public JButton bt_confirm, bt_cancel;
	public JLabel la_id, la_tel,la_telhypen1,la_telhypen2, la_jumin1,la_jumin2;

	public FindPW_View() {

		setTitle("Find PW");
		la_id = new JLabel("아이디 :");
		tf_id = new JTextField();

		la_tel = new JLabel("전화번호 :");
		tf_tel1 = new JTextField();
		tf_tel2 = new JTextField();
		tf_tel3 = new JTextField();
		la_telhypen1 = new JLabel("-");
		la_telhypen2 = new JLabel("-");
		
		la_jumin1 = new JLabel("주민등록번호 :");
		tf_jumin1 = new JTextField();
		la_jumin2 = new JLabel("-");
		pf_jumin2 = new JPasswordField();

		bt_confirm = new JButton("확인");
		bt_cancel = new JButton("취소");

		tf_id.setBounds(125, 106, 193, 25);
		la_id.setBounds(57, 106, 57, 25);

		tf_tel1.setBounds(122, 180, 50, 30);
		tf_tel2.setBounds(194, 180, 50, 30);
		tf_tel3.setBounds(268, 180, 50, 30);
		la_tel.setBounds(43, 185, 71, 25);
		la_telhypen1.setBounds(179, 180, 18, 30);
		la_telhypen2.setBounds(252, 180, 18, 30);

		la_jumin1.setBounds(14, 145, 100, 25);
		tf_jumin1.setBounds(125, 143, 76, 25);
		la_jumin2.setBounds(210, 144, 18, 30);
		pf_jumin2.setBounds(231, 143, 87, 25);

		bt_confirm.setBounds(43, 235, 123, 42);
		bt_cancel.setBounds(195, 236, 123, 41);


		getContentPane().setLayout(null);
		getContentPane().add(tf_id);
		getContentPane().add(tf_tel1);
		getContentPane().add(tf_tel2);
		getContentPane().add(tf_tel3);
		getContentPane().add(la_telhypen1);
		getContentPane().add(la_telhypen2);
		getContentPane().add(tf_jumin1);
		getContentPane().add(pf_jumin2);
		getContentPane().add(bt_confirm);
		getContentPane().add(bt_cancel);
		getContentPane().add(la_id);
		getContentPane().add(la_tel);
		getContentPane().add(la_jumin1);
		getContentPane().add(la_jumin2);

<<<<<<< HEAD
		setBounds(350, 200, 350, 350);
		//setVisible(true);
=======
		setBounds(350, 200, 365, 356);
		setVisible(true);
>>>>>>> 5baa6bb6b990e54d81a618293280d688acb1f13b
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}// 생성자

	public void showMsg(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}// showMsg

}