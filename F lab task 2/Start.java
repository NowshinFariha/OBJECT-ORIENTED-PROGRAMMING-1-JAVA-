import java.lang.*;
public class Start
{
	public static void main(String args[])
	{
		Driver d1=new Driver("Maxim",23.08);
		
		Car c0=new Car("BMW","1011");
		Car c1=new Car("Lamborghini","2091");
		Car c2=new Car("Toyota","3301");
		
		Car c[]=new Car[3];
		c[0]=c0;
		c[1]=c1;
		c[2]=c2;
		
		d1.setCar(c);		
		
		System.out.println("        -----------        ");
		System.out.println("Driver name is : "+d1.getName());
		System.out.println("Driver number is: "+d1.getdNumber());
		System.out.println("        -----------        ");
		d1.getCar();
		
		System.out.println();
	
		
	}
}