package JavaPackage;
 class privateCtor {
	int a;
	private privateCtor(int a)
	{
		this.a=a;
	}
	private privateCtor()
	{
		System.out.println("Non-parametrized ctor called");
	}
	public static void main(String[] args)
	{
		privateCtor p1=new privateCtor();
		privateCtor p2=new privateCtor(20);
		System.out.println("a="+p2.a);
	}
	

}
