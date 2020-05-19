package org.models.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	
			@Id
			private int isbn; 
			private String title; 
			private String authors ;
			private float price;
			private int year;
			private String publisher;
			private int stock;
			
			@ManyToMany
			private Collection <OrderDetails> order=new ArrayList <OrderDetails>();
			
			public int getIsbn() {
				return isbn;
			}
			public void setIsbn(int isbn) {
				this.isbn = isbn;
			}
			public String getTitle() {
				return title;
			}
			public void setTitle(String title) {
				this.title = title;
			}
			public String getAuthors() {
				return authors;
			}
			public void setAuthors(String authors) {
				this.authors = authors;
			}
			public float getPrice() {
				return price;
			}
			public void setPrice(float price) {
				this.price = price;
			}
			public int getYear() {
				return year;
			}
			public void setYear(int year) {
				this.year = year;
			}
			public String getPublisher() {
				return publisher;
			}
			public void setPublisher(String publisher) {
				this.publisher = publisher;
			}
			public int getStock() {
				return stock;
			}
			public void setStock(int stock) {
				this.stock = stock;
			}
	/*
	 * public Order getOrder() { return order; } public void setOrder(Order order) {
	 * this.order = order; }
	 */
			public Collection<OrderDetails> getOrder() {
				return order;
			}
			public void setOrder(Collection<OrderDetails> order) {
				this.order = order;
			}
			
			
			
			}
			
			





