package com.nol2.model.vo;

public class Nol2empVO {
private	int empno;
private	String empid;
private	String emppass;
private	int Jumin1;
private	int Jumin2;
private	String Name;
private	String Tel;
private	String addr;
private	int sal;
private	String dname;

	public Nol2empVO() {

	}

	public Nol2empVO(int empno, String empid, String emppass, int jumin1, int jumin2, String name, String tel,
			String addr, int sal, String dname) {
		super();
		this.empno = empno;
		this.empid = empid;
		this.emppass = emppass;
		Jumin1 = jumin1;
		Jumin2 = jumin2;
		Name = name;
		Tel = tel;
		this.addr = addr;
		this.sal = sal;
		this.dname = dname;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmppass() {
		return emppass;
	}

	public void setEmppass(String emppass) {
		this.emppass = emppass;
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

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

}
