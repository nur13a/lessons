import entities.employee;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        employee e = new employee();
//        e.setAge(15);
//        e.setId(2);
//        e.setName("mm");
//        employee e1 = new employee();
//        e.setAge(15);
//        e.setId(3);
//        e.setName("mm");
        employee e2 = new employee();
        e2.setAge(15);
        e2.setId(4);
        e2.setName("mm");
//        create(e);
//        create(e1);
//        create(e2);
               employee e = new employee();
       e.setAge(15);
       e.setId(5);e.setName("ma");
    //   create(e);
      //  getAll();
      // getAll().stream().filter(x->x.getName().contains("A")).forEach(x-> System.out.println(x));
//        e.setName("Changed");
//        e.setAge(5);
//        update(e);
//        e.setName("Changed1");
//        e.setAge(56);
//        update1(e2);
        delete(1);
    }

    public static void create(employee e) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(e);
        session.getTransaction().commit();
        session.close();
        System.out.println("Uraaa");
    }

    public static List<employee> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<employee> employees = session.createQuery("FROM employee").list();
        session.close();
        System.out.println("Found: " + employees.toString()+ " ");
        return employees;
    }
    public static void update(employee e) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        employee em = (employee) session.load(employee.class, e.getId());
        em.setName(e.getName());
        em.setAge(e.getAge());   session.getTransaction().commit();
        session.close();    System.out.println("Успешно изменено " + e.toString());}

 public static void update1(employee e) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        employee em = (employee) session.get(employee.class, e.getId());
        em.setName(e.getName());
        em.setAge(e.getAge());   session.getTransaction().commit();
        session.close();    System.out.println("Успешно изменено " + e.toString());}

    public static void delete(Integer id) {
           Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query= (Query) session.load(employee.class,id);
        query.executeUpdate();
        session.delete(id);
        session.getTransaction().commit();
        session.close();
        System.out.println("успешно удалено ");
    }

}
