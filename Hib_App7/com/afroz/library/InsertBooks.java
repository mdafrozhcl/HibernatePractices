
package com.afroz.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertBooks {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Configuration cfg = new Configuration()
		.configure("hibernate.cfg.xml");
		Properties p = new Properties();
		p.load(new FileInputStream(Thread.currentThread().getContextClassLoader().getResource("hibernate.properties").getPath()));
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Book b1 = new Book();
		b1.setId(4);
		b1.setName("core java");
		b1.setPrice(400);
		b1.setType("design pattern");
		s.save(b1);
		AnnEditionBook b2 = new AnnEditionBook();
		b2.setId(5);
		b2.setName("servlet and jsp");
		b2.setType("Java EE");
		b2.setPrice(800);
		b2.setDiscount(100);
		s.save(b2);
		SpecialEditionBook b3 = new SpecialEditionBook();
		b3.setId(6);
		b3.setName("axis2 ws");
		b3.setType("Bean");
		b3.setPrice(600);
		b3.setCds(2);
		s.save(b3);
		s.flush();
		tx.commit();
		s.close();
	}

}
