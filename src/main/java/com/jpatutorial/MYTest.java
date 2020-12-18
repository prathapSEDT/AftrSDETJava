package com.jpatutorial;

import com.workers.Worker;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.io.File;
import java.util.List;

public class MYTest {
    public static void main(String[] args) {

        File f = new File("src/main/java/com/config/hibernate.cfg.xml");
        Configuration configuration = new Configuration().configure(f).addAnnotatedClass(Worker.class);
        ServiceRegistry serviceRegistry= new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session1 = sessionFactory.openSession();
        Transaction transaction = session1.beginTransaction();

//        Query query=session1.createQuery("select id,name,place,salaray from Worker");
//        List<Object[]> workerDetails=(List<Object[]>)query.list();
//        for (Object[] obj:workerDetails) {
//            System.out.println("User ID :"+obj[0]+" "+"Name :"+obj[1]+"Place:"+obj[2]+"Salaray:"+obj[3]);
//        }

        //native sql query
        SQLQuery query=session1.createSQLQuery("select * from Worker");
        query.addEntity(Worker.class);

        List<Worker> workerList=query.list();

        for (Worker worker:workerList) {

            System.out.println(worker.getId()+" "+worker.getPlace()+" "+worker.getName()+" "+worker.getSalaray());
        }





    }
}
