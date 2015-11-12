package com.afroz.student;

import com.afroz.student.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent1 {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("/hibernate-student.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tx=s.beginTransaction();
		Student s1= new Student();
		s1.setId(101);
		s1.setName("Afroz");
		s1.setScore(99);
		s.save(s1);
		s.flush();
		tx.commit();
		s.close();
	}
}
