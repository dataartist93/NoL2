package com.nol2.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.nol2.model.ValidCheck;
import com.nol2.model.dao.CusDAO;
import com.nol2.model.vo.CusVO;
import com.nol2.view.FindID;
import com.nol2.view.FindPW_View;
import com.nol2.view.Join;
import com.nol2.view.LoginForm;
import com.nol2.view.MainView;
import com.nol2.view.TicketView;

public class Controller implements ActionListener {
	MainView mainview;
	LoginForm loginform;
	Join joinview;
	FindID findidview;
	FindPW_View findpassview;
	TicketView ticketview;
	ValidCheck validcheck;

	public Controller() {
		mainview = new MainView();
		loginform = new LoginForm();
		findpassview = new FindPW_View();
		joinview = new Join();
		findidview = new FindID();
		ticketview = new TicketView();
		eventUp();
	}

	public void eventUp() {
		mainview.bt_Login.addActionListener(this);
		mainview.bt_Logout.addActionListener(this);
		mainview.bt_Order.addActionListener(this);

		loginform.bt_login.addActionListener(this);
		loginform.bt_join.addActionListener(this);
		loginform.bt_finPass.addActionListener(this);
		loginform.addWindowListener(new WindowAdapter() { // form에서 x버튼을 눌렀을 때!
			@Override
			public void windowClosing(WindowEvent e) {
				loginform.setVisible(false);
			}
		});

		findpassview.bt_confirm.addActionListener(this);
		findpassview.bt_cancel.addActionListener(this);
		findpassview.addWindowListener(new WindowAdapter() { // form에서 x버튼을 눌렀을 때!
			@Override
			public void windowClosing(WindowEvent e) {
				findpassview.setVisible(false);
			}
		});

		joinview.bt_checkid.addActionListener(this);
		joinview.bt_submit.addActionListener(this);
		joinview.bt_reset.addActionListener(this);
		joinview.addWindowListener(new WindowAdapter() { // form에서 x버튼을 눌렀을 때!
			@Override
			public void windowClosing(WindowEvent e) {
				joinview.setVisible(false);
			}
		});

		findidview.bt_submit.addActionListener(this);

		ticketview.bt_cancle.addActionListener(this);
		ticketview.addWindowListener(new WindowAdapter() { // form에서 x버튼을 눌렀을 때!
			@Override
			public void windowClosing(WindowEvent e) {
				ticketview.setVisible(false);
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == mainview.bt_Login) { // MainView에서 로그인 버튼 클릭
			loginform.setVisible(true);
		}

		else if (ob == mainview.bt_Order) {
			mainview.setVisible(false);
			ticketview.setVisible(true);
		}

		else if (ob == mainview.bt_Logout) {
			mainview.bt_Logout.setVisible(false);
			mainview.bt_Login.setVisible(true);
			mainview.showMsg("로그아웃 되었습니다!");
		}

		else if (ob == loginform.bt_join) { // LoginForm에서 회원가입 버튼 클릭
			loginform.setVisible(false);
			joinview.setVisible(true);
		}

		else if (ob == loginform.bt_finPass) { // LoginForm에서 비밀번호찾기 버튼 클릭
			findpassview.setVisible(true);
		}

		else if (ob == loginform.bt_login) { // LoginForm에서 로그인 버튼 클릭
			CusDAO cusdao = new CusDAO();

			String ID = loginform.tf_id.getText();
			String Password = loginform.tf_pass.getText();

			if (cusdao.selectLogin(ID, Password)) { // 로그인 성공
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

		else if (ob == findpassview.bt_confirm) { // FindPW_View에서 확인버튼 클릭
			CusDAO cusdao = new CusDAO();
			String ID = findpassview.tf_id.getText();
			String Tel = findpassview.tf_tel1.getText() + "-" + findpassview.tf_tel2.getText() + "-"
					+ findpassview.tf_tel3.getText();
			int Jumin1 = Integer.parseInt(findpassview.tf_jumin1.getText());
			int Jumin2 = Integer.parseInt(findpassview.pf_jumin2.getText());

			String Findpass = cusdao.findPass(ID, Tel, Jumin1, Jumin2);
			if (Findpass != null) {
				findpassview.showMsg("비밀번호는 " + Findpass + " 입니다.");
				findpassview.init();
				findpassview.setVisible(false);
			}

			else {
				findpassview.init();
				findpassview.showMsg("일치하는 정보가 없습니다!");
			}
		}

		else if (ob == joinview.bt_checkid) {
			CusDAO cusdao = new CusDAO();
			String ID = joinview.tf_id.getText();
			if (cusdao.checkID(ID)) {
				joinview.showMsg("이미 사용 중인 ID입니다.");
			}

			else {
				joinview.showMsg("사용 가능한 ID입니다.");
			}
		}

		else if (ob == joinview.bt_submit) { // JoinForm에서 등록 버튼 클릭
			CusDAO cusdao = new CusDAO();

			String ID = joinview.tf_id.getText();
			String Password = joinview.tf_pass.getText();
			int Jumin1 = Integer.parseInt(joinview.tf_ssn1.getText());
			int Jumin2 = Integer.parseInt(joinview.tf_ssn2.getText());
			String Name = joinview.tf_name.getText();
			String Tel = joinview.tf_tel1.getText() + "-" + joinview.tf_tel2.getText() + "-"
					+ joinview.tf_tel3.getText();
			String addr = joinview.tf_addr.getText();
			String perinfo = null;
			if (joinview.rb1.isSelected()) {
				perinfo = "Y";
			} else {
				perinfo = "N";
			}

				CusVO cusvo = new CusVO(0, 0, ID, Password, Jumin1, Jumin2, Name, Tel, addr, perinfo);

				if (cusdao.insert(cusvo)) { // insert 성공
					joinview.showMsg("가입되었습니다!"); 
					joinview.setVisible(false);
					joinview.init();
					loginform.setVisible(true);
					return;
				}

				/*else { // insert 실패
					joinview.showMsg("처리되지 않았습니다..");
				}*/

			else {
				joinview.showMsg("주민등록번호를 제대로 입력하세요!");
			}
		}

		else if (ob == joinview.bt_reset) {
			joinview.setVisible(false);
		}

		else if (ob == findidview.bt_submit) {
			CusDAO cusdao = new CusDAO();
			String Name = findidview.tf_name.getText();
			int ssn1 = Integer.parseInt(findidview.tf_ssn1.getText());
			int ssn2 = Integer.parseInt(findidview.tf_ssn2.getText());

			String ID = cusdao.findID(Name, ssn1, ssn2);

			findidview.showMsg(ID);
		}

		else if (ob == findpassview.bt_cancel) {
			findpassview.setVisible(false);
		}

		else if (ob == ticketview.bt_cancle) {
			ticketview.setVisible(false);
			mainview.setVisible(true);
		}
	}

	public static void main(String[] args) {
		new Controller();
	}

}
