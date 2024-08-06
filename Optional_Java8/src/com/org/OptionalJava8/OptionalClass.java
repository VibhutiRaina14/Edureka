package com.org.OptionalJava8;
import java.util.Optional;

import com.org.*;

public class OptionalClass {
	public static void main(String[] args) {
		Integer x[]=new Integer[20];
		//System.out.println(x[10]);//null
		//System.out.println(x[10].intValue());//nullptr
		
//		Optional<Integer> o=Optional.ofNullable(x[10]);
//		if(o.isPresent())
//		{
//			System.out.println(x[10].intValue());
//		}
//		else
//		{
//			System.out.println("Not present");
//		}
		
		Employee_POJO e=new Employee_POJO(1,"Vibhuti",23,"F",20_06_2019,80_000.0);
		Optional<Employee_POJO> op=Optional.ofNullable(e);
		op.ifPresent(em ->System.out.println("Name is "+em.getName()));
	}
}
