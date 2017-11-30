package com.nol2.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JoinView extends JFrame {
	
	
		public JTextField tf_id,tf_name,tf_ssn1,tf_tel1,tf_tel2,tf_tel3,tf_addr;
		public JPasswordField tf_pass,tf_pass2,tf_ssn2;
		public JButton bt_submit,bt_reset,bt_checkid;
		JLabel la_id,la_pass1,la_pass2,la_n,la_j,la_t,la_addr,la_job;
		public JComboBox<String> cb_job;
		JLabel jb[];
		
		
	  public JoinView()
		{	  
			setTitle("ȸ������");
			
			jb = new JLabel[3];		
			//String jobT[]= {"�л�","������","���/����","����/����","�Ϲݻ繫��","������","���/������","����/�Ƿ�","�ڿ���","�ֺ�","��Ÿ"};
			
			/*for(int i=0; i<jb.length; i++)
			{
			   jb[i]=new JLabel("-");
			}
			*/
			tf_id = new JTextField();
			tf_pass = new JPasswordField();
			tf_pass2 = new JPasswordField();
			tf_name= new JTextField();
			tf_ssn1 = new JTextField();
			tf_ssn2 = new JPasswordField();
			tf_tel1 = new JTextField();
			tf_tel2 = new JTextField();
			tf_tel3 = new JTextField();
			tf_addr = new JTextField();
			
		    bt_submit = new JButton("���");
		    bt_reset = new JButton("���");
			bt_checkid = new JButton("�ߺ�Ȯ��");
			
			la_id = new JLabel("I  D:");
			la_pass1 = new JLabel("��  ��:");
			la_pass2 = new JLabel("���Ȯ��:");
			la_n = new JLabel("��  ��:");
			la_j = new JLabel("�ֹι�ȣ:");
			la_t = new JLabel("��ȭ��ȣ:");
			la_addr = new JLabel("��  ��:");
			//la_job = new JLabel("��  ��:");
			
			//cb_job = new JComboBox<String>(jobT);		
			
			
			tf_id.setBounds(80,30,100,25);
			tf_pass.setBounds(80,70,100,25);
			tf_pass2.setBounds(80,110,100,25);
			tf_name.setBounds(80,150,100,25);
			
			tf_ssn1.setBounds(80,190,50,25);
			//jb[0].setBounds(131,190,8,25);
			tf_ssn2.setBounds(140,190,50,25);
			
			tf_tel1.setBounds(80,230,40,25);
			//jb[1].setBounds(121,230,8,25);
			tf_tel2.setBounds(130,230,40,25);
			//jb[2].setBounds(171,230,8,25);
			tf_tel3.setBounds(180,230,40,25);
			
			tf_addr.setBounds(80,270,200,25);
			
			bt_submit.setBounds(50,370,90,25);
			bt_reset.setBounds(150,370,90,25);
			bt_checkid.setBounds(190,30,90,25);
			
			la_id.setBounds(10,30,100,25);
			la_pass1.setBounds(10,70,100,25);
			la_pass2.setBounds(10,110,100,25);
			la_n.setBounds(10,150,100,25);
			la_j.setBounds(10,190,100,25);
			la_t.setBounds(10,230,100,25);
			la_addr.setBounds(10,270,100,25);
			//la_job.setBounds(10,310,100,25);
			
			//cb_job.setBounds(80,310,100,25);
			
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
			//add(la_job); 
			
			//add(cb_job);
					
			/*for(int i=0; i<jb.length; i++)
			{
				add(jb[i]);
			}*/
			
			setBounds(350,200,300,450);		
			//setVisible(true);
			setResizable(false);
		}//������  
	  
	  public void showMsg(String msg) {
			 JOptionPane.showMessageDialog(this, msg); 
		  }//showMsg
	  
	
	   
	}//JoinForm























