package com.nol2.model.vo;

public class RideVO {
	
	private int rideno;
	private int empno;
	private String ridename;
	private String rideinfo;
	private String operation;
	private String opertime;
	private int waittime;
	private String ridelimit;
	private String countpeople;
	private String location;
	private int countride;
	
	public RideVO() {
		
	}

	public RideVO(int rideno, int empno, String ridename, String rideinfo, String operation, String opertime,
			int waittime, String ridelimit, String countpeople, String location, int countride) {
		super();
		this.rideno = rideno;
		this.empno = empno;
		this.ridename = ridename;
		this.rideinfo = rideinfo;
		this.operation = operation;
		this.opertime = opertime;
		this.waittime = waittime;
		this.ridelimit = ridelimit;
		this.countpeople = countpeople;
		this.location = location;
		this.countride = countride;
	}



	public int getRideno() {
		return rideno;
	}

	public void setRideno(int rideno) {
		this.rideno = rideno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getRidename() {
		return ridename;
	}

	public void setRidename(String ridename) {
		this.ridename = ridename;
	}

	public String getRideinfo() {
		return rideinfo;
	}

	public void setRideinfo(String rideinfo) {
		this.rideinfo = rideinfo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getOpertime() {
		return opertime;
	}

	public void setOpertime(String opertime) {
		this.opertime = opertime;
	}

	public int getWaittime() {
		return waittime;
	}

	public void setWaittime(int waittime) {
		this.waittime = waittime;
	}

	public String getRidelimit() {
		return ridelimit;
	}

	public void setRidelimit(String ridelimit) {
		this.ridelimit = ridelimit;
	}

	public String getCountpeople() {
		return countpeople;
	}

	public void setCountpeople(String countpeople) {
		this.countpeople = countpeople;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCountride() {
		return countride;
	}

	public void setCountride(int countride) {
		this.countride = countride;
	}
	
	
}
