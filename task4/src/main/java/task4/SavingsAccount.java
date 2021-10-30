package task4;

public class SavingsAccount {

	private int accNum;
	private String name;
	private String address;
	private String phoneNum;
	private double balance;
	private double interest;
	private double zakat;
	
	
	public SavingsAccount()
	{
		accNum=0;
		name="";
		address="";
		phoneNum="";
		balance=0;
		interest=0;
		zakat=0;
	}
	
	public SavingsAccount(int AN, String N, String Ad, String pNum, int num, double bal, double inter, double z)
	{
		accNum=AN;
		name=N;
		address=Ad;
		phoneNum=pNum;
		balance=bal;
		interest=inter;
		zakat=z;
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
		
		else if(num > balance)
		{
			System.out.print("Insufficient Balance!!!");
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

	public boolean transferAmount(SavingsAccount targetAcc, double num) 
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
	
	public double calculateZakat() 
	{
		if(balance >= 20000)
		{
			zakat = (balance*2.5)/100;
			return zakat;
		}
		
		else
			return 0;
	}
	
	public double calculateInterest()
	{
		return ((balance*interest) + balance);
	}
	
	
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
	
	public void set_interest(double ir) 
	{
		interest = ir;
	}
	public double get_interest() 
	{
		return interest;
	}
}
