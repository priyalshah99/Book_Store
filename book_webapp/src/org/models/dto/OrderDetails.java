package org.models.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class OrderDetails {

	@Id
	private int orderNo;
	@OneToOne
	@JoinColumn(name="custName")
	private Customer customer;;
	private Date date;
	
	@ManyToMany(mappedBy="order")
	private Collection<Book> book = new ArrayList <Book>();
	
	private float totalBillAmount;
	private float shippingAmount;
	private int discount;
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Collection<Book> getBook() {
		return book;
	}
	public void setBook(Collection<Book> book) {
		this.book = book;
	}
	public float getTotalBillAmount() {
		return totalBillAmount;
	}
	public void setTotalBillAmount(float totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}
	public float getShippingAmount() {
		return shippingAmount;
	}
	public void setShippingAmount(float shippingAmount) {
		this.shippingAmount = shippingAmount;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
//	
}
