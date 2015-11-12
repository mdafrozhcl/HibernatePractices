package com.afroz.ebay;

import java.io.Serializable;

public class EbayUser implements Serializable {
	private String username;
	private String password;
	private int UsrId;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUsrId() {
		return UsrId;
	}

	public void setUsrId(int usrId) {
		UsrId = usrId;
	}
}
