package com.afroz.library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateBook {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		Configuration cfg = new Configuration();
		cfg.configure("/hibernate.cfg.xml");
		Properties p = new Properties();
		p.load(new FileInputStream(Thread.currentThread()
				.getContextClassLoader().getResource("hibernate.properties")
				.getPath()));
		cfg.addProperties(p);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		/*Book b = (Book) s.get(Book.class, new Integer(5));
		b.setPrice(730);
		s.update(b);*/
		String hql = "update SpecialEditionBook seb set cds= :cds where seb.id= :id";
		org.hibernate.Query query = s.createQuery(hql);
		query.setParameter("cds", new Integer(3));
		query.setParameter("id", new Integer(6));
		query.executeUpdate();
		tx.commit();
		s.close();
		sf.close();

	}

}
