package com.nol2.model.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.nol2.model.vo.PrepassVO;

public class PrepassDAO {
	Connection conn;
	PreparedStatement stmt;
	ResultSet rs;
	
	Properties pro;
	
	public PrepassDAO() {
		try {
			pro = new Properties();
			pro.load(new FileReader("conn/conn.properties"));

			// 드라이버 로딩(제품군 선택)
			Class.forName(pro.getProperty("driver"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// 생성자

	private void connect() {// 연결객체 생성
		try {
			conn = DriverManager.getConnection(pro.getProperty("url"), pro);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// connect

	private void disconnect() {// DB자원 반환
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// disconnect
		
	public boolean insert(PrepassVO vo) {
		connect();
		//prepassno, cusno, rideno, prepasstime
		try {
			String sql = "insert into prepass values (?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, vo.getPrepassno());
			stmt.setInt(2, vo.getCusno());
			stmt.setInt(3, vo.getRideno());
			stmt.setString(4, vo.getPrepasstime());
			stmt.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
		
	}//insert
	
	public boolean delete(String delprepassno) {
		connect();
		try {
			String sql = "delete prepassno, cusno, rideno, prepasstime from prepass where prepassno=? ";
			stmt = conn.prepareStatement(sql);
			int t = stmt.executeUpdate();
			if (t == 1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		disconnect();
		}
		return false;
	}//delete
	
	public boolean update(PrepassVO vo) {
		connect();
		//prepassno, cusno, rideno, prepasstime
		try {
			String sql = "update prepass set prepassno=?,cusno=?,rideno=?,prepasstime=? where prepassno=?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, vo.getPrepassno());		
			stmt.setInt(2, vo.getCusno());
			stmt.setInt(3, vo.getRideno());
			stmt.setString(4, vo.getPrepasstime());
			int t = stmt.executeUpdate();
			if (t == 1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}//update
	
	public PrepassVO select(int upPrepassno) {
		connect();
		PrepassVO vo = null;
		try {
			String sql = "select prepassno, cusno, rideno, prepasstime from prepass where prepassno=?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, upPrepassno);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo = new PrepassVO();
				vo.setPrepassno(rs.getInt("prepassno"));
				vo.setCusno(rs.getInt("cusno"));
				vo.setRideno(rs.getInt("rideno"));
				vo.setPrepasstime(rs.getString("prepasstime"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return vo;
	}//select
	
	public ArrayList<PrepassVO> selectAll() {
		connect();
		ArrayList<PrepassVO>list = new ArrayList<>();
		//prepassno, cusno, rideno, prepasstime
		try {
			String sql = "select prepassno, cusno, rideno, prepasstime from prepass";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				list.add(new PrepassVO(
							rs.getInt("prepassno"),
							rs.getInt("cusno"),
							rs.getInt("rideno"),
							rs.getString("prepasstime")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		disconnect();
		}return list;
	}//selectAll

}
