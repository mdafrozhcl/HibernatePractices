package com.afroz.bus.station;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertPassanger {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate-bus.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Passanger p = new Passanger();
		p.setPid(103);
		p.setName("Veeresh");
		p.setLocation("DTW");
		p.setDestination("BOS");
		p.setArrival(new Date("10/22/2015"));
		p.setDeparture(new Date("11/05/2015"));
		s.save(p);
		s.flush();
		tx.commit();
		s.close();
		sf.close();
	}

}
