package com.org.twoDArray;

public class Cart {
	Product[][] carts;
	int[] cartSizes;
	Cart(int noCustomers,int cartsize)
	{
		carts=new Product[noCustomers][cartsize];
		cartSizes=new int[noCustomers];
	}

}
