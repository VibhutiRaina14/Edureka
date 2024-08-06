package ProductDeliverySystem;

public class Main {
	public static void main(String[] args)
	{
		DeliveryManager manager=new DeliveryManager(5);
		//Adding deliveries
		manager.add_del(new Pdt("Laptop",1),new Address("123 main","Spring","123345"));
		manager.add_del(new Pdt("Phone",2),new Address("1789 main","Spring","0987765"));
		
		//Displaying deliveries
		System.out.println("Deliveries");
		manager.displayDeliveries();
		
		//Updating deleveries
		
		
		
		
	}

}
