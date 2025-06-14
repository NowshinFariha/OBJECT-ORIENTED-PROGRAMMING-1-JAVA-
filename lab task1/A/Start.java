public class Start
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.setId(22);		
		s1.setName("Fariha");
		s1.setCgpa(5.00);
		System.out.println("Id is:"+s1.getId());
		System.out.println("Name is:"+s1.getName());
		System.out.println("Cgpa is:"+s1.getCgpa());
		
		
	}
}