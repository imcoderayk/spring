package codes.DAO;

import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import codes.Model.Cart;
import codes.Model.InUsers;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO{

	@Autowired
	SessionFactory sf;
	
	Session s;
	Transaction t;
	
	public boolean addUser(InUsers u) {

		try{
			s = sf.openSession();
			t = s.beginTransaction();
			u.setEnabled(true);
			u.setRole("ROLE_USER");
			
			Cart cart = new Cart();
			
			cart.setUser(u);
			u.setCart(cart);
			
			s.save(u);
			s.save(cart);
			t.commit();
			return true;
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	public boolean delUser(int uid) {
		InUsers u;
		try{
			s = sf.openSession();
			t = s.beginTransaction();
			u = (InUsers)s.load(InUsers.class, uid);
			s.delete(u);
			t.commit();
			return true;
		}
		catch(Exception e){
			System.out.println(e);
			return false;
		}
	}

	public boolean updUser(InUsers u) {
		InUsers u1;
		try{
			s = sf.openSession();
			t = s.beginTransaction();
			u1 = (InUsers)s.load(InUsers.class, u.getUid());
			u1.setUname(u.getUname());
			u1.setUpass(u.getUpass());
			u1.setUaddr(u.getUaddr());
			s.saveOrUpdate(u1);
			t.commit();
			return true;
		}
		catch(Exception e){
			System.out.println(e);
			return false;
		}
	}

	public InUsers getUserById(int uid) {
		InUsers u;
		try{
			s = sf.openSession();
			t = s.beginTransaction();
			u = (InUsers)s.load(InUsers.class, uid);
			t.commit();
			return u;
		}
		catch(Exception e){
			System.out.println(e);
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<InUsers> getAllUsers() {
		List<InUsers> l;
		try{
			s = sf.openSession();
			t = s.beginTransaction();
			l = (List<InUsers>)s.createQuery("from InUsers").getResultList();
			t.commit();
			return l;
		}
		catch(Exception e){
			System.out.println(e);
			return null;
		}
	}

}
