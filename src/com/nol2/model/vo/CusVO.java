package com.nol2.model.vo;

public class CusVO {
	
  private int cusno;
  private int eventno;
  private String ID;
  private String Password;
  private int Jumin1;
  private int Jumin2;
  private String Name;
  private String addr;
  private String perinfo;
  
public CusVO() {
	
}
public CusVO(int cusno, int eventno, String iD, String password, int jumin1, int jumin2, String name, String addr,
		String perinfo) {
	super();
	this.cusno = cusno;
	this.eventno = eventno;
	this.ID = iD;
	this.Password = password;
	this.Jumin1 = jumin1;
	this.Jumin2 = jumin2;
	this.Name = name;
	this.addr = addr;
	this.perinfo = perinfo;
}
public String toString() {
	return "CusVO [cusno=" + cusno + ", eventno=" + eventno + ", ID=" + ID + ", Password=" + Password + ", Jumin1="
			+ Jumin1 + ", Jumin2=" + Jumin2 + ", Name=" + Name + ", addr=" + addr + ", perinfo=" + perinfo + "]";
}
public int getCusno() {
	return cusno;
}
public void setCusno(int cusno) {
	this.cusno = cusno;
}
public int getEventno() {
	return eventno;
}
public void setEventno(int eventno) {
	this.eventno = eventno;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public int getJumin1() {
	return Jumin1;
}
public void setJumin1(int jumin1) {
	Jumin1 = jumin1;
}
public int getJumin2() {
	return Jumin2;
}
public void setJumin2(int jumin2) {
	Jumin2 = jumin2;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getPerinfo() {
	return perinfo;
}
public void setPerinfo(String perinfo) {
	this.perinfo = perinfo;
}
  
}
