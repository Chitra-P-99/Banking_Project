package com.jsp;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner ip=new Scanner(System.in);
		Bank b=new BankImpl(20000);
		int n=0;
		double a=0.0;
		while(true)
		{

			System.out.println("Enter your choice\n1.Deposit\n2.Withdraw \n3.Check Balance \n4.Exit");
			n=ip.nextInt();
			if(n>=1 && n<=2) {
				System.out.println("Enter the amount");
				a=ip.nextDouble();
			}
			else if(n>4)
			{
				try
				{
					throw new InvalidChoiceException("Please enter your choice 1 - 4");
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
					switch(n)
					{
					case 1:

						b.deposit(a);
						break;
					case 2: 

						b.withdraw(a);
						break;
					case 3: System.out.println("Balance :"+b.getBalance());
					break;
					case 4: System.out.println("Thank You");
					System.exit(0);
					break;
					default:System.out.println("Please enter your choice 1 - 4");
					}
				
				System.out.println("*==*==*==*==*==*==*==*==*==*==*==*");
			}
		}
	}
