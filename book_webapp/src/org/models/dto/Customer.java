package org.models.dto;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	private long custPhone;
	private String custName;
	@Id
	private String email;
	
	@Embedded
	private Address address ;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(long custPhone) {
		this.custPhone = custPhone;
	}

	
	
	
	
	
	
	
}
