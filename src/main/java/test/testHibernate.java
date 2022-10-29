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
	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
	Session session = sessionFactory.getCurrentSession();

	@Test
	public void save() {

	}
}
