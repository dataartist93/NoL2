package com.nol2.model.vo;

public class EventVO {
	private int eventno;
	private int empno;
	private String eventname;
	private String eventinfo;
	private String eventtime;
	private String eventlocation;
	private String events;
	
	public EventVO() {
	}

	public EventVO(int eventno, int empno, String eventname, String eventinfo, String eventtime, String eventlocation,
			String events) {
		super();
		this.eventno = eventno;
		this.empno = empno;
		this.eventname = eventname;
		this.eventinfo = eventinfo;
		this.eventtime = eventtime;
		this.eventlocation = eventlocation;
		this.events = events;
	}

	public int getEventno() {
		return eventno;
	}

	public void setEventno(int eventno) {
		this.eventno = eventno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public String getEventinfo() {
		return eventinfo;
	}

	public void setEventinfo(String eventinfo) {
		this.eventinfo = eventinfo;
	}

	public String getEventtime() {
		return eventtime;
	}

	public void setEventtime(String eventtime) {
		this.eventtime = eventtime;
	}

	public String getEventlocation() {
		return eventlocation;
	}

	public void setEventlocation(String eventlocation) {
		this.eventlocation = eventlocation;
	}

	public String getEvents() {
		return events;
	}

	public void setEvents(String events) {
		this.events = events;
	}
	
}
