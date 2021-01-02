package net.kzn.retrogames.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import net.kzn.retrogames.model.RegisterModel;
import net.kzn.retrogamesbackend.dao.UserDAO;
import net.kzn.retrogamesbackend.dto.Address;
import net.kzn.retrogamesbackend.dto.Cart;
import net.kzn.retrogamesbackend.dto.User;

@Component
public class RegisterHandler {

	
	@Autowired
	private UserDAO userDAO;
	
	public RegisterModel init() {
		
		return new RegisterModel();
		
	}
	
	public void addUser(RegisterModel registerModel, User user) {
		registerModel.setUser(user);
	}
	
	public void addBilling(RegisterModel registerModel, Address billing) {
		registerModel.setBilling(billing);
	}
	
	public String validateUser(User user, MessageContext error) {
		  String transitionValue = "success";
		   if(!(user.getPassword().equals(user.getConfirmPassword()))) {
		    error.addMessage(new MessageBuilder().error().source("confirmPassword").defaultText("Password does not match the confirm password!").build());
		    transitionValue = "failure";    
		   }  
		   if(userDAO.getByEmail(user.getEmail())!=null) {
		    error.addMessage(new MessageBuilder().error().source("email").defaultText("Email address is already used!").build());
		    transitionValue = "failure";
		   }
		  return transitionValue;
		 }
	
	
	public String saveAll(RegisterModel registerModel) {
		String transitionValue = "success";
		// fetch the user
		User user = registerModel.getUser();
		if(user.getRole().equals("USER")) {
			// create a new cart
			 Cart cart = new Cart();
			 cart.setUser(user);
			 user.setCart(cart);
		}
		 // save the user
		 userDAO.addUser(user);
		 // save the billing address
		 Address billing = registerModel.getBilling();
		 billing.setUserId(user.getId());
		 billing.setBilling(true);  
		 userDAO.addAddress(billing);
		
		 return transitionValue;
		
	}
	
	
	
}
