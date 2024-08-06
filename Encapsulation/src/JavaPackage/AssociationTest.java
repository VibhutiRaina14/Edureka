package JavaPackage;
class Bank
{
	private String bankName;
	private Employee employee[];
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Employee[] getEmployee() {
		return employee;
	}
	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}	
}
class Employee{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class AssociationTest {
	public static void main(String[] args)
	{
		Employee e1[]=new Employee[2];
		e1[0]=new Employee();//memory allocation needs to be done else it will point to null
		e1[1]=new Employee();
		e1[0].setName("Niveda");
		e1[1].setName("Vibhuti");
		
		Bank b1=new Bank();
		b1.setBankName("SBI");
		b1.setEmployee(e1);
		
		for(int i=0;i<e1.length;i++)
		System.out.println(b1.getEmployee()[i].getName()+" is working in "+b1.getBankName());
		
		/*Employee e2[]=new Employee[3];
		e2[0].setName("Sayali");
		e2[1].setName("Prachiti");
		e2[1].setName("Aishwarya");
		
		Bank b2=new Bank();
		b2.setBankName("Axis");
		b2.setEmployee(e2);*/
		
		
		
		
		
	}

}
