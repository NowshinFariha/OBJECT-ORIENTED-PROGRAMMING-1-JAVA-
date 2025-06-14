import java.lang.*;
public class Account
{
	
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	 
	
	 public Account ()
	 {
		 
	 }
	 public Account(int an,String ahn,double b)
	 {
		 
		 accountNumber=an;
		 accountHolderName=ahn;
		 balance=b;
		 
	 }
	 public void setAccountNumber(int an)
	{
		accountNumber=an;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	 
	 public void setAccountHolderName(String ahn)
	{
		accountHolderName=ahn;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	
	public void setBalance(double b)
	{
		balance=b;
	}
	public double getBalance()
	{
		return balance;
	}
	void showDetails()
	{
		System.out.println("Account Number is:"+accountNumber);
		System.out.println("Account Holder Name is:"+accountHolderName);
		System.out.println("Balance is:"+balance);
	}
}	