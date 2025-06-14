public class Start
{
	public static void main(String args[])
	{
		Product p1=new Product("2299","Mobile phone",20000.0,100);
		p1.showDetails();
		
		Product p2=new Product();
		p2.setProductId("2299");		
		p2.setProductName("Mobile phone");
		p2.setPrice(20000.0);
		p2.setAvailableQuantity(100);
		System.out.println("product id is:"+p2.getProductId());
		System.out.println("product Name is:"+p2.getProductName());
		System.out.println("Price is:"+p2.getPrice());
		System.out.println("Available Quantity:"+p2.getAvailableQuantity());
		
	}
}