package org.models.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ShippingCompany {
	
	@Id
	private String shippingCompanyName;
	private String contactPersonName;
	private int contactPersonPhone;
	private String contactPersonEmail;
	
	@OneToMany(mappedBy="sc")
	private Collection<ShippingCompanyPins> scp=new ArrayList<ShippingCompanyPins>();
	@OneToMany(mappedBy="sc")
	private Collection<OrderShippingDetails> osd=new ArrayList<OrderShippingDetails>();
	
	public String getShippingCompanyName() {
		return shippingCompanyName;
	}
	public void setShippingCompanyName(String shippingCompanyName) {
		this.shippingCompanyName = shippingCompanyName;
	}
	public String getContactPersonName() {
		return contactPersonName;
	}
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}
	public int getContactPersonPhone() {
		return contactPersonPhone;
	}
	public void setContactPersonPhone(int contactPersonPhone) {
		this.contactPersonPhone = contactPersonPhone;
	}
	public String getContactPersonEmail() {
		return contactPersonEmail;
	}
	public void setContactPersonEmail(String contactPersonEmail) {
		this.contactPersonEmail = contactPersonEmail;
	}
	public Collection<ShippingCompanyPins> getScp() {
		return scp;
	}
	public void setScp(Collection<ShippingCompanyPins> scp) {
		this.scp = scp;
	}
	public Collection<OrderShippingDetails> getOsd() {
		return osd;
	}
	public void setOsd(Collection<OrderShippingDetails> osd) {
		this.osd = osd;
	}

}
