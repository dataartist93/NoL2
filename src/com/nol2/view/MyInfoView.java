package com.nol2.view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyInfoView extends JFrame {
	   public JTextField tf_id, tf_name, tf_ssn1, tf_tel1, tf_tel2, tf_tel3, tf_addr;
	   public JPasswordField tf_pass, tf_pass2, tf_ssn2;
	   public JButton bt_submit, bt_reset;
	   JLabel la_id, la_pass1, la_pass2, la_n, la_j, la_t, la_addr;
	   JLabel jb[];
	   ButtonGroup group;

	   public MyInfoView() {
	      setTitle("내정보 수정");

	      jb = new JLabel[3];
	      for (int i = 0; i < jb.length; i++) {
	         jb[i] = new JLabel("-");
	      }

	      tf_id = new JTextField();
	      tf_pass = new JPasswordField();
	      tf_pass2 = new JPasswordField();
	      tf_name = new JTextField();
	      tf_ssn1 = new JTextField();
	      tf_ssn2 = new JPasswordField();
	      tf_tel1 = new JTextField();
	      tf_tel2 = new JTextField();
	      tf_tel3 = new JTextField();
	      tf_addr = new JTextField();

	      bt_submit = new JButton("수정");
	      bt_reset = new JButton("취소");
	      

	      la_id = new JLabel("I  D:");
	      la_pass1 = new JLabel("비  번:");
	      la_pass2 = new JLabel("비번확인:");
	      la_n = new JLabel("이  름:");
	      la_j = new JLabel("주민번호:");
	      la_t = new JLabel("전화번호:");
	      la_addr = new JLabel("주  소:");


	      tf_id.setBounds(80, 30, 100, 25);
	      tf_pass.setBounds(80, 70, 100, 25);
	      tf_pass2.setBounds(80, 110, 100, 25);
	      tf_name.setBounds(80, 150, 100, 25);

	      tf_ssn1.setBounds(80, 190, 50, 25);
	      jb[0].setBounds(131, 190, 8, 25);
	      tf_ssn2.setBounds(140, 190, 50, 25);

	      tf_tel1.setBounds(80, 230, 40, 25);
	      jb[1].setBounds(121, 230, 8, 25);
	      tf_tel2.setBounds(130, 230, 40, 25);
	      jb[2].setBounds(171, 230, 8, 25);
	      tf_tel3.setBounds(180, 230, 40, 25);

	      tf_addr.setBounds(80, 270, 200, 25);

	      bt_submit.setBounds(54, 328, 90, 25);
	      bt_reset.setBounds(151, 328, 90, 25);

	      la_id.setBounds(10, 30, 100, 25);
	      la_pass1.setBounds(10, 70, 100, 25);
	      la_pass2.setBounds(10, 110, 100, 25);
	      la_n.setBounds(10, 150, 100, 25);
	      la_j.setBounds(10, 190, 100, 25);
	      la_t.setBounds(10, 230, 100, 25);
	      la_addr.setBounds(10, 270, 100, 25);


	      getContentPane().setLayout(null);
	      getContentPane().add(tf_id);
	      getContentPane().add(tf_pass);
	      getContentPane().add(tf_pass2);
	      getContentPane().add(tf_name);
	      getContentPane().add(tf_ssn1);
	      getContentPane().add(tf_ssn2);
	      getContentPane().add(tf_tel1);
	      getContentPane().add(tf_tel2);
	      getContentPane().add(tf_tel3);
	      getContentPane().add(tf_addr);

	      getContentPane().add(bt_submit);
	      getContentPane().add(bt_reset);

	      getContentPane().add(la_id);
	      getContentPane().add(la_pass1);
	      getContentPane().add(la_pass2);
	      getContentPane().add(la_n);
	      getContentPane().add(la_j);
	      getContentPane().add(la_t);
	      getContentPane().add(la_addr);


	      for (int i = 0; i < jb.length; i++) {
	         getContentPane().add(jb[i]);
	      }

	      setBounds(350, 200, 300, 414);
	     // setVisible(true);
	      setResizable(false);
	      tf_id.setEnabled(false);
	      tf_ssn1.setEnabled(false);
	      tf_ssn2.setEnabled(false);
	   }// 생성자
	   
	   public void init() {
		   tf_name.setText("");
		   tf_tel1.setText("");
		   tf_tel2.setText("");
		   tf_tel3.setText("");
		   tf_addr.setText("");
	   }

	   public void showMsg(String msg) {
			 JOptionPane.showMessageDialog(this, msg); 
		  }//showMsg
	
	}// JoinFormW



