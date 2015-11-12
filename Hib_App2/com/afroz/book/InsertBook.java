package com.afroz.book;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertBook {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Book b = new Book();
		b.setBno(444);
		b.setBname("css");
		b.setPrice(500.00d);
		s.save(b);
		s.flush();
		tx.commit();
		s.close();
	}

}
