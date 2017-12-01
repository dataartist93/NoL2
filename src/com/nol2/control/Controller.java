package com.nol2.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.nol2.model.dao.CusDAO;
import com.nol2.model.vo.CusVO;
import com.nol2.view.FindIDView;
import com.nol2.view.JoinView;
import com.nol2.view.LoginForm;
import com.nol2.view.MainView;

public class Controller implements ActionListener {
	MainView mainview;
	LoginForm loginform;
	JoinView joinview;

	FindIDView findidview;

	public Controller() {
		mainview = new MainView();
		loginform = new LoginForm();
		joinview = new JoinView();
		findidview = new FindIDView();
		eventUp();
	}

	public void eventUp() {
		mainview.bt_Login.addActionListener(this);
		joinview.bt_submit.addActionListener(this);
		findidview.bt_submit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if(ob == mainview.bt_Login) {
			loginform.setVisible(true);
		}
		
		else if (ob == joinview.bt_submit) {
			CusDAO cusdao = new CusDAO();

			String ID = joinview.tf_id.getText();
			String Password = joinview.tf_pass.getText();
			int Jumin1 = Integer.parseInt(joinview.tf_ssn1.getText());
			int Jumin2 = Integer.parseInt(joinview.tf_ssn2.getText());
			;
			String Name = joinview.tf_name.getText();
			String Tel = joinview.tf_tel1.getText() + "-" + joinview.tf_tel2.getText() + "-"
					+ joinview.tf_tel3.getText();
			String addr = joinview.tf_addr.getText();
			String perinfo = "ok";
			CusVO cusvo = new CusVO(0, 0, ID, Password, Jumin1, Jumin2, Name, Tel, addr, perinfo);

			cusdao.insert(cusvo);
		}

		else if (ob == findidview.bt_submit) {
			CusDAO cusdao = new CusDAO();
			String Name = findidview.tf_name.getText();
			int ssn1 = Integer.parseInt(findidview.tf_jumin1.getText());
			int ssn2 = Integer.parseInt(findidview.tf_jumin2.getText());

			String ID = cusdao.findID(Name, ssn1, ssn2);

			findidview.showMsg(ID);
		}
	}

	public static void main(String[] args) {
		new Controller();
	}

}
