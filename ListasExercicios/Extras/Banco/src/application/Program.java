package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data");
		
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double limit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, limit);
		
		
			System.out.println("Enter amount for withdraw: ");
			account.withdraw(sc.nextDouble());
			
			System.out.println("New balance : " +String.format("%.2f", account.getBalance()));
		} 
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input error: Please enter valid numbers.");
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error occurred.");
		}
		finally {
			sc.close();
		}
	}
}
