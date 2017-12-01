package com.nol2.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class GuideView extends JFrame {

	public JLabel map;
	public JButton bt_at,bt_ct;
	public JButton bt_at1, bt_at2, bt_at3, bt_at4, bt_at5, bt_at6, bt_at7, bt_at8, bt_at9, bt_at10;
	public JButton bt_at11, bt_at12, bt_at13, bt_at14, bt_at15, bt_at16, bt_at17, bt_at18, bt_at19, bt_at20;
	public JButton bt_ct1, bt_ct2, bt_ct3, bt_ct4, bt_ct5, bt_ct6, bt_ct7, bt_ct8, bt_ct9, bt_ct10;

	
	public GuideView() {
		bt_at = new JButton("놀이기구");
		bt_at1 = new JButton("at1");
		  bt_at1.setVisible(false);
		bt_at2 = new JButton("at2");
		  bt_at2.setVisible(false);
		bt_at3 = new JButton("at3");
		  bt_at3.setVisible(false);
		bt_at4 = new JButton("at4");
		  bt_at4.setVisible(false);  
		bt_at5 = new JButton("at5");
		  bt_at5.setVisible(false);
		bt_at6 = new JButton("at6");
	  	  bt_at6.setVisible(false);
		bt_at7 = new JButton("at7");
		  bt_at7.setVisible(false);
		bt_at8 = new JButton("at8");
		  bt_at8.setVisible(false);
		bt_at9 = new JButton("at9");
		  bt_at9.setVisible(false);
		bt_at10 = new JButton("at10");
		  bt_at10.setVisible(false);
		bt_at11 = new JButton("at11");
		  bt_at11.setVisible(false);
		bt_at12 = new JButton("at12");
		  bt_at12.setVisible(false);
		bt_at13 = new JButton("at13");
		  bt_at13.setVisible(false);
		bt_at14 = new JButton("at14");
		  bt_at14.setVisible(false);
		bt_at15 = new JButton("at15");
		  bt_at15.setVisible(false);
		bt_at16 = new JButton("at16");
		  bt_at16.setVisible(false);
		bt_at17 = new JButton("at17");
		  bt_at17.setVisible(false);
		bt_at18 = new JButton("at18");
		  bt_at18.setVisible(false);
		bt_at19 = new JButton("at19");
		  bt_at19.setVisible(false);
		bt_at20 = new JButton("at20");
		  bt_at20.setVisible(false);
		
		bt_ct = new JButton("편의 시설");
		  bt_ct.setEnabled(true);
		bt_ct1 = new JButton("ct1");
		  bt_ct1.setVisible(false);
		bt_ct2 = new JButton("ct2");
		  bt_ct2.setVisible(false);
		bt_ct3 = new JButton("ct3");
		  bt_ct3.setVisible(false);
		bt_ct4 = new JButton("ct4");
		  bt_ct4.setVisible(false);
		bt_ct5 = new JButton("ct5");
		  bt_ct5.setVisible(false);
		bt_ct6 = new JButton("ct6");
		  bt_ct6.setVisible(false);
		bt_ct7 = new JButton("ct7");
		  bt_ct7.setVisible(false);
		bt_ct8 = new JButton("ct8");
		  bt_ct8.setVisible(false);
		bt_ct9 = new JButton("ct9");
		  bt_ct9.setVisible(false);
		bt_ct10 = new JButton("ct10");
		  bt_ct10.setVisible(false);
		bt_at.setBounds(601, 41, 142, 41);
		bt_at1.setBounds(420, 551, 124, 26);
		bt_at2.setBounds(599, 254, 124, 26);
		bt_at3.setBounds(367, 399, 124, 26);
		bt_at4.setBounds(527, 446, 124, 26);
		bt_at5.setBounds(367, 298, 124, 26);
		bt_at6.setBounds(163, 388, 124, 26);
		bt_at7.setBounds(253, 466, 124, 26);
		bt_at8.setBounds(50, 454, 124, 26);
		bt_at9.setBounds(197, 540, 124, 26);
		bt_at10.setBounds(29, 599, 124, 26);
		bt_at11.setBounds(163, 697, 124, 26);
		bt_at12.setBounds(232, 635, 124, 26);
		bt_at13.setBounds(268, 755, 124, 26);
		bt_at14.setBounds(420, 711, 124, 26);
		bt_at15.setBounds(420, 622, 124, 26);
		bt_at16.setBounds(491, 673, 124, 26);
		bt_at17.setBounds(599, 622, 124, 26);
		bt_at18.setBounds(670, 551, 124, 26);
		bt_at19.setBounds(599, 484, 124, 26);
		bt_at20.setBounds(572, 325, 124, 26);
		
		bt_ct.setBounds(602, 87, 142, 41);
		bt_ct1.setBounds(449, 484, 38, 26);
		bt_ct2.setBounds(529, 359, 38, 26);
		bt_ct3.setBounds(204, 433, 38, 26);
		bt_ct4.setBounds(685, 446, 38, 26);
		bt_ct5.setBounds(109, 540, 38, 26);
		bt_ct6.setBounds(109, 649, 38, 26);
		bt_ct7.setBounds(249, 599, 38, 26);
		bt_ct8.setBounds(339, 697, 38, 26);
		bt_ct9.setBounds(601, 584, 38, 26);
		bt_ct10.setBounds(449, 673, 38, 26);
		
		getContentPane().setLayout(null);
		getContentPane().add(bt_at);
		getContentPane().add(bt_at1);
		getContentPane().add(bt_at2);
		getContentPane().add(bt_at3);
		getContentPane().add(bt_at4);
		getContentPane().add(bt_at5);
		getContentPane().add(bt_at6);
		getContentPane().add(bt_at7);
		getContentPane().add(bt_at8);
		getContentPane().add(bt_at9);
		getContentPane().add(bt_at10);
		getContentPane().add(bt_at11);
		getContentPane().add(bt_at12);
		getContentPane().add(bt_at13);
		getContentPane().add(bt_at14);
		getContentPane().add(bt_at15);
		getContentPane().add(bt_at16);
		getContentPane().add(bt_at17);
		getContentPane().add(bt_at18);
		getContentPane().add(bt_at19);
		getContentPane().add(bt_at20);
		getContentPane().add(bt_ct);
		getContentPane().add(bt_ct1);
		getContentPane().add(bt_ct2);
		getContentPane().add(bt_ct3);
		getContentPane().add(bt_ct4);
		getContentPane().add(bt_ct5);
		getContentPane().add(bt_ct6);
		getContentPane().add(bt_ct7);
		getContentPane().add(bt_ct8);
		getContentPane().add(bt_ct9);
		getContentPane().add(bt_ct10);
		
		map = new JLabel("이미지");
		map.setIcon(new ImageIcon(""));
		
				map.setBounds(0, 0, 794, 815);
				getContentPane().add(map);

		
	    
		
		setBounds(400,100,800,850);
	    //setVisible(true);
	    setResizable(false);
	}//생성자
	
}
