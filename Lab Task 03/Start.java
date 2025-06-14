public class Start
{
	public static void main(String args[])
	{
		
		Pizza p1=new Pizza("12",750.0,"Chilli pizza");
		p1.showDetails();
		System.out.println("pizza size is"+p1.getSize());
		
		Pizza p2=new Pizza("13",700.0,"Mega pizza");
		p2.showDetails();
		System.out.println("pizza size is"+p2.getSize());
		
		
		Burger b1=new Burger(2,900.0,"Mega burger");
		b1.showDetails();
		System.out.println("Number of patties is:"+b1.getNumberOfPatties());

        Burger b2=new Burger(4,1000.0,"Chilli burger");
		b2.showDetails();
		System.out.println("Number of patties is:"+b2.getNumberOfPatties());
		
		
		
		
	}
}