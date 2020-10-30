package net.kzn.retrogamesbackend.dao;

import java.util.List;

import net.kzn.retrogamesbackend.dto.Category;

public interface CategoryDAO {

	
	List<Category> list();
	Category get(int id);
	
	
}
