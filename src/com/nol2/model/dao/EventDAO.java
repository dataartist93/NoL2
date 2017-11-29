package com.nol2.model.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.nol2.model.vo.EventVO;
import com.nol2.model.vo.RideVO;

public class EventDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	Properties pro;
	public EventDAO() {
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
			public boolean insert(EventVO vo) {
				connect();
				try {
					String sql = "insert into event values(?,?,?,?,?,?,?)";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, vo.getEventno());
					pstmt.setInt(2, vo.getEmpno());
					pstmt.setString(3, vo.getEventname());
					pstmt.setString(4, vo.getEventinfo());
					pstmt.setString(5, vo.getEventtime());
					pstmt.setString(6, vo.getEventlocation());
					pstmt.setString(7, vo.getEvents());
					
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
			public boolean delete(String eventname) {
				connect();
				try {
					String sql = "delete from event where eventname like ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, eventname);
					
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
			public boolean update(EventVO vo) {
				connect();
				try {
					String sql = "update event set empno=?,eventname=?,eventinfo=?,eventtime=?,"
							+ "eventlocation=?,events=? where eventno=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, vo.getEmpno());
					pstmt.setString(2, vo.getEventname());
					pstmt.setString(3, vo.getEventinfo());
					pstmt.setString(4, vo.getEventtime());
					pstmt.setString(5, vo.getEventlocation());
					pstmt.setString(6, vo.getEvents());
					pstmt.setInt(7, vo.getEventno());
					
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
			public EventVO select(String eventname) {
				connect();
				EventVO eventvo = null;
				try {
					String sql = "select * from event where eventname like ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, eventname);
					rs = pstmt.executeQuery();
					if (rs.next()) {
						eventvo = new EventVO();
						eventvo.setEventno(rs.getInt("eventno"));
						eventvo.setEmpno(rs.getInt("empno"));
						eventvo.setEventname(rs.getString("eventname"));
						eventvo.setEventinfo(rs.getString("eventinfo"));
						eventvo.setEventtime(rs.getString("eventtime"));
						eventvo.setEventlocation(rs.getString("eventlocation"));
						eventvo.setEvents(rs.getString("events"));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					disconnect();
				}
				return eventvo;
			}
			
			public ArrayList<EventVO> selectAll() {
				connect();
				ArrayList<EventVO> list = new ArrayList<>();

				try {
					String sql = "select * from ride";
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery();
					while (rs.next()) {
						list.add(new EventVO(rs.getInt("eventno"), rs.getInt("empno"), rs.getString("eventname"),
											 rs.getString("eventinfo"), rs.getString("eventtime"), rs.getString("eventlocation"),
											 rs.getString("events")));

					} // while
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					disconnect();
				}
				return list;
			}// sellectAll
			
	
	
}
