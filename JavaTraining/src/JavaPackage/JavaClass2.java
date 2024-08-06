package JavaPackage;

public class JavaClass2 extends JavaClass1{
	
	public static void main(String[] args) 
	{
		JavaClass2 obj=new JavaClass2();
		System.out.println(obj.a);//within inherited class of same package
		obj.method();
	}
 
}
