package com.nol2.view;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventView extends JFrame {

   public JButton bt_1, bt_2, bt_3, bt_4, bt_5, bt_6;

   public EventView() {

      bt_1 = new JButton(new ImageIcon("nol2_image/로티의 모험2.jpg"));//노리의 모험
      bt_1.setBorderPainted(false);
      bt_1.setContentAreaFilled(false);
      
       bt_2 = new JButton();
       bt_3 = new JButton();
       bt_4 = new JButton();
       bt_4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
          }
       });
       bt_5 = new JButton();
       bt_6 = new JButton();

      getContentPane().setLayout(null);
      bt_1.setBounds(16, 52, 539, 115);
      bt_2.setBounds(16, 227, 539, 115);
      bt_3.setBounds(16, 399, 539, 115);
      bt_4.setBounds(16, 574, 539, 115);
      bt_5.setBounds(16, 740, 539, 114);
      bt_6.setBounds(16, 907, 539, 115);

      getContentPane().add(bt_1);
      getContentPane().add(bt_2);
      getContentPane().add(bt_3);
      getContentPane().add(bt_4);
      getContentPane().add(bt_5);
      getContentPane().add(bt_6);

    
      setBounds(350, 200, 800, 1000);
      //setVisible(true);
      //setDefaultCloseOperation(EXIT_ON_CLOSE);

   }// 생성자

   public void showMsg(String msg) {
      JOptionPane.showMessageDialog(this, msg);
   }// showMsg
}