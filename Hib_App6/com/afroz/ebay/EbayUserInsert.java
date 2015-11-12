package com.afroz.ebay;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EbayUserInsert {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("/hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tx = s.beginTransaction();
		EbayUser u= new EbayUser();
		u.setUsrId(333);
		u.setUsername("veeresh");
		u.setPassword("reset");
		s.save(u);
		tx.commit();
		s.close();
		sf.close();

	}

}
