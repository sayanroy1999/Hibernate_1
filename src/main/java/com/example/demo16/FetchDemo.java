/*package com.example.demo16;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

    public static void main(String[] args) {

        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();

        //Using load, it won't hit the DB unless v call any of the object method other than Id
        Student student1= (Student) session.load(Student.class,101);
        Student student2= (Student) session.load(Student.class,101);
        //Here it hits the DB
        System.out.println(student2.getCity());

        //Always hits the DB with get, and if same query fired then it picks the result from cache memory
        Student student3= (Student) session.get(Student.class,101);
        Student student4= (Student) session.get(Student.class,101);
        System.out.println(student4.getCity());

        session.close();
        factory.close();

    }
}*/