package JavaPackage;
//Encapsulation
//Read and write
//private we can access using getters and setters
class Student//default
{
	private String studName;
	private String rollno;
	private String id;
	int a;//default
	
	public String getter_studName()
	{
		return studName;
	}
	public String getter_rollno()
	{
		return rollno;
	}
	public String getter_id()
	{
		return id;
	}
	public void setter_studName(String studName)
	{
		this.studName=studName;
	}
	public void setter_rollno(String rollno)
	{
		this.rollno=rollno;
	}
	public void setter_id(String id)
	{
		this.id=id;
	}
	
	
}
public class EncapsulationTest {
	public static void main(String[] args)
	{
		Student obj=new Student();
		obj.setter_studName("Vibhuti");
		obj.setter_rollno("52");
		obj.setter_id("1711952");
		//System.out.println(getter_)
	}
	
}

