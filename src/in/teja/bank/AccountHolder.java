package in.teja.bank;

import java.util.Scanner;

public class AccountHolder {

      public boolean customer(int pin)
      {
    	
    	  BankAccount obj1=new BankAccount();
    	  obj1.showMenu();
    	  return true;
      }

}
class BankAccount{
	int balance;
	int TransactionHistory;
	
	
	
	void deposit(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			TransactionHistory = amount;
		}
	}
	
	void withdraw(int amount) {
		if(balance != 0) {
			balance = balance - amount;
			TransactionHistory = -amount;
			System.out.println();
			System.out.println("Transaction successful");
		}
		else
		{
			System.out.println("Insufficient Funds ");
		}
	}
	void transfer(int amount)
	{
		if(balance!=0)
		{
			balance=balance - amount;
			TransactionHistory=-amount;
			System.out.println();
			System.out.println("Transaction successful");
			
		}
		else
		{
			System.out.println("Insufficient Funds ");
		}
	}
	
	
	void getTransactionHistory() {
		if(TransactionHistory > 0) {
			System.out.println("Deposited: " + TransactionHistory);
		}
		else if(TransactionHistory < 0) {
			System.out.println("Withdraw: " +Math.abs(TransactionHistory));
		}
		else if(TransactionHistory > 0) {
			System.out.println("Transfered: " +Math.abs(TransactionHistory));
		}
		
		else {
			System.out.println("No Transaction Occured");
		}
	}
	
	void showMenu() {
		
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hi Teja Kiran ");
		
		System.out.println();
		
		
		
		System.out.println("1 : Check Your Balance");
		System.out.println("2 : Deposit");
		System.out.println("3 : Withdraw");
		System.out.println("4 : Transfer");
		System.out.println("5 : Transaction History");
		System.out.println("6 : Exit The System");
		
		do {
			System.out.println("");
			System.out.println("**** PLEASE SELECT A OPTION ****");
			System.out.println();
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch (option) {
			
			case '1':
				System.out.println("-------------------------------------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("-------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case '2':
				System.out.println("-------------------------------------------------------");
				System.out.println("Enter an amount to deposit ");
				System.out.println("-------------------------------------------------------");
				
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				
				break;
				
			case '3':
				System.out.println("-------------------------------------------------------");
				System.out.println("Enter an amount to withdraw ");
				System.out.println("-------------------------------------------------------");
				
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
			
				break;
				
			case '4':
				System.out.println("-------------------------------------------------------");
				System.out.println("Enter an amount to Transfer ");
				System.out.println("-------------------------------------------------------");
				
				int amount3 = scanner.nextInt();
				transfer(amount3);
				System.out.println("\n");
				
				break;	
				
			case '5':
				System.out.println("-------------------------------------------------------");
				getTransactionHistory();
				System.out.println("-------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case '6' :
				System.out.println("=========================================================================================================");
				break;

			default:
				System.out.println("Invalid Option!! Please Enter Correct Opton...");
				break;
			}			
		}
		while(option != '6');
			System.out.println("Thank You for Using our Services.....!!");
	}
}	