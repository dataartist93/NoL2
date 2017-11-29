package com.nol2.model.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.nol2.model.vo.CusVO;



public class CusDAO {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
    Properties pro;
    
    public CusDAO() {
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
    }
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
    }
    public boolean insert(CusVO vo) {   
    	connect();
    	try {
			String sql="insert into customer values(?,?,?,?,?,?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,vo.getCusno());
			pstmt.setInt(2,vo.getEventno());
			pstmt.setString(3,vo.getID());
			pstmt.setString(4,vo.getPassword());
			pstmt.setInt(5,vo.getJumin1());
			pstmt.setInt(6,vo.getJumin2());
			pstmt.setString(7,vo.getName());
			pstmt.setString(8,vo.getTel());
			pstmt.setString(9,vo.getAddr());
			pstmt.setString(10,vo.getPerinfo());
			pstmt.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();			
		}
    	return false;
    }//insert
    
    public boolean delete(String delID) {
    	connect();
    	try {
			String sql="delete from customer where ID=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,delID);
			int t=pstmt.executeUpdate();
			if(t==1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();			
		}
    	return false;
    }//delete
    
    public boolean update(CusVO vo) {
    	connect();
    	try {
			String sql="update customer set Password=?,Tel=?,addr=? where ID=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,vo.getPassword());
			pstmt.setString(2,vo.getTel());
			pstmt.setString(3,vo.getAddr());
			int t= pstmt.executeUpdate();
			if(t==1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();			
		}
    	return false;
    }//update
    
    public CusVO select(String upID) {
    	connect();
    	CusVO cusvo=null;
    	try {
			String sql="select cusno,eventno,ID,Password,Jumin1,Jumin2,Name,Tel,addr,perinfo from customer where ID=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,upID);
			rs=pstmt.executeQuery();
			if(rs.next()) {
			 cusvo=new CusVO();
			 cusvo.setCusno(rs.getInt("cusno"));
			 cusvo.setEventno(rs.getInt("eventno"));
			 cusvo.setID(rs.getString("ID"));
			 cusvo.setPassword(rs.getString("Password"));
			 cusvo.setJumin1(rs.getInt("Jumin1"));
			 cusvo.setJumin2(rs.getInt("Jumin2"));
			 cusvo.setName(rs.getString("Name"));
			 cusvo.setTel(rs.getString("Tel"));
			 cusvo.setAddr(rs.getString("addr"));
			 cusvo.setPerinfo(rs.getString("perinfo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();			
		}
    	return cusvo;
    }//select
   
    public void selectAll() {
    	
    }

  
}//CusDAO
