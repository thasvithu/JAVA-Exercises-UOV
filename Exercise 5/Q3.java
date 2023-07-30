/*
3) TO Create an abstarct class BankAccount with abstarct methods deposit() and withdrawl(). 
crete asub classes SavingAccount, CurrentAccount that extend the BankAccount Class and implement the respective methods to handle deposits and withdrals for each account type.
*/

import java.util.Scanner;

abstract class BankAccount {
	double depositAmount, withdrawAmount, balance = 0;
	
	abstract void deposit();
	abstract void withdraw();
}

class SavingAccount extends BankAccount {
	@Override
	void deposit() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the amount to deposit in Saving Account: ");
		depositAmount = sc.nextDouble();
		
		balance += depositAmount;
		
		System.out.print("Deposit Success");
	}
	
	@Override
	void withdraw() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the amount to withdraw from Saving Account: ");
		withdrawAmount = sc.nextDouble();
		
		if (withdrawAmount > balance) {
			balance = balance - withdrawAmount;
			System.out.print("Withdraw Successfull. \nCurrent Balance : " + balance);
		}
		else {
			System.out.print("Insufficient Balance!");
		}
	}
}

class CurrentAccount extends BankAccount {
	@Override
	void deposit() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the amount to deposit in Current Account: ");
		depositAmount = sc.nextDouble();
		
		balance += depositAmount;
		
		System.out.print("Deposit Success");
	}
	
	@Override
	void withdraw() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the amount to withdraw from Current Account: ");
		withdrawAmount = sc.nextDouble();
		
		if (withdrawAmount > balance) {
			balance = balance - withdrawAmount;
			System.out.print("Withdraw Successfull. \nCurrent Balance : " + balance);
		}
		else {
			System.out.print("Insufficient Balance!");
		}
	}
}

class Q3 {
	static void accType() {
		System.out.println("1 - Saving Account");
		System.out.println("2 - Current Account");
		System.out.print("Select Your Account Type : ");
	}
	
	static void savingType() {
		System.out.println("\n1 - Deposit");
		System.out.println("2 - Withdraw");
		System.out.println("3 - Balance");
		System.out.print("Select the method : ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SavingAccount sv = new SavingAccount();
		CurrentAccount ca = new CurrentAccount();
		
		char reRun;
		
		do {
			accType();	// call the account type method
			int selct = sc.nextInt();
		
			switch(selct) {
				case 1:
					savingType();
					selct = sc.nextInt();
					
					if (selct == 1)
						sv.deposit();
					else if (selct == 2)
						sv.withdraw();
					else if (selct == 3)
						System.out.println("\nAvailable Balance is : " + sv.balance);
					else	
						System.out.println("Invalid Selection!");
					break;
				case 2:
					savingType();
					selct = sc.nextInt();
					
					if (selct == 1)
						ca.deposit();
					else if (selct == 2)
						ca.withdraw();
					else if (selct == 3)
						System.out.println("\nAvailable Balance is : " + ca.balance);
					else	
						System.out.println("Invalid Selection!");
					break;
				default:
					System.out.println("Invalid Selection Please Try Again!");
					break;
			}
			
			System.out.println("\n\nDo you want to run again (Y|N) : ");
			reRun = sc.next().charAt(0);
		}while (reRun == 'y' || reRun == 'Y');
		System.out.println("\nThank you for using our bank services :)");
	}
}