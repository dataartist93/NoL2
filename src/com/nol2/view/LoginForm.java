package com.nol2.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame 
{
    public JTextField tf_id;
    public JPasswordField tf_pass;
    public JButton bt_login,bt_join,bt_finId,bt_finPass;
   JLabel la_id,la_pass;
   
  public LoginForm()
   {      
      setTitle("Login Form");
      
      tf_id = new JTextField();           
      tf_pass = new JPasswordField();
      
      bt_login = new JButton("로그인");
      bt_finId = new JButton("아이디 찾기");
      bt_finPass = new JButton("비밀번호 찾기");
      bt_join = new JButton("회원가입");
   
       la_id = new JLabel("I  D");
      la_pass = new JLabel("Password");
      
      tf_id.setBounds(127,156,236,25);
      tf_pass.setBounds(127,193,236,25);
      bt_login.setBounds(40,235,323,41);
      bt_finId.setBounds(40, 288, 107, 25);
      bt_finPass.setBounds(149, 288, 123, 25);
      bt_join.setBounds(274,288,89,25);
      la_id.setBounds(40,156,79,25);
      la_pass.setBounds(40,193,79,25);
      
      getContentPane().setLayout(null);
      getContentPane().add(tf_id);
      getContentPane().add(tf_pass);
      getContentPane().add(bt_login);
      getContentPane().add(bt_finId);
      getContentPane().add(bt_finPass);
      getContentPane().add(bt_join);
      getContentPane().add(la_id);
      getContentPane().add(la_pass);
      
      setBounds(400,300,409,401);
     // setVisible(true);
      setResizable(false);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   
   }//생성자   
  public static void main(String[] args) {
   new LoginForm();
}
    
}//LoginForm
