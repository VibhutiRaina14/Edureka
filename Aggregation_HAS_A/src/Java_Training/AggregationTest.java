package Java_Training;
class Employee
{
	String name;
	int id;
	String dept;
	public Employee(String name, int id, String dept) {
		//super();
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
}
class Department
{
	public Department(String[] name, int no_employees) {
		//super();
		this.name = name;
		this.no_employees = no_employees;
	}
	String name[];
	int no_employees;
	
}
class Organization
{
	String officeName;
	String dept;
	public Organization(String officeName, String dept) {
		//super();
		this.officeName = officeName;
		this.dept = dept;
	}
	
}

public class AggregationTest {
	public static void main(String[] args)
	{
		Employee e=new Employee("Vibhuti",1,"Banking");
		
		
		
		
	}

}
