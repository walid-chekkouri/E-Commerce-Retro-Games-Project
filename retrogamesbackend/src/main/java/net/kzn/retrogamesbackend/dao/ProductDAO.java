package net.kzn.retrogamesbackend.dao;

import java.util.List;
import net.kzn.retrogamesbackend.dto.Product;
//l
public interface ProductDAO {
	
	Product get(int productId);
	List<Product> list();	
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	// business methods
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> getLatestActiveProducts(int count);

}
