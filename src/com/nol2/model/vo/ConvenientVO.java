package com.nol2.model.vo;

public class ConvenientVO {
private	int conno;
private	int cusno;
private	String conname;
private	String coninfo;
private	String conoperation;
private	String conlocation;

	public ConvenientVO(int conno, int cusno, String conname, String coninfo, String conoperation, String conlocation) {
		super();
		this.conno = conno;
		this.cusno = cusno;
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

	public int getCusno() {
		return cusno;
	}

	public void setCusno(int cusno) {
		this.cusno = cusno;
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