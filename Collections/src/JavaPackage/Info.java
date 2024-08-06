package JavaPackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Info {
	public static void main(String[] args)
	{
		LinkedHashSet<Student> h1=new LinkedHashSet<Student>();
		h1.add(new Student(1,"Vibhuti","Maharastra"));
		h1.add(new Student(2,"Sayali","MP"));
		h1.stream().forEach(System.out::println);
		
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(new Student(1,"Vibhuti","Maharastra"));
		
//		Iterator<Student> it=h1.iterator();
//		
//		while(it.hasnext())
//		{
//			System.out.println(it.next());
//		}
//		System.out.println(h1.size());  
		
	}

}
