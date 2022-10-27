package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import dao.JpaEntityManager;
import lombok.extern.log4j.Log4j;
import model.Payment;
import model.User;
import util.HibernateUtils;



public class testHibernate {

	JpaEntityManager jpaEntityManager = new JpaEntityManager() {
	};
	
	 
	 @Test
	    public void save() {
	        Payment payment = new Payment();
	        payment.setPaymentDate(new Date());
	        payment.setPaymentOption("ok");
	        payment.setPaymentPrice(100);
	        
	        jpaEntityManager.saveOrUpdate(payment);
	        
	        List<Payment> payment2 = jpaEntityManager.getAll(Payment.class);
	        
	        assertNotNull(payment2);

	    }
}
