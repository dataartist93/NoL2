package com.nol2.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.nol2.model.dao.CusDAO;
import com.nol2.model.vo.CusVO;
import com.nol2.view.FindID;
import com.nol2.view.FindPW_View;
import com.nol2.view.Join;
import com.nol2.view.LoginForm;
import com.nol2.view.MainView;

public class Controller implements ActionListener {
	MainView mainview;
	LoginForm loginform;
	Join joinview;
	FindID findidview;
	FindPW_View findpassview;

	public Controller() {
		mainview = new MainView();
		loginform = new LoginForm();
		findpassview = new FindPW_View();
		joinview = new Join();
		findidview = new FindID();
		eventUp();
	}

	public void eventUp() {
		mainview.bt_Login.addActionListener(this);
		mainview.bt_Logout.addActionListener(this);
		
		loginform.bt_login.addActionListener(this);
		loginform.bt_join.addActionListener(this);
		loginform.bt_finPass.addActionListener(this);
		
		joinview.bt_submit.addActionListener(this);
		findidview.bt_submit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if(ob == mainview.bt_Login) { // MainView에서 로그인 버튼 클릭
			loginform.setVisible(true);
		}
		
		else if(ob == mainview.bt_Logout) {
			mainview.bt_Logout.setVisible(false);
			mainview.bt_Login.setVisible(true);
			mainview.showMsg("로그아웃 되었습니다!");
		}
		
		else if(ob == loginform.bt_join) { // LoginForm에서 회원가입 버튼 클릭
			loginform.setVisible(false);
			joinview.setVisible(true);
		}
		
		else if(ob == loginform.bt_finPass) { // LoginForm에서 비밀번호찾기 버튼 클릭
			findpassview.setVisible(true);
		}
		
		else if(ob == loginform.bt_login) { // LoginForm에서 로그인 버튼 클릭
			CusDAO cusdao = new CusDAO();
			
			String ID = loginform.tf_id.getText();
			String Password = loginform.tf_pass.getText();
			
			if(cusdao.selectLogin(ID, Password)) { // 로그인 성공
				loginform.showMsg("로그인 되었습니다!");
				loginform.init();
				mainview.bt_Login.setVisible(false);
				mainview.bt_Logout.setVisible(true);
				loginform.setVisible(false);
			}
			
			else { // 로그인 실패
				loginform.showMsg("실패 ..");
			}
			
		}
		
		else if(ob == findpassview.bt_confirm) { // FindPW_View에서 확인버튼 클릭
			CusDAO cusdao = new CusDAO();
			
		}
		
		
		else if (ob == joinview.bt_submit) { // JoinForm에서 등록 버튼 클릭
			CusDAO cusdao = new CusDAO();

			String ID = joinview.tf_id.getText();
			String Password = joinview.tf_pass.getText();
			int Jumin1 = Integer.parseInt(joinview.tf_ssn1.getText());
			int Jumin2 = Integer.parseInt(joinview.tf_ssn2.getText());
			String Name = joinview.tf_name.getText();
			String Tel = joinview.tf_tel1.getText() + "-" + joinview.tf_tel2.getText() + "-" + joinview.tf_tel3.getText();
			String addr = joinview.tf_addr.getText();
			String perinfo = null;
			if(joinview.rb1.isSelected()) {
				perinfo = "Y";		
			}
			else {
				perinfo = "N";	
			}
			
			CusVO cusvo = new CusVO(0, 0, ID, Password, Jumin1, Jumin2, Name, Tel, addr, perinfo); 

			if(cusdao.insert(cusvo)) { // insert 성공
				joinview.showMsg("가입되었습니다!");
				joinview.setVisible(false);
				joinview.init(); 
				loginform.setVisible(true);				
			}
			
			else { // insert 실패
				joinview.showMsg("처리되지 않았습니다..");
			}			
		}

		else if (ob == findidview.bt_submit) {
			CusDAO cusdao = new CusDAO();
			String Name = findidview.tf_name.getText();
			int ssn1 = Integer.parseInt(findidview.tf_ssn1.getText());
			int ssn2 = Integer.parseInt(findidview.tf_ssn2.getText());

			String ID = cusdao.findID(Name, ssn1, ssn2);

			findidview.showMsg(ID);
		}
	}

	public static void main(String[] args) {
		new Controller();
	}

}
