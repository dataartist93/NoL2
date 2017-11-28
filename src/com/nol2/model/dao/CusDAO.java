package com.nol2.model.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;



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
    public void insert() {
    	
    }
    public void delete() {
    	
    }
    public void update() {
    	
    }
    public void select() {
    	
    }
    public void selectAll() {
    	
    }
  
}//CusDAO
