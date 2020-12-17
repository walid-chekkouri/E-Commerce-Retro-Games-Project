package net.kzn.retrogames.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.retrogamesbackend.dao.CategoryDAO;
import net.kzn.retrogamesbackend.dto.Category;
import net.kzn.retrogamesbackend.dto.Product;








@Controller
@RequestMapping("/manage")
public class ManagementController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public ModelAndView showManageProducts() {
		
		
	ModelAndView mv =new ModelAndView("page");
	mv.addObject("userClickManageProducts", true);
	
	mv.addObject("title", "Manage Products");
	Product nProduct =new Product();
	// set few of the fields
	nProduct.setSupplierId(1);
	nProduct.setActive(true);
	mv.addObject("product",nProduct);
	
	
	return mv;
		
		
		
		
		
		
	}
	
	
// returnig categories for all the request mapping 
	@ModelAttribute("categories")
	public List<Category> getCategories(){
		
		return categoryDAO.list();
			
	}
}
