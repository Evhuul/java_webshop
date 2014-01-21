package data;

import java.util.Collection;

import se.hejhej.webshop.Product;
import se.hejhej.webshop.User;



public interface IOrder 
{
	boolean addProduct(Product p);

	boolean removeProduct(String pid) throws ProductNotFoundException;

	Collection<Product> getCartDetails();

	Product getProductFromCart(String pid) throws ProductNotFoundException;

	int productCount();

	double getCartPrice();

	/****** Separating here to make it easier to see ******/

	boolean addUser(User u);

	boolean removeUser(String uid) throws UserNotFoundException;

	Collection<User> getUserDetails();

	User getUserData(String uid) throws UserNotFoundException;

	int userCount();

}