package in.teja.restaurant;

import java.util.Scanner;

public class Restaurantowner 
{
	

      public boolean owner()
      {
    	
    	  Food obj1=new Food();
    	  obj1.showMenu();
    	  return true;
      }

}
class Food{
	int balance;
	int TransactionHistory;
	int amount;
	
	
	
	void chickenbiryani()
	{
		
		amount=240;
		balance = balance + amount;
		
		System.out.println("CHICKEN BIRYANI MARKED");
			
		
	}
	void hydbiryani()
	{
		
		amount=250;
		balance = balance + amount;
		
		System.out.println("HYD SPL DUMBIRYANI MARKED");
			
		
	}
	void prawnbiryani()
	{
		amount=270;
		balance = balance + amount;
		
		System.out.println("PRAWN BIRYANI MARKED");
			
		
	}
	
	
	void mixedbiryani()
	{
		
		amount=300;
		balance = balance + amount;
	    
		System.out.println("MIXED BIRYANI MARKED");
			
		
	}
	
	//STARTERS
	void lolli()
	{
		 amount=240;
		balance = balance + amount;
		
		System.out.println("CHICKEN LOLLIPOS MARKED");
			
		
	}
	
	void wings()
	{
		 amount=250;
		balance = balance + amount;
		
		System.out.println("CHICKEN WINGS MARKED");
			
		
	}
	
	void chilly()
	{
		 amount=270;
		balance = balance + amount;
		
		System.out.println("CHILLY CHICKEN MARKED");
			
		
	}
	void veg()
	{
		
		amount=270;
		balance = balance + amount;
		
		System.out.println("VEG CORN_SOUP MARKED");
			
		
	}
	void mush()
	{
		
		amount=270;
		balance = balance + amount;
		
		System.out.println("MUSHROOM SOUP MARKED");
			
		
	}
	void sez()
	{
		
		 amount=270;
		balance = balance + amount;
		System.out.println();
		System.out.println("SEZIWAN SOUP MARKED");
			
		
	}
	void straw()
	{
		
	    amount=270;
		balance = balance + amount;
		
		System.out.println("STRAWBERRY-ICECREAM MARKED");
			
		
	}
	
	void dryfruit()
	{
		amount=270;
		balance = balance + amount;
		
		System.out.println("DRY-FRUIT ICECREAM MARKED");
			
		
	}
	
