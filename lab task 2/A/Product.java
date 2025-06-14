import java.lang.*;
public class Product
{
	private  String productId;
	private String productName;
	private double price;
	private int availableQuantity;
	 
	
	 public Product ()
	 {
		 
	 }
	 public Product(String productId,String productName,double price,int availableQuantity)
	 {
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.availableQuantity=availableQuantity;
	 }
	 public void showDetails()
	 {
		
		System.out.println("This product Id is:"+productId);
		System.out.println("This product name is:"+productName);
		System.out.println("This price is:"+price);
		System.out.println("Available Quantity is:"+availableQuantity);
	 }
	 
	 public void setProductId(String productId)
	{
		this.productId=productId;
	}
	public String getProductId()
	{
		return productId;
	}
		
	 public void setProductName(String productName)
	{
		this.productName=productName;
	}
	public String getProductName()
	{
		return productName;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity=availableQuantity;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}
}	