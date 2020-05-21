package org.models.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;

@Entity
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="log_generator")
    @SequenceGenerator(name="log_generator",sequenceName="order_number_seq", allocationSize=1)
	private int orderNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="email")
	private Customer customer;;
	private Date date;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Collection<Book> book = new ArrayList <Book>();
	
	private float totalBillAmount;
	private float shippingAmount;
	private float discount;
	
	@OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
	private OrderShippingDetails osd;
	
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
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public OrderShippingDetails getOsd() {
		return osd;
	}
	public void setOsd(OrderShippingDetails osd) {
		this.osd = osd;
	}
	
	
	
	
//	
}
