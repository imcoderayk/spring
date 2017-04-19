package codes.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codes.DAO.ProductDAO;
import codes.Model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO pd;
	
	public void addProduct(Product p) {
		pd.addProduct(p);
	}

	public void delProduct(int pid) {
		pd.delProduct(pid);
	}

	public void updProduct(Product p) {
		pd.updProduct(p);
	}

	public Product getProductById(int pid) {
		return pd.getProductById(pid);
	}

	public List<Product> getAllProducts() {
		return pd.getAllProducts();
	}

}
