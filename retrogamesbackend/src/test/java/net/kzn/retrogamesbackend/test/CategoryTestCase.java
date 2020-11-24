package net.kzn.retrogamesbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*              .==-.                   .-==.
                 \()8`-._  `.   .'  _.-'8()/
                 (88"   ::.  \./  .::   "88)
                  \_.'`-::::.(#).::::-'`._/
                    `._... .q(_)p. ..._.'
                      ""-..-'|=|`-..-""
                      .""' .'|=|`. `"".
                    ,':8(o)./|=|\.(o)8:`.
                   (O :8 ::/ \_/ \:: 8: O)
                    \O `::/       \::' O/
                     ""--'         `--""
*/
import net.kzn.retrogamesbackend.dao.CategoryDAO;
import net.kzn.retrogamesbackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() {	
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.retrogamesbackend");
		context.refresh();	
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
	}
	
	/*@Test
	public void testAddCategory() {
		
		category = new Category();
		category.setName("Action");
		category.setDescription("Action description");
		category.setImageURL("CAT_1.png");
		
		assertEquals("successfully added category inside the table!",true,categoryDAO.add(category));
		
	}*/
	
	/*@Test
	public void testGetCategory() {
		
		category = categoryDAO.get(1);
		assertEquals("successfully fetched 1 category from the table!","Action",category.getName());
		
	}*/
	
	/*@Test
	public void testUpdateCategory() {
		
		category = categoryDAO.get(1);
		category.setName("Action&Shooters");
		assertEquals("successfully updated 1 category in the table!",true,categoryDAO.update(category));
		
	}*/

	/*@Test	
	public void testDeleteCategory() {
		
		category = categoryDAO.get(1);
		assertEquals("successfully deleted 1 category from the table!",true,categoryDAO.delete(category));
		
	}*/
	
	/*@Test	
	public void testListCategory() {
		
		assertEquals("successfully fetched the list of categories from the table!",0,categoryDAO.list().size());
		
	}*/
	
	@Test
	public void testCRUDCategory() {
		
		//add operation
		category = new Category();
		category.setName("Strategy");
		category.setDescription("Strategy description");
		category.setImageURL("CAT_2.png");
		
		assertEquals("successfully added category inside the table!",true,categoryDAO.add(category));
		
		category = new Category();
		category.setName("Indies");
		category.setDescription("Indies description");
		category.setImageURL("CAT_3.png");
		
		assertEquals("successfully added category inside the table!",true,categoryDAO.add(category));
		
		//fetching and updating
		category = categoryDAO.get(15);
		category.setName("RPG");
		assertEquals("successfully fetched and updated 1 category in the table!",true,categoryDAO.update(category));
		
		//delet category
		assertEquals("successfully deleted 1 category from the table!",true,categoryDAO.delete(category));
		
		//fetching the list
		assertEquals("successfully fetched the list of categories from the table!",1,categoryDAO.list().size());
		
	}

}
