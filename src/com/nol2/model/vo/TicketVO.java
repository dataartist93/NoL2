package com.nol2.model.vo;

public class TicketVO {
  private int ticketNo; 
  private int empNo; 
  private String ticketInfo; 
  private int price; 
  private String discount; 
  private String tickets;
  
public TicketVO() {
	
}
public TicketVO(int ticketNo, int empNo, String ticketInfo, int price, String discount, String tickets) {
	super();
	this.ticketNo = ticketNo;
	this.empNo = empNo;
	this.ticketInfo = ticketInfo;
	this.price = price;
	this.discount = discount;
	this.tickets = tickets;
}
public String toString() {
	return "TicketVO [ticketNo=" + ticketNo + ", empNo=" + empNo + ", ticketInfo=" + ticketInfo + ", price=" + price
			+ ", discount=" + discount + ", tickets=" + tickets + "]";
}
public int getTicketno() {
	return ticketNo;
}
public void setTicketno(int ticketNo) {
	this.ticketNo = ticketNo;
}
public int getEmpno() {
	return empNo;
}
public void setEmpno(int empNo) {
	this.empNo = empNo;
}
public String getTicketinfo() {
	return ticketInfo;
}
public void setTicketinfo(String ticketInfo) {
	this.ticketInfo = ticketInfo;
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
