package com.afroz.library;

import java.io.Serializable;

public class AnnEditionBook extends Book implements Serializable {
	private double discount;

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
