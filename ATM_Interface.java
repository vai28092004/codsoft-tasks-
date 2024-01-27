package Task3;

import java.util.Scanner;

		
		public class ATM_Interface {

			public static void main(String[] args) {
				System.out.println("Welcome to the ATM!");
				Scanner sc =new Scanner (System.in);
				 System.out.print("Enter your four Digit PIN: ");
			        int enteredPin = sc.nextInt();
			
		        BankAccount userAccount = new BankAccount(10000.0); // Initial balance
		        ATM atm = new ATM(userAccount);
		        atm.run();
		    }
		
		}

	