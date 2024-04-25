package com.example.demo16;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Demo16Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo16Application.class, args);

		System.out.println("Project started");

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		//SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		//Creating student
		Student st=new Student();
		st.setId(501);
		st.setName("DON 23"); //Also added another data for these 3 fields
		st.setCity("bangalore");
		System.out.println(st);

		Address ad=new Address();
		ad.setStreet("street 1");
		ad.setCity("kOLKATA");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1234.56);

		//To save the object, we need to ask Session Factory to begin a current session through which we can save our object
		Session session=factory.openSession();

		Transaction tx=session.beginTransaction();
		session.save(st);
		session.save(ad);
		tx.commit(); //To commit the changes in our DB

		System.out.println("Done");

		//System.out.println(sessionFactory);
		//System.out.println(sessionFactory.isClosed());

		session.close();

	}

}
