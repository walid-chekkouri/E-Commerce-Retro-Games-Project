package net.kzn.retrogamesbackend.dao;

import java.util.List;

import net.kzn.retrogamesbackend.dto.Address;
import net.kzn.retrogamesbackend.dto.Cart;
import net.kzn.retrogamesbackend.dto.User;

public interface UserDAO {

	// add an user
	boolean addUser(User user);
	User getByEmail(String email);
	
	// add an address
	boolean addAddress(Address address);
	// alternative
	Address getBillingAddress(int userId);
	List<Address> listShippingAddresses(int userId);
	
	//Address getBillingAddress(User user);
	//List<Address> listShippingAddresses(User user);
	
	// update a cart
	boolean updateCart(Cart cart);
}