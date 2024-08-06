package com.org.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Map {
	
	public static int solve(int n,int x)
	{
		
		try {
			return n/x;
		}
		catch(Exception e)
		{
			
		}
		return -1;
	}
	public static List<Integer> divide(List<Integer> l1,Integer x)
	{
		return l1.stream().map(n ->solve(n,x)).collect(Collectors.toList());
		
	}

}
