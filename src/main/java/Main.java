import entities.employee;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
employee e =new employee();
e.setAge(13);
e.setId(1);
e.setName("kk");
        create(e);
    }
    public static void create (employee e){
        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(e);
        session.getTransaction().commit();
        session.close();
        System.out.println("Uraaa");
    }
}
