package net.kzn.retrogamesbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.retrogamesbackend.dao.ProductDAO;
import net.kzn.retrogamesbackend.dto.Product;

public class ProductTestCase {
	
private static AnnotationConfigApplicationContext context;
	
	
	private static ProductDAO productDAO;
	
	
	private Product product;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.retrogamesbackend");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("productDAO");
	}
	
	/*	@Test
	public void testCRUDProduct() {
		
		// create operation
		product = new Product();
				
		product.setName("Earthbound");
		product.setBrand("Nintendo");
		product.setDescription("This is some description for Earthbound!");
		product.setUnitPrice(60);
		product.setActive(true);
		product.setCategoryId(2);
		product.setSupplierId(3);
		
		assertEquals("Something went wrong while inserting a new product!",
				true,productDAO.add(product));		
		
		
		// reading and updating the product
		product = productDAO.get(2);
		product.setName("dragon quest 3");
		assertEquals("Something went wrong while updating the existing record!",
				true,productDAO.update(product));		
				
		assertEquals("Something went wrong while deleting the existing record!",
				true,productDAO.delete(product));		
		
		// list
		assertEquals("Something went wrong while fetching the list of products!",
				5,productDAO.list().size());		
				
	}*/
			
	
/*	@Test
	public void testListActiveProducts() {
		assertEquals("Something went wrong while fetching the list of products!",
				4,productDAO.listActiveProducts().size());				
	} */
	
	
	/*@Test
	public void testListActiveProductsByCategory() {
		assertEquals("Something went wrong while fetching the list of products!",
				2,productDAO.listActiveProductsByCategory(3).size());
		assertEquals("Something went wrong while fetching the list of products!",
				1,productDAO.listActiveProductsByCategory(1).size());
	} */
	
	/*@Test
	public void testGetLatestActiveProduct() {
		assertEquals("Something went wrong while fetching the list of products!",
				3,productDAO.getLatestActiveProducts(3).size());
		
	} */
	
	
	
		

}
