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
import com.nol2.model.vo.RideVO;


public class RideDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	Properties pro;

	public RideDAO() {
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
	
	// insert
		public boolean insert(RideVO vo) {
			connect();
			try {
				String sql = "insert into ride values(?,?,?,?,?,?,?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, vo.getRideno());
				pstmt.setInt(2, vo.getEmpno());
				pstmt.setString(3, vo.getRidename());
				pstmt.setString(4, vo.getRideinfo());
				pstmt.setString(5, vo.getOperation());
				pstmt.setString(6, vo.getOpertime());
				pstmt.setInt(7, vo.getWaittime());
				pstmt.setString(8, vo.getRidelimit());
				pstmt.setString(9, vo.getCountpeople());
				pstmt.setString(10, vo.getLocation());
				pstmt.setInt(11, vo.getCountride());
				pstmt.executeUpdate();

				return true;
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			return false;
		}
		
		// delete
		public boolean delete(String ridename) {
			connect();
			try {
				String sql = "delete from ride where ridename like ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, ridename);
				
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
		
		// update
		public boolean update(RideVO vo) {
			connect();
			try {
				String sql = "update customer set empno=?,ridename=?,rideinfo=?,operation=?,"
						+ "opertime=?,waittime=?,ridelimit=?,countpeople=?,location=?,countride=? where rideno=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, vo.getEmpno());
				pstmt.setString(2, vo.getRidename());
				pstmt.setString(3, vo.getRideinfo());
				pstmt.setString(4, vo.getOperation());
				pstmt.setString(5, vo.getOpertime());
				pstmt.setInt(6, vo.getWaittime());
				pstmt.setString(7, vo.getRidelimit());
				pstmt.setString(8, vo.getCountpeople());
				pstmt.setString(9, vo.getLocation());
				pstmt.setInt(10, vo.getCountride());
				pstmt.setInt(11, vo.getRideno());
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
		
		// select
		public RideVO select(String ridename) {
			connect();
			RideVO ridevo = null;
			try {
				String sql = "select * from ride where ridename like ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, ridename);
				rs = pstmt.executeQuery();
				if (rs.next()) {
					ridevo = new RideVO();
					ridevo.setRideno(rs.getInt("rideno"));
					ridevo.setEmpno(rs.getInt("empno"));
					ridevo.setRidename(rs.getString("ridename"));
					ridevo.setRideinfo(rs.getString("rideinfo"));
					ridevo.setOperation(rs.getString("operation"));
					ridevo.setOpertime(rs.getString("opertime"));
					ridevo.setWaittime(rs.getInt("waittime"));
					ridevo.setRidelimit(rs.getString("ridelimit"));
					ridevo.setCountpeople(rs.getString("countpeople"));
					ridevo.setLocation(rs.getString("location"));
					ridevo.setCountride(rs.getInt("countride"));
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			return ridevo;
		}
		
		public ArrayList<RideVO> selectAll() {
			connect();
			ArrayList<RideVO> list = new ArrayList<>();

			try {
				String sql = "select * from ride";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					list.add(new RideVO(rs.getInt("rideno"), rs.getInt("empno"), rs.getString("ridename"), rs.getString("rideinfo"),
										rs.getString("operation"), rs.getString("opertime"), rs.getInt("waittime"), rs.getString("ridelimit"),
										rs.getString("countpeople"), rs.getString("location"), rs.getInt("countride")));

				} // while
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			return list;
		}// sellectAll

		
}
