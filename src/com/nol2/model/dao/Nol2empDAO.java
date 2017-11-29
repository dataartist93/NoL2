package com.nol2.model.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.nol2.model.vo.Nol2empVO;
import com.nol2.model.vo.Nol2empVO;

public class Nol2empDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	Properties pro;

	public Nol2empDAO() {
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
	}/*
		 * private int empno; private String empid; private String emppass; private int
		 * Jumin1; private int Jumin2; private String Name; private String Tel; private
		 * String addr; private int sal; private String dname;
		 */

	public boolean insert(Nol2empVO vo) {
		connect();
		try {
			String sql = "insert into Nol2emp values (?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmpno());
			pstmt.setString(2, vo.getEmpid());
			pstmt.setString(3, vo.getEmppass());
			pstmt.setInt(4, vo.getJumin1());
			pstmt.setInt(5, vo.getJumin2());
			pstmt.setString(6, vo.getName());
			pstmt.setString(7, vo.getTel());
			pstmt.setString(8, vo.getAddr());
			pstmt.setInt(9, vo.getSal());
			pstmt.setString(10, vo.getDname());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}
	/*
	 * private int empno; private String empid; private String emppass; private int
	 * Jumin1; private int Jumin2; private String Name; private String Tel; private
	 * String addr; private int sal; private String dname;
	 */

	public Nol2empVO select(String nempno) {
		connect();
		Nol2empVO empvo = null;
		try {
			String sql = "select * from Nol2emp where empno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, nempno);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				empvo = new Nol2empVO();
				empvo.setEmpno(rs.getInt("empno"));
				empvo.setEmpid(rs.getString("empid"));
				empvo.setEmppass(rs.getString("emppass"));
				empvo.setJumin1(rs.getInt("Jumin1"));
				empvo.setJumin2(rs.getInt("Jumin2"));
				empvo.setName(rs.getString("name"));
				empvo.setTel(rs.getString("tel"));
				empvo.setAddr(rs.getString("addr"));
				empvo.setSal(rs.getInt("addr"));
				empvo.setDname(rs.getString("dname"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return empvo;
	}

	public boolean delete(int empno) {
		connect();
		try {
			String sql = "delete from Nol2emp where empno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
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

	public boolean update(Nol2empVO vo) {
		connect();
		try {
			String sql = "update Nol2emp set empno=?, empid=?, emppass=?, jumin1=?, jumin2=?, name=?, tel=?, addr=?, sal=?, dname=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmpno());
			pstmt.setString(2, vo.getEmpid());
			pstmt.setString(3, vo.getEmppass());
			pstmt.setInt(4, vo.getJumin1());
			pstmt.setInt(5, vo.getJumin2());
			pstmt.setString(6, vo.getName());
			pstmt.setString(7, vo.getTel());
			pstmt.setString(8, vo.getAddr());
			pstmt.setInt(9, vo.getSal());
			pstmt.setString(10, vo.getDname());
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

	public ArrayList<Nol2empVO> selectAll() {
		ArrayList<Nol2empVO> list = new ArrayList<>();
		connect();
		try {
			String sql = "select * from empno=?";
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new Nol2empVO(rs.getInt("empno"), rs.getString("empid"), rs.getString("emppass"),
						rs.getInt("Jumin1"), rs.getInt("Jumin2"), rs.getString("Name"), rs.getString("Tel"), rs.getString("addr")
						, rs.getInt("sal"), rs.getString("dname")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
}