package com.nol2.model.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.nol2.model.vo.ConvenientVO;

public class ConvenientDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	Properties pro;

	public ConvenientDAO() {
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

	public boolean insert(ConvenientVO vo) {
		connect();
		try {
			String sql = "insert into convenient values (?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getConno());
			pstmt.setInt(2, vo.getempno());
			pstmt.setString(3, vo.getConname());
			pstmt.setString(4, vo.getConinfo());
			pstmt.setString(5, vo.getConoperation());
			pstmt.setString(6, vo.getConlocation());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	public ConvenientVO select(String name) {
		connect();
		ConvenientVO convo = null;
		try {
			String sql = "select * from convenient where conname=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				convo = new ConvenientVO();
				convo.setConno(rs.getInt("conno"));
				convo.setempno(rs.getInt("empno"));
				convo.setConname(rs.getString("Conname"));
				convo.setConinfo(rs.getString("Coninfo"));
				convo.setConoperation(rs.getString("Conoperation"));
				convo.setConlocation(rs.getString("Conlocation"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return convo;
	}

	public boolean delete(int conno, int empno) {
		connect();
		try {
			String sql = "delete from convenient where conno=? and empno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, conno);
			pstmt.setInt(2, empno);
			int delete = pstmt.executeUpdate();
			if (delete == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	public boolean update(ConvenientVO vo) {
		connect();
		try {
			String sql = "update convenient set conno=?,empno=?,conname=?,coninfo=?,conoperation=?" + "conlocation=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getConno());
			pstmt.setInt(2, vo.getempno());
			pstmt.setString(3, vo.getConname());
			pstmt.setString(4, vo.getConinfo());
			pstmt.setString(5, vo.getConoperation());
			pstmt.setString(6, vo.getConlocation());
			int t = pstmt.executeUpdate();
			if (t == 1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	public ArrayList<ConvenientVO> selectAll() {
		ArrayList<ConvenientVO> list = new ArrayList<>();
		connect();
		try {
			String sql = "select * from conname=?";
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new ConvenientVO(rs.getInt("conno"), rs.getInt("empno"), rs.getString("conname"),
						rs.getString("coninfo"), rs.getString("conoperation"), rs.getString("conlocation")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
}