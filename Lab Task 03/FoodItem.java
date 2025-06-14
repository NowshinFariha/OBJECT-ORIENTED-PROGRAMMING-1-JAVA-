public class FoodItem
{
	private double price;
	private String name;
	FoodItem()
	{
		
	}
	FoodItem(double price,String name)
	{
		this.price=price;
		this.name=name;
		
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void showDetails()
	{
		System.out.println("Food Name is:"+name);
		System.out.println("Food Price is:"+price);
		
	}
	
}