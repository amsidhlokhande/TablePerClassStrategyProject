package com.amsidh.hibernate.app;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.amsidh.hibernate.domains.FourWheeler;
import com.amsidh.hibernate.domains.TwoWheeler;
import com.amsidh.hibernate.domains.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {

		Vehicle vehicle= new Vehicle();
		vehicle.setVehicleName("CAR");
		
		TwoWheeler bike=new TwoWheeler();
		bike.setVehicleName("BIKE");
		bike.setSteeringHandler("It has steering Handler");
		
		
		FourWheeler car=new FourWheeler();
		car.setVehicleName("Porche");
		car.setSteeringWheel("It Has steering Wheel");
		
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(vehicle);
		session.save(bike);
		session.save(car);
		
		session.getTransaction().commit();
		session.close();

	}

}
