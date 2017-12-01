package com.nol2.model.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.nol2.model.vo.TicketVO;

public class TicketDAO {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	Properties pro;

	public TicketDAO() {
		try {
			pro = new Properties();
			pro.load(new FileReader("conn/conn.properties"));

			Class.forName(pro.getProperty("driver"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void connect() {
		try {
			conn = DriverManager.getConnection(pro.getProperty("url"), pro);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// connect

	private void disconnect() {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// disconnect
	
	public boolean insert(TicketVO vo) {
		connect();

		try {
			String sql = "insert into Ticket values (?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getTicketno());
			pstmt.setInt(2, vo.getEmpno());
			pstmt.setString(3, vo.getTicketinfo());
			pstmt.setInt(4, vo.getPrice());
			pstmt.setString(5, vo.getDiscount());
			pstmt.setString(6, vo.getTickets());
			pstmt.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}// insert
	
	public boolean delete(int delPayno) {
	        connect();
	        try {
				String sql = "delete from pay where payno=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, delPayno);
				int t = pstmt.executeUpdate();
				if (t == 1)
					return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
	        disconnect();
			}
	        return false;
	}//delete
	
	//구매한 티켓의 정보 표시
	public TicketVO select(String tickets) {
	connect();
	TicketVO vo = null;
	try {
		String sql = "select ticketno,empno,ticketInfo,price,discount,tickets from ticket where tickets=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, tickets);
		rs = pstmt.executeQuery();
		if (rs.next()) {
			vo = new TicketVO();
			vo.setTicketno(rs.getInt("ticketno"));
			vo.setEmpno(rs.getInt("empno"));
			vo.setTicketinfo(rs.getString("ticketinfo"));
			vo.setPrice(rs.getInt("price"));
			vo.setDiscount(rs.getString("discount"));
			vo.setTickets(rs.getString("tickets"));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		disconnect();	
	}
     return vo;
	}//select

	// 구매한 티켓의 정보를 표시해준다.
	public ArrayList<TicketVO> selectAll() {
		connect();
		ArrayList<TicketVO> list = new ArrayList<>();

		try {
			String sql = "select TICKETNO,EMPNO,TICKETINFO,PRICE,DISCOUNT,TICKETS" + "from Ticket";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new TicketVO(rs.getInt("ticketNo"), rs.getInt("empNo"), rs.getString("ticketInfo"),
						rs.getInt("price"), rs.getString("discount"), rs.getString("tickets")));

			} // while
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
<<<<<<< HEAD

=======
>>>>>>> upstream/master
	}// sellectAll

}// TicketDAO
