package com.nol2.model.vo;

public class CusVO {
	
  private int cusno;
  private int eventno;
  private String ID;
  private String Password;
  private int Jumin1;
  private int Jumin2;
  private String Name;
  private String Tel;
  private String addr;
  private String perinfo;
  
public CusVO() {
	
}

public CusVO(int cusno,int eventno, String ID, String Password, int Jumin1, int Jumin2, String Name, String Tel,
		String addr, String perinfo) {
	super();
	this.cusno=cusno;
	this.eventno = eventno;
	this.ID = ID;
	this.Password = Password;
	this.Jumin1 = Jumin1;
	this.Jumin2 = Jumin2;
	this.Name = Name;
	this.Tel = Tel;
	this.addr = addr;
	this.perinfo = perinfo;
}

public String toString() {
	return "CusVO [cusno=" + cusno + ", eventno=" + eventno + ", ID=" + ID + ", Password=" + Password + ", Jumin1="
			+ Jumin1 + ", Jumin2=" + Jumin2 + ", Name=" + Name + ", Tel=" + Tel + ", addr=" + addr + ", perinfo="
			+ perinfo + "]";
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

public void setID(String ID) {
	ID = ID;
}

public String getPassword() {
	return Password;
}

public void setPassword(String Password) {
	Password = Password;
}

public int getJumin1() {
	return Jumin1;
}

public void setJumin1(int Jumin1) {
	Jumin1 = Jumin1;
}

public int getJumin2() {
	return Jumin2;
}

public void setJumin2(int Jumin2) {
	Jumin2 = Jumin2;
}

public String getName() {
	return Name;
}

public void setName(String Name) {
	Name = Name;
}

public String getTel() {
	return Tel;
}

public void setTel(String Tel) {
	Tel = Tel;
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
