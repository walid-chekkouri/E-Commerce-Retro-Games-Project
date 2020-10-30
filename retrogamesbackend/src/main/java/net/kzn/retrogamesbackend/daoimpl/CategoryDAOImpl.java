package net.kzn.retrogamesbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.retrogamesbackend.dao.CategoryDAO;
import net.kzn.retrogamesbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		//adding first category
		category.setId(1);
		category.setName("Indie");
		category.setDescription("This is some description for Indie!");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		//second category
		category = new Category();
		category.setId(2);
		category.setName("Action");
		category.setDescription("This is some description for action!");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		//third category
		category = new Category();
		category.setId(3);
		category.setName("Racing");
		category.setDescription("This is some description for racing!");
		category.setImageURL("CAT_3.png");
				
		categories.add(category);
		
		//fourth category
		category = new Category();
		category.setId(4);
		category.setName("Sports");
		category.setDescription("This is some description for sports!");
		category.setImageURL("CAT_4.png");
						
		categories.add(category);
				
		//fifth category
		category = new Category();
		category.setId(5);
		category.setName("Strategy");
		category.setDescription("This is some description for strategy!");
		category.setImageURL("CAT_5.png");
						
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enchanched for loop
		for(Category category : categories) {
			if(category.getId() == id) return category;
		}
	return null;	
	}

}
