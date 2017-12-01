package com.nol2.model.vo;

public class ConvenientVO {
private	int conno;
private	int empno;
private	String conname;
private	String coninfo;
private	String conoperation;
private	String conlocation;

	public ConvenientVO(int conno, int empno, String conname, String coninfo, String conoperation, String conlocation) {
		super();
		this.conno = conno;
		this.empno = empno;
		this.conname = conname;
		this.coninfo = coninfo;
		this.conoperation = conoperation;
		this.conlocation = conlocation;
	}

	public int getConno() {
		return conno;
	}

	public void setConno(int conno) {
		this.conno = conno;
	}

	public int getempno() {
		return empno;
	}

	public void setempno(int empno) {
		this.empno = empno;
	}

	public String getConname() {
		return conname;
	}

	public void setConname(String conname) {
		this.conname = conname;
	}

	public String getConinfo() {
		return coninfo;
	}

	public void setConinfo(String coninfo) {
		this.coninfo = coninfo;
	}

	public String getConoperation() {
		return conoperation;
	}

	public void setConoperation(String conoperation) {
		this.conoperation = conoperation;
	}

	public String getConlocation() {
		return conlocation;
	}

	public void setConlocation(String conlocation) {
		this.conlocation = conlocation;
	}

	public ConvenientVO() {

	}
}