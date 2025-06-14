import java.lang.*;
public class Student
{
	private  int id;
	private String name;
	private double cgpa;
	 
	
	 public Student ()
	 {
		 
	 }
	 public Student(int i,String n,double cg)
	 {
		 id=i;
		 name=n;
		 cgpa=cg;
	 }
	 public void setId(int i)
	{
		id=i;
	}
	public int getId()
	{
		return id;
	}
		
	 public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setCgpa(double cg)
	{
		cgpa=cg;
	}
	public double getCgpa()
	{
		return cgpa;
	}
}	