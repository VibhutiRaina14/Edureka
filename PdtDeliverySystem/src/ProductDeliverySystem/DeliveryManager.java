package ProductDeliverySystem;

public class DeliveryManager {
	Delivery[] deliveries;
	int count;
	DeliveryManager(int size)
	{
		deliveries=new Delivery[size];
		count=0;
	}
	void add_del(Pdt pdt1,Address add)
	{
		if(count<deliveries.length)
		{
			deliveries[count++]=new Delivery(pdt1,add);
		}
		else
		{
			System.out.println("Delivery list is full");
		}
		
	}
	void remove_del(int index)
	{
		if(index>=0 && index<count)
		{
			for(int i=index;i<count-1;i++)
			{
				deliveries[i]=deliveries[i+1];
			}
			deliveries[--count]=null;
		}
		
	}
	void update_del(int index,Pdt pdt1)
	{
		if(index>=0 && index<count)
		{
			deliveries[index].pdt1=pdt1;
		}
		else
		{
			System.out.println("Invalid index");
		}
		
		
	}
	void update_del(int index,Address add)
	{
		if(index>=0 && index<count)
		{
			deliveries[index].add=add;
		}
		else
		{
			System.out.println("Invalid index");
		}
		
	}
	void updateDelivery(int index,Pdt newproduct,Address newaddress)
	{
		if(index>=0 && index<count)
		{
			deliveries[index].pdt1=newproduct;
			deliveries[index].add=newaddress;
		}
		else
		{
			System.out.println("Invalid index");
		}
		
	}
	//display all deliveries
	void displayDeliveries()
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(deliveries[i]);
		}
	}

}
