package task4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

class AccountTesting {

	
//===================================
// Checking Account Tests	
//===================================
	
	
	@Test
	public void DepositTest1() {
		
		CheckingAccount a = new CheckingAccount();
		a.deposit(1000);
		double target = a.get_balance();
		assertEquals(target, 1000);
	}

	@Test
	public void DepositTest2() {
		
		CheckingAccount a = new CheckingAccount();
		a.deposit(1000);
		double target = a.get_balance();
		assertNotEquals(target, 2000);
	}
	
	
	@Test
	public void WithdrawTest1() {
		
		CheckingAccount a = new CheckingAccount();
		a.deposit(1000);
		a.withdraw(200);
		double target = a.get_balance();
		assertEquals(target, 800);
		
	}

	@Test
	public void WithdrawTest2() {
		
		CheckingAccount a = new CheckingAccount();
		a.deposit(1000);
		a.withdraw(200);
		double target = a.get_balance();
		assertNotEquals(target, 700);
		
	}

	
	@Test
	public void transferAmountTest1() {
		
		CheckingAccount a1 = new CheckingAccount();
		CheckingAccount a2 = new CheckingAccount();
		a1.deposit(50000);
		boolean flag = a1.transferAmount(a2, 1000);
		assertEquals(true, flag);
		
	}
	
	@Test
	public void transferAmountTest2() {
		
		CheckingAccount a1 = new CheckingAccount();
		CheckingAccount a2 = new CheckingAccount();
		a1.deposit(500);
		boolean flag = a1.transferAmount(a2, 1000);
		assertEquals(false, flag);
		
	}
	
	

//===================================
// Saving Account Tests	
//===================================
	
	
	@Test
	public void DepositTest3() {
		
		SavingsAccount a = new SavingsAccount();
		a.deposit(1000);
		double target = a.get_balance();
		assertEquals(target, 1000);
	}

	@Test
	public void DepositTest4() {
		
		SavingsAccount a = new SavingsAccount();
		a.deposit(1000);
		double target = a.get_balance();
		assertNotEquals(target, 2000);
	}
	
	
	@Test
	public void WithdrawTest3() {
		
		SavingsAccount a = new SavingsAccount();
		a.deposit(1000);
		a.withdraw(200);
		double target = a.get_balance();
		assertEquals(target, 800);
		
	}

	@Test
	public void WithdrawTest4() {
		
		SavingsAccount a = new SavingsAccount();
		a.deposit(1000);
		a.withdraw(200);
		double target = a.get_balance();
		assertNotEquals(target, 700);
		
	}

	
	@Test
	public void transferAmountTest3() {
		
		SavingsAccount a1 = new SavingsAccount();
		SavingsAccount a2 = new SavingsAccount();
		a1.deposit(50000);
		boolean flag = a1.transferAmount(a2, 1000);
		assertEquals(true, flag);
		
	}
	
	@Test
	public void transferAmountTest4() {
		
		SavingsAccount a1 = new SavingsAccount();
		SavingsAccount a2 = new SavingsAccount();
		a1.deposit(500);
		boolean flag = a1.transferAmount(a2, 1000);
		assertEquals(false, flag);
		
	}

	@Test
	public void zakatTest1() {
		
		SavingsAccount a1 = new SavingsAccount();
		a1.deposit(200000);
		double target = a1.calculateZakat();
		double result = ((a1.get_balance() * 2.5) / 100);
		assertEquals(target, result);
	}
	
	@Test
	public void zakatTest2() {
		
		SavingsAccount a1 = new SavingsAccount();
		a1.deposit(19999);
		double target = a1.calculateZakat();
		double result = ((a1.get_balance() * 2.5) / 100);
		assertNotEquals(target, result);
	}
		
	@Test
	public void InterestRateTest1() {
		
		SavingsAccount a1 = new SavingsAccount();
		a1.deposit(10000);
		a1.set_interest(1.5);
		double target = a1.calculateInterest();
		double result = (10000 * 1.5) + 10000;
		assertEquals(target,result);
	}
	
	@Test
	public void InterestRateTest2() {
		
		SavingsAccount a1 = new SavingsAccount();
		a1.deposit(10000);
		a1.set_interest(2.0);
		double target = a1.calculateInterest();
		double result = (10000 * 1.5) + 10000;
		assertNotEquals(target,result);
	}
	
	
}
