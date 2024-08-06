package com.org.Streams;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		//Employee_POJO e=new Employee_POJO(1,"Vibhuti",23,"F",20_06_2019,80_000.0);
		ArrayList<Employee_POJO> arr=new ArrayList<Employee_POJO>();
		arr.add(new Employee_POJO(1,"Vibhuti",23,"F",20_06_2019,80_000.0));
		arr.add(new Employee_POJO(2,"Vibhuti",23,"M",20_06_2019,80_000.0));
		arr.add(new Employee_POJO(3,"Vibhuti",23,"F",20_06_2019,80_000.0));
		arr.add(new Employee_POJO(4,"Vibhuti",23,"M",20_06_2019,80_000.0));
		arr.add(new Employee_POJO(5,"Vibhuti",23,"M",20_06_2019,80_000.0));
		System.out.println("Count of female employees:");
		System.out.println(arr.stream().filter(e->e.getGender()=="F").count());//count no of female employees 
		//no. of men and females
		Map<String, Long> countByGender=arr.stream().collect(Collectors.groupingBy(Employee_POJO::getGender,Collectors.counting()));
		countByGender.forEach((gender,count)->System.out.println("Count of "+gender+" : "+count));
		//2nd largest salary
		
		
	}

}
