package com.afroz.library;

import java.io.Serializable;

public class SpecialEditionBook extends Book implements Serializable {
	private int cds;

	public int getCds() {
		return cds;
	}

	public void setCds(int cds) {
		this.cds = cds;
	}

}
