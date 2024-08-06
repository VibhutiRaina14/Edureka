package com.src.tcs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
		public static void main(String[] args) {
			List<Employee> emp=new ArrayList<>();
			emp.add(new Employee(1L));
			emp.add(new Employee(2L));
			emp.add(new Employee(3L));
			emp.add(new Employee(4L));
			emp.add(new Employee(5L));
			List ids=emp.stream().filter(e->e.getId()>1L).map(e->e.getId()).collect(Collectors.toList());
			System.out.println(ids);
		}

}
