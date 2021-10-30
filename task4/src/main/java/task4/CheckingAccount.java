package task4;

public class CheckingAccount {

	private int accNum;
	private String name;
	private String address;
	private String phoneNum;
	private double balance;
	private double tax;
	
	
	public int get_accNum()
	{
		return accNum;
	}
	
	public String get_name() 
	{
		return name;
	}
	
	public String get_address() 
	{
		return address;
	}
	
	public String get_phoneNum() 
	{
		return phoneNum;
	}
	
	public double get_balance() 
	{
		return balance;
	}
	
	public double get_tax() 
	{
		return tax;
	}
	
	public CheckingAccount()
	{
		accNum=0;
		name="";
		address="";
		phoneNum="";
		balance=0;
		tax=0;
	
	}
	
	public CheckingAccount(int AN, String N, String Ad, String pNum, int num, double bal)
	{
		accNum=AN;
		name=N;
		address=Ad;
		phoneNum=pNum;
		balance=bal;
		tax=1.5;
				
	}
	
	public void deposit(double num)
	{
		balance += num;
	}
	
	
	public void withdraw(double num) 
	{
		if(num < 0)
		{
			System.out.print("Error!!! Cannot withdraw negative amount!!!");
		}
		
		else if(num - balance > 5000)
		{
			System.out.print("Insufficient funds!!!");
		}
		
		else
		{
			balance -= num;
		}
			
	}
	
	public void balanceCheck() 
	{
		System.out.print("\nAccount Number : " + accNum + "\nAccount Holder: " + name + "\nAccount Balance : " + balance);
	}
	
	
	public void printStatement() 
	{
		System.out.print("\nAccount Holder: " + name + "\nAccount Number : " + accNum  + "\nAccount Holder's Address : " + address + "\nAccount Holder's Phone Number : " + phoneNum + "\nAccount Balance : " + balance );
	}

	public boolean transferAmount(CheckingAccount targetAcc, double num) 
	{	
		if(num > balance)
		{
			return false;
		}
		
		else
		{
			this.withdraw(num);
			targetAcc.deposit(num);
			return true;
		}
	}
	
	
	
}