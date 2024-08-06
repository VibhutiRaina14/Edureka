package com.org.twoDArray;

public class CartManager {
	Cart cart;
	CartManager(int noCustomers, int cartSize)
	{
		cart=new Cart(noCustomers, cartSize);
	}
	void addToCart(int customerId,Product product)
	{
		if(cart.cartSizes[customerId]<cart.carts[customerId].length)
		{
			cart.carts[customerId][cart.cartSizes[customerId]++]=product;
		}
		else
		{
			System.out.println("Cart is full");
		}
	}
	void displayCart(int customerId)
	{
		System.out.println("Cart for customers"+(customerId+1)+":");
		for(int i=0;i<cart.cartSizes[customerId];i++)
		{
			System.out.println((i+1)+". "+cart.carts[customerId][i].name+" -$"+cart.carts[customerId][i].price);
		}
	}
	double purchase(int customerId)//see
	{
		double total=0;
		for(int i=0;i<cart.cartSizes[customerId];i++)
		{
			System.out.println((i+1)+". "+cart.carts[customerId][i].name+" -$"+cart.carts[customerId][i].price);
		}
		return total;
		
	}

}
