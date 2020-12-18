package jdbc;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pojo.Employee;

import java.io.File;
import java.util.List;

public class WorkingWithJPA {
    public static void main(String[] args) {
        File config=new File("src/main/java/com/config/hibernate.cfg.xml");
        Configuration configuration=new Configuration().configure(config).addAnnotatedClass(Employee.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

       Query query=session.createQuery("select id,name,place from Employee");
       List<Object[]> listobject=(List<Object[]>)query.list();
        for (Object[] obj :listobject) {
            System.out.println(obj[0]);
        }


        transaction.commit();






    }
}
