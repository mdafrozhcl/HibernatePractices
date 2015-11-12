package com.afroz.garage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Person implements Serializable {
	private int userid;
	private String uname;
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
}
