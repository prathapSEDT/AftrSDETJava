package com.jpatutorial;
import com.workers.Worker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class TestJPA {
    public static void main(String[] args) {
        Worker worker=new Worker();
        for (int i=1;i<=50;i++){

        }
        worker.setName("Raja");
        worker.setPlace("banglore");
        worker.setSalaray(78900.25);
        File f=new File("src/main/java/com/config/hibernate.cfg.xml");

        Configuration configuration=new Configuration().configure(f).addAnnotatedClass(Worker.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(worker);
        transaction.commit();

    }
}

