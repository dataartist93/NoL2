package com.nol2.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainView extends JFrame {

    public JButton bt_Login,bt_Logout,bt_Order,bt_Guide,bt_Event,bt_FreePass,bt_MyPage;

    public MainView() {
      setTitle("환상의 나라");
      
      bt_Logout = new JButton("로그아웃");            
      bt_Login = new JButton("로그인");
      bt_MyPage = new JButton("내 정보");
      
      bt_Order = new JButton("티켓주문"); 
      bt_Guide = new JButton("시설안내"); 
      bt_Event = new JButton("이벤트"); 
      bt_FreePass = new JButton("프리패스");
      
      bt_Login.setBounds(660, 49, 101, 40);
        bt_Login.setVisible(true);
      bt_Logout.setBounds(660, 49, 101, 40);
        bt_Logout.setVisible(false);
      bt_Order.setBounds(126, 573, 566, 58);
      bt_Guide.setBounds(126, 713, 276, 40);
      bt_Event.setBounds(416, 713, 276, 40);
      bt_FreePass.setBounds(126, 643, 566, 58);
      bt_MyPage.setBounds(556, 49, 101, 40);
      
      getContentPane().setLayout(null);
      getContentPane().add(bt_Login);
      getContentPane().add(bt_Logout);
      getContentPane().add(bt_MyPage);
      getContentPane().add(bt_Order);
      getContentPane().add(bt_Guide);
      getContentPane().add(bt_Event);
      getContentPane().add(bt_FreePass);
      
      setBounds(400,100,800,850);
      setVisible(true);
      setResizable(false);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
       
   }//생성자 
    
    public static void main(String[] args) {
      new MainView();
   }
}