public class Start
{
	public static void main(String args[])
	{
		Account a1=new Account();
		a1.setAccountNumber(76);		
		a1.setAccountHolderName("Nowshin");
		a1.setBalance(2000000);
		System.out.println("Account Number is:"+a1.getAccountNumber());
		System.out.println("Name is:"+a1.getAccountHolderName());
		System.out.println("Cgpa is:"+a1.getBalance());
		Account a2=new Account(74,"Nowshin Fariha",60000);
		a2.showDetails();
		
	}
}