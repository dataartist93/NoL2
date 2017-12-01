package com.nol2.model.vo;

public class PrepassVO {
	public int prepassno;
	public int cusno;
	public int rideno;
	public String prepasstime;
	
	public PrepassVO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PrspassVO [prepassno=" + prepassno + ", cusno=" + cusno + ", rideno=" + rideno + ", prepasstime="
				+ prepasstime + "]";
	}

	public PrepassVO(int prepassno, int cusno, int rideno, String prepasstime) {
		super();
		this.prepassno = prepassno;
		this.cusno = cusno;
		this.rideno = rideno;
		this.prepasstime = prepasstime;
	}

	public int getPrepassno() {
		return prepassno;
	}

	public void setPrepassno(int prepassno) {
		this.prepassno = prepassno;
	}

	public int getCusno() {
		return cusno;
	}

	public void setCusno(int cusno) {
		this.cusno = cusno;
	}

	public int getRideno() {
		return rideno;
	}

	public void setRideno(int rideno) {
		this.rideno = rideno;
	}

	public String getPrepasstime() {
		return prepasstime;
	}

	public void setPrepasstime(String prepasstime) {
		this.prepasstime = prepasstime;
	}
	
	
	
}
