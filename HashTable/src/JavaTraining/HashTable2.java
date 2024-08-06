package JavaTraining;
import java.util.*;
import java.util.Map.Entry;
public class HashTable2 {
//	void getofdefault()
//	{
//		if(key)
//	}
	public static void main(String[] args) {
		Hashtable<Integer, String> h=new Hashtable<Integer, String>();
		h.put(1,"Vibhuti");
		h.put(2,"Prachiti");
		h.get(1);
		Enumeration<Integer> en=h.keys();
		while(en.hasMoreElements())
		{
			int key=en.nextElement();
			System.out.println(key);
		}
		Set<Entry<Integer,String>> s=h.entrySet();
		for(Entry<Integer,String> x:s)
		{
			
		}
				
	}
	

}
