import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GroupInsertion {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("/hibernate_ass.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Group g1 = new Group();
		g1.setId(1);
		g1.setName("American War");
		Story s1 = new Story();
		s1.setId(111);
		s1.setInfo("On Afganisthan");
		Story s2 = new Story();
		s2.setId(222);
		s2.setInfo("On Iraq");
		List<Story> stories = new ArrayList<Story>();
		stories.add(s1);
		stories.add(s2);
		g1.setStories(stories);
		s.save(g1);
		s.save(s1);
		s.save(s2);
		s.flush();
		tx.commit();
		s.close();

	}

}
