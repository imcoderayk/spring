package codes.DAO;

import java.util.List;

import codes.Model.Product;

public interface ProductDAO {

	void addProduct(Product p);
	void delProduct(int pid);
	void updProduct(Product p);
	Product getProductById(int pid);
	List<Product> getAllProducts();
}
