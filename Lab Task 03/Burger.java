public class Burger extends FoodItem
{
	private int numberOfPatties;
	Burger()
	{
		
	}
	Burger(int numberOfPatties,double price,String name)
	{
	super(price,name);
	this.numberOfPatties=numberOfPatties;
	}
	
	public void setNumberOfPatties(int numberOfPatties)
	{
		this.numberOfPatties=numberOfPatties;
	}
	public int getNumberOfPatties()
	{
		return numberOfPatties;
	}
	
}