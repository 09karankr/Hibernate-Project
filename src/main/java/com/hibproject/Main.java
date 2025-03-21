package com.hibproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setsName("Gaurav");
        s1.setRollNo(105);
        s1.setsAge(76);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.hibproject.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.save(s1);
        transaction.commit();
        System.out.println(s1);
    }
}
