package com.nol2.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.nol2.model.dao.CusDAO;
import com.nol2.model.vo.CusVO;
import com.nol2.view.JoinView;

public class Controller implements ActionListener{
	JoinView joinview;
	
	
	public Controller() {
		joinview = new JoinView();
		eventUp();
	}

	public void eventUp() {
		joinview.bt_submit.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if(ob == joinview.bt_submit) {
			CusDAO cusdao = new CusDAO();
			
			String ID = joinview.tf_id.getText();
			String Password = joinview.tf_pass.getText();
			int Jumin1 = Integer.parseInt(joinview.tf_ssn1.getText());
			int Jumin2 = Integer.parseInt(joinview.tf_ssn2.getText());;
			String Name = joinview.tf_name.getText();
			String Tel = joinview.tf_tel1.getText() + "-" + joinview.tf_tel2.getText() + "-" + joinview.tf_tel3.getText();
			String addr = joinview.tf_addr.getText();
			String perinfo = "ok"; 
			CusVO cusvo = new CusVO(0, 0, ID, Password, Jumin1,Jumin2, Name, Tel ,addr, perinfo);
			
			cusdao.insert(cusvo);
		}
	}


	
	public static void main(String[] args) {
		System.out.println("야호");
		new Controller();
	}

	
}
