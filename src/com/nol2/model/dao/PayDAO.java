package com.nol2.model.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.nol2.model.vo.PayVO;


public class PayDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
    Properties pro;
    
    public PayDAO() {
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
    }//connect
    
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
    }//disconnect
    
    public boolean insert(PayVO vo) {
    	connect();
    	try {
			String sql="insert into Pay values (?,?,?,?,?,?,?)";
			  pstmt = conn.prepareStatement(sql);
			    pstmt.setInt(1,vo.getPayno());
			    pstmt.setInt(2,vo.getCusno());
			    pstmt.setInt(3,vo.getEmpno());
			    pstmt.setInt(4,vo.getTicketno());
			    pstmt.setString(5,vo.getCoupon());
			    pstmt.setString(6,vo.getPaydate());
			    pstmt.setString(7,vo.getPayment());
			   pstmt.executeUpdate();
			   
			   return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
    	   return false;
   }//insert
    
    //티켓 환불
    public boolean delete(int delPayno) {
    	connect();
        try {
			String sql = "delete * from pay where payno=?";
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
    }
   
    //티켓 페이지에서 결제 페이지 이동
    public ArrayList<PayVO> selectAll() {
    	connect();
    	
    	ArrayList<PayVO> list = new ArrayList<>();
    	
    	try {
			String sql = "select payno,cusno,empno,ticketno,coupon,paydate,payment"
					    + "from Pay";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				list.add(new PayVO(
						rs.getInt("payno"),
						rs.getInt("cusno"),
						rs.getInt("empno"),
						rs.getInt("ticketno"),
						rs.getString("coupon"),
						rs.getString("paydate"),
						rs.getString("payment")			
						));
			}//while
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {  	
    	disconnect();
		}
    	return list;
    }

}
