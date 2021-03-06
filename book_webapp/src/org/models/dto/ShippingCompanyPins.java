package org.models.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
@Entity
public class ShippingCompanyPins {

	
	@Id
	private int pins;
	
	@ManyToOne
	@JoinColumn(name="shippingCompanyName")
	private ShippingCompany sc;
	
	
	
	
	public int getPins() {
		return pins;
	}
	public void setPins(int pins) {
		this.pins = pins;
	}
	public ShippingCompany getSc() {
		return sc;
	}
	public void setSc(ShippingCompany sc) {
		this.sc = sc;
	}
	
	
}
