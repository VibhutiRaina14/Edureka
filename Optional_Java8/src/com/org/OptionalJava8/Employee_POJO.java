package com.org.OptionalJava8;

public class Employee_POJO {
	int id;
	String name;
	int age;
	String gender;
	int doj;
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getDoj() {
		return doj;
	}
	public void setDoj(int doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee_POJO(int id, String name, int age, String gender, int doj, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.doj = doj;
		this.salary = salary;
	}
	public Employee_POJO()
	{
	}
	@Override
	public String toString() {
		return "Employee_POJO [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", doj=" + doj
				+ ", salary=" + salary + "]";
	}
	

}
