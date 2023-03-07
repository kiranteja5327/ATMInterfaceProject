package in.teja.bank;

import java.util.Scanner;

public class TransactionProcess
{

	public boolean doTransaction(String CustomerId, int pin)
		{
			if("Teja_147".equals(CustomerId))
			{
				AccountHolder cc=new AccountHolder();
				return cc.customer(pin);
				
			}
			else
			{
				return false;
			}
			
		}

}

