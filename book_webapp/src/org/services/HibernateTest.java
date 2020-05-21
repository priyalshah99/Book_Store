package org.services;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.models.dto.Address;
import org.models.dto.Book;
import org.models.dto.Customer;
import org.models.dto.OrderDetails;
import org.models.dto.OrderShippingDetails;
import org.models.dto.ShippingCompany;

public class HibernateTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		ShippingCompany sc=new ShippingCompany();
		sc.setShippingCompanyName("Bluedart");
		sc.setContactPersonName("Sanyam Patel");
		sc.setContactPersonPhone("999999999");
		sc.setContactPersonEmail("bluedart@gmail.com");
		
		session.save(sc);
		
//		ShippingCompanyPins scp1=new ShippingCompanyPins();
//		ShippingCompanyPins scp2=new ShippingCompanyPins();
//		
//		
//		scp1.setPins(380015);
//		scp2.setPins(380018);
//		
//		sc.getScp().add(scp1);
//		sc.getScp().add(scp2);
//		
//		scp1.setSc(sc);
//		scp2.setSc(sc);
//		
////		OrderShippingDetails osd1=new OrderShippingDetails();
////		osd1.setOrderNo(12);
////		osd1.setDeliveryDate(new Date());
////		osd1.setShippingDate(new Date());
////		
////		OrderShippingDetails osd2=new OrderShippingDetails();
////		osd2.setOrderNo(25);
////		osd2.setDeliveryDate(new Date());
////		osd2.setShippingDate(new Date());
////		
////		sc.getOsd().add(osd1);
////		sc.getOsd().add(osd2);
////		
////		osd1.setSc(sc);
////		osd2.setSc(sc);
//		
		Customer cust=new Customer();
		cust.setCustName("shine");
		cust.setEmail("shine@gmail.com");
		
		
		Customer cust1=new Customer();
		cust1.setCustName("shalmali");
		cust1.setEmail("sshalmali@gmail.com");
		
		
		
		Address a=new Address();
		a.setCity("abad");
		a.setPin(380015);
		a.setState("guju");
		a.setStreet("ambawadi");
		
		
		
		cust.setAddress(a);
		cust1.setAddress(a);
		
		
		
		session.save(cust);
		session.save(cust1);
		
		
		
		OrderDetails o=new OrderDetails();
		
		o.setCustomer(cust);
		o.setDate(new Date());
		o.setDiscount(200);
		o.setTotalBillAmount(2000);
		
		OrderDetails o2=new OrderDetails();
		
		o2.setCustomer(cust1);
		o2.setDate(new Date());
		o2.setDiscount(600);
		o2.setTotalBillAmount(8000);
		
		session.persist(o);
		session.persist(o2);
		
		OrderShippingDetails osd=new OrderShippingDetails();

		osd.setSc(sc);
		osd.setDeliveryDate(new Date());
		osd.setShippingDate(new Date());
		osd.setOrderNo(o.getOrderNo());
		
		OrderShippingDetails osd2=new OrderShippingDetails();

		osd2.setSc(sc);
		osd2.setDeliveryDate(new Date());
		osd2.setShippingDate(new Date());
		osd2.setOrderNo(o2.getOrderNo());
		o.setOsd(osd);
		o2.setOsd(osd2);
		
		
		session.save(o);
		session.save(o2);
		
		Book b1=new Book();
		b1.setIsbn("1235647891428");
		b1.setTitle("stuart");
		b1.setAuthors("jenish");
		b1.setPrice(350);
		b1.setStock(20);
		
		Book b2=new Book();
		b2.setIsbn("7589694812973");
		b2.setTitle("jerry");
		b2.setAuthors("tom");
		b2.setPrice(750);
		b2.setStock(10);
		
		Book b3=new Book();
		b3.setIsbn("7539584615876");
		b3.setTitle("jack-jill");
		b3.setAuthors("shaun");
		b3.setPrice(750);
		b3.setStock(10);
		
		
		
		
		o.getBook().add(b2);
		
		o2.getBook().add(b1);

		session.save(b1);
		session.save(b2);
		session.save(b3);


		session.getTransaction().commit();
		session.close();

	}

}
