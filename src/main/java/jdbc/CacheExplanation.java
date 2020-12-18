package jdbc;

import com.workers.Worker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pojo.Employee;

import java.io.File;

public class CacheExplanation {
    public static void main(String[] args) {
        File config=new File("src/main/java/com/config/hibernate.cfg.xml");
        Configuration configuration=new Configuration().configure(config).addAnnotatedClass(Employee.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();

        //user 01 session is started
        Session session1=sessionFactory.openSession();
        Transaction transaction=session1.beginTransaction();


        Employee worker= (Employee) session1.get(Employee.class,1);
        System.out.println(worker);


        Session session2=sessionFactory.openSession();

        session2.beginTransaction();

        Employee workers= (Employee) session2.get(Employee.class,1);
        System.out.println(workers);


    }
}
