package com.jsp;

public class BankImpl implements Bank 
{
	double balance;
	public BankImpl(double balance)
	{
		this.balance=balance;
	}
	@Override
	public void deposit(double amt)
	{
		if(amt>0) {
			System.out.println("Depositing amount :"+amt);
			balance+=amt;
			System.out.println("Amount deposited !");
		}
	}
	@Override
	public void withdraw(double amt)
	{
		if(amt<=balance &&amt >0) {
			System.out.println("Withdrawal amount :"+amt);
			balance-=amt;
			System.out.println("Amount withdrawn !");
		}
		else
		{
			try
			{
				throw new InsufficientBalanceException("Insufficient Balance");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public double getBalance()
	{
		return balance;
	}
}
