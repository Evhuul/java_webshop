package se.hejhej.webshop;

import java.util.Iterator;

public class Main {

	public static void main(String[] s) throws Exception {

		Order o = new Order();
		o.addUser(new User("1", "Kent Oksman", "Java_apa"));
		o.addUser(new User("2", "Ronald McDonalds", "Omnomnom"));

		System.out.println("Total Users: " + o.userCount());
		final Iterator<User> iterateUser = o.getUserDetails().iterator();
		while (iterateUser.hasNext()) 
		{
			System.out.println(iterateUser.next());
		}

		/**** Target user with id, and update him with new values *****/
		// System.out.println("\nUpdating user" + o.getUserData("1") +
		// "\nResponse: " + o.removeUser("1"));
		// o.addUser(new User("1", "Anders Carlsson", "meow"));
		// System.out.println ("\nThis is the new user: "+o.getUserData("1"));

		/*** Delete one user and update total users ***/
		// System.out.println ("\nDeleting User "+ o.getUserData("1") +
		// o.removeUser("1"));
		// System.out.println("\nTotal Users: " + o.userCount());

		/**** Get user by its id *****/
		// System.out.println ("\nThis is user: "+o.getUserData("2"));

		/***** User's above, products below *******/

		o.addProduct(new Product("p101", "Whisky", 1, 120));
		o.addProduct(new Product("p102", "Beer", 4, 35 * 4));

		System.out.println ("\nOrder Placed By: "+o.getUserData("2"));
		System.out.println("\nNo. of Product : " + o.productCount());
		System.out.println("Cart Total : " + o.getCartPrice() + "kr");
		final Iterator<Product> iterateProduct = o.getCartDetails().iterator();
		while (iterateProduct.hasNext()) 
		{
			System.out.println(iterateProduct.next());
		}

		/****** remove product from Cart and update ******/
		// System.out.println("\n Removing product: " +
		// o.removeProduct("p102"));
		// System.out.println("\nNo. of Product : " + o.productCount());

		/**** Get product by its id *****/
		// System.out.println("\nGetting product: " +
		// o.getProductFromCart("p101"));

		// System.out.println("Updating product: " +
		// o.getProductFromCart("p102") + o.removeProduct("p102"));
		// o.addProduct(new Product("p102", "Beer", 24, 35*24));
		// System.out.println("Product updated: " +
		// o.getProductFromCart("p102"));

	}

}