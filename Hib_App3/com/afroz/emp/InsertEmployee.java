package com.afroz.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertEmployee {

	public static void main(String[] args) {
		Configuration cfg  = new Configuration();
		cfg.configure("/hibernate-emp.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Employee e = new Employee();
		e.setEmpno(101);
		e.setEmpname("Afroz");
		e.setEmpjob("Software Developer");
		s.save(e);
		s.flush();
		tx.commit();
		s.close();
	}

}
