import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Student s1 = new Student();
		s1.setSno(2);
		s1.setSname("Afroz");
		s1.setEmail("a@rt.com");
		s1.setMobile(999999999L);
		s.save(s1);
		s.flush();
		tx.commit();
		s.close();
	}
}
