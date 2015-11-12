package com.afroz.garage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecord {
	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		Configuration cfg = new Configuration();
		cfg.configure("com/afroz/garage/hibernate.cfg.xml");
		Properties p = new Properties();
		p.load(new FileInputStream(Thread.currentThread().getContextClassLoader().getResource("com/afroz/garage/hibernate.properties")
				.getPath()));
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
        Person user = new Person(); //create the user entity object
        
        Vehicle vehicle = new Vehicle(); //create the first vehicle entity object
        Vehicle vehicle2 = new Vehicle(); //create the second vehicle entity
       
        vehicle.setVname("BMW Car"); //set the value to the vehicle entity
        vehicle2.setVname("AUDI Car");
       
        user.setUname("Afroz"); //Set the value to the user entity
        user.getVehicle().add(vehicle); //add vehicle to the list of the vehicle
        user.getVehicle().add(vehicle2);
       
       
        s.save(vehicle); //saving the vehicle to the database
        s.save(vehicle2);
        s.save(user); //save the user to the database
        
        s.getTransaction().commit(); //close the transaction
        s.close(); //close the session
	}

}
