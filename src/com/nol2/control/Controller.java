package com.nol2.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import com.nol2.model.ValidCheck;
import com.nol2.model.dao.CusDAO;
import com.nol2.model.vo.CusVO;
import com.nol2.view.EventView;
import com.nol2.view.FindIDView;
import com.nol2.view.FindPW_View;
import com.nol2.view.GuideView;
import com.nol2.view.Join;
import com.nol2.view.LoginForm;
import com.nol2.view.MainView;
import com.nol2.view.PayView;
import com.nol2.view.PaymentView;
import com.nol2.view.PrepassSmView;
import com.nol2.view.TicketView;

public class Controller implements ActionListener {
	MainView mainview;
	LoginForm loginform;
	Join joinview;
	FindIDView findidview;
	FindPW_View findpassview;
	TicketView ticketview;
	PayView payview;
	PaymentView paymentview;
	ValidCheck validcheck;
	PrepassSmView prepasssmview;
	EventView eventview;
	GuideView guideview;
	
	ImageIcon icon;
	

	String ticketname = null;

	public Controller() {
		mainview = new MainView();
		loginform = new LoginForm();
		findpassview = new FindPW_View();
		findidview = new FindIDView();
		joinview = new Join();
		ticketview = new TicketView();
		payview = new PayView();
		prepasssmview = new PrepassSmView();
		paymentview = new PaymentView();
		guideview = new GuideView();
		eventview = new EventView();
		eventUp();
	}

