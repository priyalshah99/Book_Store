package org.models.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@PrimaryKeyJoinColumn//(name = "orderNo")
public class OrderShippingDetails extends OrderDetails{
	
	
	@OneToOne
	//@JoinColumn(name="orderNo")	
	private OrderDetails orderDetails;	
	
	@Temporal(TemporalType.DATE)
	private Date shippingDate;
	@Temporal(TemporalType.DATE)
	private Date deliveryDate;
	
	@ManyToOne
	@JoinColumn(name="shippingCompanyName")
	private ShippingCompany sc;
	
	
	
	public Date getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public ShippingCompany getSc() {
		return sc;
	}
	public void setSc(ShippingCompany sc) {
		this.sc = sc;
	}
	public OrderDetails getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}
}