	void butter()
	{
		amount=270;
		balance = balance + amount;
		
		System.out.println("BUTTERSCTOCH ICECREAM MARKED");
		
			
		
	}
	
	
	void showMenu() {
		
		char option = '\0';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println();
		
		System.out.println("  MENU CARD ");
		
		System.out.println("1 : BIRYANIS");
		System.out.println("2 : STARTERS");
		System.out.println("3 : SOUPS");
		System.out.println("4 : DESSERTS");
		System.out.println("5 : SHOW BILL ");
		
		do {
			
			System.out.println("------------------------------------");
			System.out.println("**** PLEASE SELECT A OPTION ****");
			System.out.println("------------------------------------");
			System.out.println();
			option = scanner.next().charAt(0);
			
			
			switch (option) {
			
			case '1':
				System.out.println("BIRYANIS:");
				System.out.println("1 : CHICKEN BIRYANI    @240/");
				System.out.println("2 : HYD SPL DUMBIRYANI @250/");
				System.out.println("3 : PRAWNS BIRYANI     @270/");
				System.out.println("4 : MIXED BIRYANI      @300/");
				System.out.println("5 : BACK TO MENUCARD");
				
				
				
				do {
					System.out.println("----------------------------------------");
					System.out.println("****PLEASE SELECT DELICIOUS BIRYANIS****");
					System.out.println("----------------------------------------");
					System.out.println();
					
					option=scanner.next().charAt(0);
					
					switch(option)
					{
					
					case '1':
						
						
						System.out.println("The cost of chicken biryani is Rs.240/");
						System.out.println();
						chickenbiryani();
						
						
						break;
						
					case '2':	
						
						System.out.println("The cost of HYD SPL DUMBIRYANI is Rs.250/");
						System.out.println();
						hydbiryani();
						
						
						break;
						
                     case '3':	
						
						System.out.println("The cost of PRAWNS BIRYANI  is Rs.270/");
						System.out.println();
						prawnbiryani();
						
							
						
						break;
						
                     case '4':
                    	 System.out.println("The cost of MIXED BIRYANI  is Rs.300/");
                    	 System.out.println();
                    	 mixedbiryani();
                    	 
						break;
						
                     case '5':
                    	 showMenu();
                    	 System.out.println();
                    	 
//                     default:
//         				System.out.println("Invalid Option!! Please Enter Correct Opton...");
//         				break;
//         				
						
						
						
					}
				}	
					while(option != '6');
					
				
			case '2':
				System.out.println("STARTERS:");
				System.out.println("1 : CHICKEN LOLLIPOPS   @240/");
				System.out.println("2 : CHICKEN WINGS       @250/");
				System.out.println("3 : CHILLY CHICKEN      @270/");
				System.out.println("4 : BACK TO MENU CARD");
				
				do {
					System.out.println("----------------------------------------");
					System.out.println("****PLEASE SELECT DELICIOUS STARTERS****");
					System.out.println("----------------------------------------");
					System.out.println();
					
					option=scanner.next().charAt(0);
					
					switch(option) {
					
					case '1':
						
						
						System.out.println("The cost of CHICKEN LOLLIPOPS is Rs.240/");
						System.out.println();
						lolli();
						
						
						break;
						
					case '2':	
						
						System.out.println("The cost of CHICKEN WINGS is Rs.250/");
						System.out.println();
						wings();
						
						
						break;
						
                     case '3':	
						
						System.out.println("The cost of CHILLY CHICKEN is Rs.270/");
						System.out.println();
						chilly();
						
						
						
						break;
						
                     
                     case '4':
                    	 showMenu();
                    	 System.out.println();
							
					
//                     default:
//         				System.out.println("Invalid Option!! Please Enter Correct Opton...");
//         				break;
						
						
						
					}
				}	
					while(option != '5');
				    {
					    
					}
				
				

				
			case '3':
				System.out.println("SOUPS:");
				System.out.println("1 : VEG-CORN SOUP  @140/");
				System.out.println("2 : MUSHROOM SOUP  @250/");
				System.out.println("3 : SEZWAN SOUP    @270/");
				System.out.println("4 : BACK TO MENUCARD");
				
				do {
					System.out.println("----------------------------------------");
					System.out.println("****PLEASE SELECT DELICIOUS SOUPS****");
					System.out.println("----------------------------------------");
					System.out.println();
					
					option=scanner.next().charAt(0);
					
					switch(option) {
					
					case '1':
						
						
						System.out.println("The cost of VEG-CORN SOUP  is Rs.140/");
						System.out.println();
						
						veg();
						
						
						break;
						
					case '2':	
						
						System.out.println("The cost of MUSHROOM SOUP  is Rs.250/");
						System.out.println();
						mush();
						
						
						break;
						
                     case '3':	
						
						System.out.println("The cost of  SEZWAN SOUP is Rs.270/");
						System.out.println();
						sez();
						
						
						
						break;
						
                     case '4':
                    	 showMenu();
                    	 System.out.println();
                    	 
                    	 
//                     default:
//         				System.out.println("Invalid Option!! Please Enter Correct Opton...");
//         				break;
					}
					}	
						
				    while(option != '5');
				    {
					
					}
					
				
			
			case '4':
                System.out.println("DESERTS:");
				System.out.println("1 : STRAWBERRY-ICECREAM   @140/");
				System.out.println("2 : AMERICAN DRYFRUIT     @250/");
				System.out.println("3 : BUTTERSCOTCH          @270/");
				System.out.println("4 : BACK TO MENUCARD    ");
				
				do {
					System.out.println("----------------------------------------");
					System.out.println("****PLEASE SELECT DELICIOUS DESERTES****");
					System.out.println("----------------------------------------");
					System.out.println();
					
					option=scanner.next().charAt(0);
					
					switch(option) 
					{
					
					case '1':
						
						
						System.out.println("The cost of STRAWBERRY-ICECREAM  is Rs.140/");
						System.out.println();
						straw();
						
						
						break;
						
					case '2':	
						
						System.out.println("The cost of AMERICAN DRYFRUIT   is Rs.250/");
						System.out.println();
						dryfruit();
						
						
						break;
						
                     case '3':	
						
						System.out.println("The cost of  BUTTERSCOTCH  is Rs.270/");
						System.out.println();
						butter();
						
						break;
						
                     case '4':
                    	 showMenu();
                    	 System.out.println();
                    	 
//					
//                       default:
//         				System.out.println("Invalid Option!! Please Enter Correct Opton...");
//         				break;
//						
//						
						
					}
					
				  }
				    while(option != '5');
				{
					
				}
				
			case '5':
				  int cost=balance;
				  System.out.println("FINAL BILL: "+cost);
				  System.out.println("Thank You & Visit Again.....!!");
				  break;
			
			}
		}
		while(option != '6');
		      
			
	}
}
	