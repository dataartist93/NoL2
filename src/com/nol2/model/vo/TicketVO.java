package com.nol2.model.vo;

public class TicketVO {
  private int ticketno; 
  private int empno; 
  private String ticketinfo; 
  private int price; 
  private String discount; 
  private String tickets;
  
public TicketVO() {
	
}
public TicketVO(int ticketno, int empno, String ticketinfo, int price, String discount, String tickets) {
	super();
	this.ticketno = ticketno;
	this.empno = empno;
	this.ticketinfo = ticketinfo;
	this.price = price;
	this.discount = discount;
	this.tickets = tickets;
}
public String toString() {
	return "TicketVO [ticketno=" + ticketno + ", empno=" + empno + ", ticketinfo=" + ticketinfo + ", price=" + price
			+ ", discount=" + discount + ", tickets=" + tickets + "]";
}
public int getTicketno() {
	return ticketno;
}
public void setTicketno(int ticketno) {
	this.ticketno = ticketno;
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getTicketinfo() {
	return ticketinfo;
}
public void setTicketinfo(String ticketinfo) {
	this.ticketinfo = ticketinfo;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getDiscount() {
	return discount;
}
public void setDiscount(String discount) {
	this.discount = discount;
}
public String getTickets() {
	return tickets;
}
public void setTickets(String tickets) {
	this.tickets = tickets;
} 
    
}
