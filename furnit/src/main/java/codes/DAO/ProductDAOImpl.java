package codes.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import codes.Model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sf;
	
	public void addProduct(Product p) {
		sf.getCurrentSession().save(p);
	}

	public void delProduct(int pid) {
		Product x = sf.getCurrentSession().load(Product.class, pid);
		sf.getCurrentSession().delete(x);
	}

	public void updProduct(Product p) {
		sf.getCurrentSession().saveOrUpdate(p);
	}

	public Product getProductById(int pid) {
		Product x = sf.getCurrentSession().load(Product.class, pid);
		return x;
	}

	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		List<Product> l = (List<Product>)sf.getCurrentSession().createQuery("").getResultList();
		return l;
	}

}
