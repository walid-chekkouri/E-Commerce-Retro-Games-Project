package net.kzn.retrogamesbackend.dao;

import net.kzn.retrogamesbackend.dto.Address;
import net.kzn.retrogamesbackend.dto.Cart;
import net.kzn.retrogamesbackend.dto.User;

public interface UserDAO {

	// add an user
	boolean addUser(User user);
	
	// add an address
	boolean addAddress(Address address);
	
	// add a cart
	boolean addCart(Cart cart);
}