	public void eventUp() {
		// MainView
		mainview.bt_Login.addActionListener(this);
		mainview.bt_Logout.addActionListener(this);
		mainview.bt_Order.addActionListener(this);
		mainview.bt_FreePass.addActionListener(this);
		mainview.bt_Guide.addActionListener(this);
		mainview.bt_Event.addActionListener(this);
		mainview.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// LoginView
		loginform.bt_login.addActionListener(this);
		loginform.bt_join.addActionListener(this);
		loginform.bt_finId.addActionListener(this);
		loginform.bt_finPass.addActionListener(this);
		loginform.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				loginform.setVisible(false);
			}
		});

		// Find_IDView
		findidview.bt_submit.addActionListener(this);
		loginform.bt_join.addActionListener(this); // 회원가입창 열기

		findidview.bt_reset.addActionListener(this);
		findidview.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				findpassview.setVisible(false);
			}
		});

		// Find_PassView
		findpassview.bt_confirm.addActionListener(this);
		findpassview.bt_cancel.addActionListener(this);
		findpassview.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				findpassview.setVisible(false);
			}
		});

		// JoinView
		joinview.bt_checkid.addActionListener(this);
		joinview.bt_submit.addActionListener(this);
		joinview.bt_reset.addActionListener(this);
		joinview.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				joinview.setVisible(false);
			}
		});

		// TicketView
		ticketview.bt_FreeTicket.addActionListener(this);
		ticketview.bt_EnterTicket.addActionListener(this);
		ticketview.bt_ThemeTicket.addActionListener(this);
		ticketview.bt_pay.addActionListener(this);
		ticketview.bt_cancle.addActionListener(this);
		ticketview.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ticketview.setVisible(false);
				mainview.setVisible(true);
			}
		});

		// PayView
		payview.bt_submit.addActionListener(this);
		payview.bt_cancle.addActionListener(this);
		payview.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				payview.setVisible(false);
			}
		});
		
		//PrepassView
		prepasssmview.bt_submit.addActionListener(this);
		prepasssmview.bt_reset.addActionListener(this);
		prepasssmview.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				prepasssmview.setVisible(false);
				mainview.setVisible(true);
			}
		});
		
		//GuideView
		guideview.bt_at.addActionListener(this);
		guideview.bt_ct.addActionListener(this);
		guideview.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				guideview.setVisible(false);
				mainview.setVisible(true);
			}
		});
		
		//Event
		eventview.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				eventview.setVisible(false);
				mainview.setVisible(true);
			}
		});

	}

	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == mainview.bt_Login) { // MainView에서 로그인 버튼 클릭
			loginform.setVisible(true);
		}

		else if (ob == mainview.bt_Logout) { // MainView에서 로그아웃 버튼 클릭
			mainview.bt_Logout.setVisible(false);
			mainview.bt_MyPage.setVisible(false);
			mainview.bt_Login.setVisible(true);
			mainview.showMsg("로그아웃 되었습니다!");
		}
		
		else if (ob == mainview.bt_Order) { //MainView에서 티켓결제 버튼 클릭
			mainview.setVisible(false);
			ticketview.setVisible(true);
		}
		
		else if (ob == mainview.bt_FreePass) {//MainView에서 프리패스 버튼 클릭
			prepasssmview.setVisible(true);
		}
		
		else if (ob == mainview.bt_Guide) {//MainView에서 가이드 버튼 클릭
			mainview.setVisible(false);
			icon = new ImageIcon("image/nol2.gif");
			guideview.map.setIcon(icon);
			guideview.setVisible(true);
		}
		
		else if (ob == mainview.bt_Event) {
			mainview.setVisible(false);
			eventview.setVisible(true);
		}

		else if (ob == loginform.bt_join) { // LoginForm에서 회원가입 버튼 클릭
			loginform.setVisible(false);
			joinview.setVisible(true);
		}

		else if (ob == loginform.bt_finId) { // LoginForm에서 아이디 찾기 버튼 클릭
			findidview.setVisible(true);
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
				mainview.bt_MyPage.setVisible(true);
				loginform.setVisible(false);
			}

			else { // 로그인 실패
				loginform.showMsg("회원정보가 일치하지 않습니다.");
			}
		}

		else if (ob == findidview.bt_submit) { // FindIdView에서 확인 버튼 클릭
			CusDAO cusdao = new CusDAO();
			String Name = findidview.tf_name.getText();
			int Jumin1 = Integer.parseInt(findidview.tf_jumin1.getText());
			int Jumin2 = Integer.parseInt(findidview.tf_jumin2.getText());

			String FindID = cusdao.findID(Name, Jumin1, Jumin2);
			if (FindID != null) {
				findidview.showMsg("ID는 " + FindID + " 입니다.");
				findidview.init();
				findidview.setVisible(false);
			}

			else {
				findidview.init();
				findidview.showMsg("일치하는 정보가 없습니다.");
			}

		}

		else if (ob == findidview.bt_reset) {
			findidview.setVisible(false);
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

			else { // insert 실패

			}

			joinview.showMsg("주민등록번호를 제대로 입력하세요!");

		}

		else if (ob == joinview.bt_reset) { // JoinView에서 취소 버튼 클릭
			joinview.setVisible(false);
		}

		else if (ob == findpassview.bt_cancel) { // FindPassView에서 취소 버튼 클릭
			findpassview.setVisible(false);
		}

		else if (ob == ticketview.bt_cancle) { // TicketView에서 취소 버튼 클릭
			ticketview.setVisible(false);
			mainview.setVisible(true);
		}

		else if (ob == ticketview.bt_FreeTicket) { // TicketView에서 자유이용권 버튼을 클릭했을 때
			ticketname = "자유이용권";
			payview.setVisible(true);
		}

		else if (ob == ticketview.bt_ThemeTicket) { // TicketView에서 테마이용 버튼을 클릭했을 때
			ticketname = "테마이용권";
			payview.setVisible(true);
		}

		else if (ob == ticketview.bt_EnterTicket) { // TicketView에서 입장권 버튼을 클릭했을 때
			ticketname = "입장권";
			payview.setVisible(true);
		}

		else if (ob == payview.bt_submit) { // PayView에서 확인 버튼을 클릭했을 때

			if (!payview.cmb_adult.getSelectedItem().equals("0")) { // 어른 선택 시 테이블 추가
				Object[] obj = { ticketname, // 티켓이름
						payview.adult.getText(), // 구분
						payview.cmb_adult.getSelectedItem(), // 수량
						Integer.parseInt((String) payview.cmb_adult.getSelectedItem()) * 1000, // 가격
						payview.cmb_year.getSelectedItem() + "-" + payview.cmb_month.getSelectedItem() + "-" // 일자
								+ payview.cmb_date.getSelectedItem()

				};
				ticketview.dtm.addRow(obj);
			}

			if (!payview.cmb_child.getSelectedItem().equals("0")) { // 어린이 선택 시 테이블 추가
				Object[] obj = { ticketname, // 티켓이름
						payview.child.getText(), // 구분
						payview.cmb_child.getSelectedItem(), // 수량
						Integer.parseInt((String) payview.cmb_child.getSelectedItem()) * 1000, // 가격
						payview.cmb_year.getSelectedItem() + "-" + payview.cmb_month.getSelectedItem() + "-" // 일자
								+ payview.cmb_date.getSelectedItem()

				};
				ticketview.dtm.addRow(obj);
			}

			if (!payview.cmb_handy.getSelectedItem().equals("0")) { // 장애우 선택 시 테이블 추가
				Object[] obj = { ticketname, // 티켓이름
						payview.handy.getText(), // 구분
						payview.cmb_handy.getSelectedItem(), // 수량
						Integer.parseInt((String) payview.cmb_handy.getSelectedItem()) * 1000, // 가격
						payview.cmb_year.getSelectedItem() + "-" + payview.cmb_month.getSelectedItem() + "-" // 일자
								+ payview.cmb_date.getSelectedItem()

				};
				ticketview.dtm.addRow(obj);
			}
			ticketname = null;
			payview.init();
			payview.setVisible(false);
		}
		
		else if(ob == ticketview.bt_pay) { // TicketView에서 결제 버튼 클릭
			paymentview.setVisible(true);
		}

		else if (ob == payview.bt_cancle) {// PayView에서 취소 버튼을 클릭했을 때
			payview.setVisible(false);
		}
		
		else if (ob == prepasssmview.bt_submit) { //PrepasssmView에서 확인 버튼 클릭
			prepasssmview.setVisible(false);
		}
		
		else if (ob == guideview.bt_at) {//GuideView에서 놀이기구 버튼 클릭
			guideview.bt_ct1.setVisible(false);
			guideview.bt_ct2.setVisible(false);
			guideview.bt_ct3.setVisible(false);
			guideview.bt_ct4.setVisible(false);
			guideview.bt_ct5.setVisible(false);
			guideview.bt_ct6.setVisible(false);
			guideview.bt_ct7.setVisible(false);
			guideview.bt_ct8.setVisible(false);
			guideview.bt_ct9.setVisible(false);
			guideview.bt_ct10.setVisible(false);
			
			guideview.bt_at1.setVisible(true);
			guideview.bt_at2.setVisible(true);
			guideview.bt_at3.setVisible(true);
			guideview.bt_at4.setVisible(true);
			guideview.bt_at5.setVisible(true);
			guideview.bt_at6.setVisible(true);
			guideview.bt_at7.setVisible(true);
			guideview.bt_at8.setVisible(true);
			guideview.bt_at9.setVisible(true);
			guideview.bt_at10.setVisible(true);
		
		}
		
		else if(ob == guideview.bt_ct) {//GuideView에서 편의시설 버튼 클릭
			guideview.bt_at1.setVisible(false);
			guideview.bt_at2.setVisible(false);
			guideview.bt_at3.setVisible(false);
			guideview.bt_at4.setVisible(false);
			guideview.bt_at5.setVisible(false);
			guideview.bt_at6.setVisible(false);
			guideview.bt_at7.setVisible(false);
			guideview.bt_at8.setVisible(false);
			guideview.bt_at9.setVisible(false);
			guideview.bt_at10.setVisible(false);
			
			guideview.bt_ct1.setVisible(true);
			guideview.bt_ct2.setVisible(true);
			guideview.bt_ct3.setVisible(true);
			guideview.bt_ct4.setVisible(true);
			guideview.bt_ct5.setVisible(true);
			guideview.bt_ct6.setVisible(true);
			guideview.bt_ct7.setVisible(true);
			guideview.bt_ct8.setVisible(true);
			guideview.bt_ct9.setVisible(true);
			guideview.bt_ct10.setVisible(true);
		}
		
		
	
	}

	public static void main(String[] args) {
		new Controller();
	}

}
