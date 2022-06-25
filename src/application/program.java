package application;

import java.util.Locale;
import java.util.Scanner;

import entities.account;
import exception.domainException;

public class program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Enter account number: ");
			int number = sc.nextInt();
			System.out.print("Enter account holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
	
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			account x = new account(number, holder, balance, withdrawLimit);
	
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			x.whitdraw(sc.nextDouble());
			System.out.println(x.toString());
		}
		catch (domainException e) {
			System.out.println("Error: \n" +e.getMessage());	
		}
		sc.close();
	}

}
