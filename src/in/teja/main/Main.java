package in.teja.main;

import java.util.Scanner;

import in.teja.bank.TransactionProcess;

public class Main {

	public static void main(String[] args) 
	{
	
		TransactionProcess obj1=new TransactionProcess();
		System.out.println("*******Welcome To Ineuron Bank******");
		System.out.println();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter CustomerId");
		String CustomerId = sc.next();
		System.out.println();
		
		
		System.out.println("Please enter password");
		int passoword = sc.nextInt();
		System.out.println();
		
		
		boolean status =obj1.doTransaction(CustomerId,134123);
		
	
		if(status)
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login Failed!!!" );
		}

	}

}
