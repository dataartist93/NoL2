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

public class Join extends JFrame {
	   public JTextField tf_id, tf_name, tf_ssn1, tf_tel1, tf_tel2, tf_tel3, tf_addr;
	   public JPasswordField tf_pass, tf_pass2, tf_ssn2;
	   public JButton bt_submit, bt_reset, bt_checkid;
	   JLabel la_id, la_pass1, la_pass2, la_n, la_j, la_t, la_addr, la_protect;
	   JLabel jb[];
	   public JRadioButton  rb1;
	   public JRadioButton  rb2; 
	   ButtonGroup group;

	   public Join() {
	      setTitle("회원가입");

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

	      bt_submit = new JButton("등록");
	      bt_reset = new JButton("취소");
	      bt_checkid = new JButton("중복확인");
	      
	      rb1 = new JRadioButton("예");
	      rb2 = new JRadioButton("아니오"); 
	      group = new ButtonGroup();
	      group.add(rb1);
	      group.add(rb2);

	      la_id = new JLabel("I  D:");
	      la_pass1 = new JLabel("비  번:");
	      la_pass2 = new JLabel("비번확인:");
	      la_n = new JLabel("이  름:");
	      la_j = new JLabel("주민번호:");
	      la_t = new JLabel("전화번호:");
	      la_addr = new JLabel("주  소:");
	      la_protect = new JLabel("개인정보 동의 :");



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

	      bt_submit.setBounds(50, 370, 90, 25);
	      bt_reset.setBounds(150, 370, 90, 25);
	      bt_checkid.setBounds(190, 30, 90, 25);

	      la_id.setBounds(10, 30, 100, 25);
	      la_pass1.setBounds(10, 70, 100, 25);
	      la_pass2.setBounds(10, 110, 100, 25);
	      la_n.setBounds(10, 150, 100, 25);
	      la_j.setBounds(10, 190, 100, 25);
	      la_t.setBounds(10, 230, 100, 25);
	      la_addr.setBounds(10, 270, 100, 25);
	      la_protect.setBounds(10, 310, 100, 25);
	      
	      rb1.setBounds(110, 310, 50, 25);
	      rb2.setBounds(170, 310, 100, 25);



	      setLayout(null);
	      add(tf_id);
	      add(tf_pass);
	      add(tf_pass2);
	      add(tf_name);
	      add(tf_ssn1);
	      add(tf_ssn2);
	      add(tf_tel1);
	      add(tf_tel2);
	      add(tf_tel3);
	      add(tf_addr);

	      add(bt_submit);
	      add(bt_reset);
	      add(bt_checkid);

	      add(la_id);
	      add(la_pass1);
	      add(la_pass2);
	      add(la_n);
	      add(la_j);
	      add(la_t);
	      add(la_addr);
	      add(la_protect);
	      add(rb1);
	      add(rb2);


	      for (int i = 0; i < jb.length; i++) {
	         add(jb[i]);
	      }

	      setBounds(350, 200, 300, 450);
	      //setVisible(true);
	      setResizable(false);
	   }// 생성자
	   
	   public void init() {
		   tf_id.setText("");
		   tf_name.setText(""); 		   
		   tf_ssn1.setText("");
		   tf_ssn2.setText("");
		   tf_tel1.setText("");
		   tf_tel2.setText("");
		   tf_tel3.setText("");
		   tf_addr.setText("");
		   rb1.setSelected(false);
		   rb2.setSelected(false);
	   }

	   public void showMsg(String msg) {
			 JOptionPane.showMessageDialog(this, msg); 
		  }//showMsg
		 
	}// JoinFormW



