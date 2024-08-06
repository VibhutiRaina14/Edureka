package ProductDeliverySystem;

public class Delivery {
	Pdt pdt1;
	Address add;
	Delivery(Pdt pdt1,Address add)
	{
		this.pdt1=pdt1;
		this.add=add;
	}
	@Override
	public String toString()
	{
		return "Product: "+pdt1.name+", Quantity: "+pdt1.qty+" ,Address: "+add.street+ " , "+add.city+" , "+add.postalCode;
	}

}
