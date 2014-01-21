package se.hejhej.webshop;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import data.IOrder;
import data.ProductNotFoundException;
import data.UserNotFoundException;

public class Order implements IOrder 
{

	private Map<String, Product> map; // products
	private Map<String, User> userMap; // users

	public Order() 
	{
		map = new HashMap<String, Product>();
		userMap = new HashMap<String, User>();
	}

	@Override
	public boolean addProduct(Product p) 
	{
		if (map.containsKey(p.getPid())) 
		{
			Product p1 = map.get(p.getPid());
			p1.setPrice(p1.getPrice() + p.getPrice());
			p1.setQty(p1.getQty() + p.getQty());
			return true;
		}
		map.put(p.getPid(), p);
		return false;
	}// addProduct

	@Override
	public boolean removeProduct(String pid) throws ProductNotFoundException 
	{
		if (map.containsKey(pid)) 
		{
			map.remove(pid);
			return true;
		} else
			throw new ProductNotFoundException("Product with ID " + pid
					+ " is not Found.");
	}

	@Override
	public Collection<Product> getCartDetails() 
	{
		return map.values();
	}

	@Override
	public Product getProductFromCart(String pid) throws ProductNotFoundException 
	{
		if (map.containsKey(pid)) 
		{
			return map.get(pid);
		} else { throw new ProductNotFoundException("Product with ID " + pid + " is not Found."); }
	}

	@Override
	public int productCount() 
	{
		return map.size();
	}

	@Override
	public double getCartPrice() 
	{
		double price = 0.0d;
		Iterator<Product> iterator = getCartDetails().iterator();
		while (iterator.hasNext()) 
		{
			price += iterator.next().getPrice();
		}
		return price;
	}

	@Override
	public boolean addUser(User u) 
	{
		if (userMap.containsKey(u.getId())) 
		{
			User u1 = userMap.get(u.getId());
			u1.setUsername(u1.getUsername() + u.getUsername());
			u1.setPassword(u1.getPassword() + u.getPassword());
			return true;
		}
		userMap.put(u.getId(), u);
		return false;
	}
	
	@Override
	public boolean removeUser(String uid) throws UserNotFoundException 
	{
		if (userMap.containsKey(uid)) 
		{
			userMap.remove(uid);
			return true;
		} else { throw new UserNotFoundException("User with ID " + uid + " is not Found."); }
	}

	@Override
	public Collection<User> getUserDetails() 
	{
		return userMap.values();
	}
	
	public User getUserData(String uid) throws UserNotFoundException 
	{
		if (userMap.containsKey(uid)) 
		{
			return userMap.get(uid);
		} else { throw new UserNotFoundException("User with ID " + uid + " is not Found."); }
	}

	@Override
	public int userCount() 
	{
		return userMap.size();
	}

}