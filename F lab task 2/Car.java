import java.lang.*;
public class Car
{
	
	private String name;
	private String modelNumber;
	
	public Car()
	{
		
	}
	public Car(String name,String modelNumber )
	{
		this.name=name;
		this.modelNumber=modelNumber;
		
	}
	public Car(String modelNumber,String name )
	{
		this.modelNumber=modelNumber;
		this.name=name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setModelNumber(String modelNumber)
	{
		this.modelNumber=modelNumber;
	}
	
	
	public String getName()
	{
		return name;
	}
	public String getModelNumber()
	{
		return modelNumber;
	}
	
	
}