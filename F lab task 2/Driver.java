import java.lang.*;
public class Driver
{
	
	private String name;
	private double dNumber;
	Car cars[];
	public Driver()
	{
		
	}
	public Driver(String name,double dNumber )
	{
		this.name=name;
		this.dNumber=dNumber;
		
	}
	
	public void setCar(Car c[])
	{
		cars=c;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDNumber(String dNumber)
	{
		this.dNumber=dNumber;
	}
	
	
	public String getName()
	{
		return name;
	}
	public String getDNumber()
	{
		return dNumber;
	}
	public void Cardetails(String name)
	{
		int count=cars.length;
		for(int i=0;i<count;i++)
		{
			System.out.println("Car name is : "+cars[].getName());
		}
			

	Public void Cardetails(String modelNumber)
	{
		int count=cars.length;
		for(int i=0;i<count;i++)
		{
			System.out.println("Model Number is : "+cars[].getmodelNumber());
		}
	}	
		public void showDetails()
	{
		System.out.println("Car Name is : "+name);
		System.out.println("Car model number is : "+modelNumber);
		
	}
			
}