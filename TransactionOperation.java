package com.fix;

import java.util.Scanner;

public class TransactionOperation
{
    public static void customerinfo() 
	{
		try (Scanner scan = new Scanner(System.in)) {
            System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(" ***Bank System Application***");
            System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Press any key to move forward:- 1. Create a new account  \n 2. Check Balance\n 3. Deposit the amount \n 4. Withdraw the amount  \n 5. Watch demo account \n 6. Exit  \n\nENTER YOUR CHOISE :: "); 
            int key=scan.nextInt();
            operation(key);
        }	   
	}
	public static void operation(int key)
	{
		try (Scanner scan = new Scanner(System.in)) {
            process bankprocess = new process();
            switch (key) 
            {
            	case 1:
            		System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            		bankprocess.openAccount();
            		System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            		System.out.println();
            		System.out.println("FOR MAIN PAGE:: PRESS 1 ::");
            		if (scan.nextInt()==1) 
            			customerinfo();
            		break;
            	case 2:
            		System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            		bankprocess.checkbalance();
            		System.out.println();
            		System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            		System.out.println("FOR MAIN PAGE:: PRESS 1 ::");
            		if (scan.nextInt()==1) 
            			customerinfo();
            		break;
            	case 3:
            		System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            		System.out.println();
            		System.out.println("---------WELCOME TO DEPOSIT MONEY PAGE---------------- ");
            		bankprocess.deposite();
            		System.out.println();
            		System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            		System.out.println("FOR MAIN PAGE:: PRESS 1 ::");
            		if (scan.nextInt()==1) 
            			customerinfo();
            		break;
            	case 4:
            		System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            		bankprocess.withdraw();
            		System.out.println();
            		System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            		System.out.println("FOR MAIN PAGE:: PRESS 1 ::");
            		if (scan.nextInt()==1) 
            			customerinfo();
            		break;
            	case 5:
            		System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            		bankprocess.demoaccount();
            		System.out.println();
            	    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            		System.out.println(" FOR MAIN PAGE:: PRESS 1 ::");
            		if (scan.nextInt()==1) 
            			customerinfo();
            		break;
            	case 6:
            		System.out.println("THANKS FOR USING OUR BANK APPLICATION, HAVE A NICE DAY");
            			break;
            }
        }
	}
}