package abstraction;
class Accountholder1 
{
public static void main(String[] args)
{
	ATM atm=new ATM();
	Bank bank=atm;
	atm.deposit(5000);
	atm.withdraw(2000);
	atm.checkBalance();
}
}
interface Bank
{
	void deposit(int n);
	void withdraw(int n);
	void checkBalance(int n);
}
class ATM implements Bank
{
	public static int balance=10000;
	public void deposit(int n)
	{
		balance=balance+n;
		System.out.println("amount deposited sucessfully");
		System.out.println("balance is:"+balance);
	}
	public void withdraw(int n)
	{
		if(n<=balance)
		{
			balance=balance-n;
			System.out.println("withdraw is sucessfull");
			System.out.println("balance is:"+balance);
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
	public void checkBalance()
	{
		System.out.println("remaining balance is:"+balance);
	}
	
	}
