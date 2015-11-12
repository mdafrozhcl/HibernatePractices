package com.afroz.garage;

import java.io.Serializable;

public class Vehicle implements Serializable {
	private int vid;
	private String vname;

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}
}
