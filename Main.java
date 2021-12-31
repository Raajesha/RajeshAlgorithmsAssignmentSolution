package Stockers;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {     
			System.out.println("Enter the number of Companies");
			Scanner sc = new Scanner(System.in);
					int size = sc.nextInt();
			System.out.println("Enter the current stock price of the company");
			
			int array[] = new int[size];
			for (int i = 0; i < size; i++) {
				array[i] = sc.nextInt();
			}
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			System.out.println( "True");  
			
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			
			int option = sc.nextInt();
			
			switch(option) {
			case 1: 
				System.out.println("companies stock prices in ascending order");
				
				    break;
			case 2:
			    System.out.println("companies stock prices in descending order");
			    break;
			  case 3:
			    System.out.println("total no of companies for which stock prices rose today");
			    break;
			  case 4:
			    System.out.println("total no of companies for which stock prices declined today");
			    break;
			  case 5:
			    System.out.println("Search a specific stock price");
			    break;
			  case 6:
				  System.out.println("Exited successfully");
				  
				  System.exit(0); 
			    return;
	
			} 
			
		}
			
	}
	


