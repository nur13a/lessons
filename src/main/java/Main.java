import entities.Car;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            addCar(new Car(i,"model" + i, "color" + i, 20 * i));
        }
    }

    public static void addCar(Car car) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(car);
        session.getTransaction().commit();
        session.close();
        System.out.println("U a successfully added car");
    }

    public static List<Car> getAllCars() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List list = session.createQuery("FROM cars").list();
        session.close();
        System.out.println("Found: " + list.toString() + " ");
        return list;
    }

    public static Car getCarById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Car car1= (Car) session.createQuery("FROM cars where id ="+id);
        session.close();
        System.out.println("Found: "+car1.toString());
        return car1;
    }

    public static void updateCar(Car car) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Car car1 = (Car) session.load(Car.class, car.getId());
        car1.setModel(car.getModel());
        car1.setColor(car.getColor());
        car1.setPrice(car.getPrice());
        session.getTransaction().commit();
        session.close();
        System.out.println("U a successfully update car");
    }

    public static void deleteCar(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = (Query) session.load(Car.class, id);
        query.executeUpdate();
        session.delete(id);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully deleted");
    }
}
