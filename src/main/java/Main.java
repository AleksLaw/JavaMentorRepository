import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.DBUtil;

public class Main {
    public static void main(String[] args) {
        DBUtil dbUtil = new DBUtil();
        dbUtil.hashCode();
        User user =  new User("asd","asda");
        System.out.println(user);
        SessionFactory  sessionFactory= DBUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }
}
