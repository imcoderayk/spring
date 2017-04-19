package codes.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
import codes.Model.Cust;

public class CustDAO {
	 
	    public void addUserDetails(String userName,String email,
	            String phone, String msg) {
	        try {
	            // 1. configuring hibernate
	            Configuration configuration = new Configuration().configure();
	 
	            // 2. create sessionfactory
	            SessionFactory sessionFactory = configuration.buildSessionFactory();
	 
	            // 3. Get Session object
	            Session session = sessionFactory.openSession();
	 
	            // 4. Starting Transaction
	            Transaction transaction = session.beginTransaction();
	            Cust cust = new Cust();
	            cust.setUserName(userName);
	            cust.setEmail(email);
	            cust.setMsg(msg);
	            cust.setPhone(phone);
	            session.save(cust);
	            transaction.commit();
	            System.out.println("\n\n Details Added \n");
	 
	        } catch (HibernateException e) {
	            System.out.println(e);
	            e.printStackTrace();
	            System.out.println("error");
	        }
	 
	    }
	}

	



