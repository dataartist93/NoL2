package com.nol2.model.vo;

import oracle.sql.DATE;

public class PayVO {

	public int payno;
	public int cusno;
	public int empno;
	public int ticketno;
	public String coupon;
	public String paydate;
	public String payment;
	
	public PayVO() {
		
	}//생성자

	public int getPayno() {
		return payno;
	}

	public void setPayno(int payno) {
		this.payno = payno;
	}

	public int getCusno() {
		return cusno;
	}

	public void setCusno(int cusno) {
		this.cusno = cusno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getTicketno() {
		return ticketno;
	}

	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

	public String getPaydate() {
		return paydate;
	}

	public void setPaydate(String paydate) {
		this.paydate = paydate;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "PayVO [payno=" + payno + ", cusno=" + cusno + ", empno=" + empno + ", ticketno=" + ticketno
				+ ", coupon=" + coupon + ", paydate=" + paydate + ", payment=" + payment + "]";
	}

	public PayVO(int payno, int cusno, int empno, int ticketno, String coupon, String paydate, String payment) {
		super();
		this.payno = payno;
		this.cusno = cusno;
		this.empno = empno;
		this.ticketno = ticketno;
		this.coupon = coupon;
		this.paydate = paydate;
		this.payment = payment;
	}
	
	
}


