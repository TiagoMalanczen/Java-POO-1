package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		
		Account acc1 = new SavingsAccount(1002, "Maria" , 1000.00, 0.1);
		Account acc2 = new BusinessAccount(1003, "Marcos" , 1000.00, 500.0);

		list.add(acc1);
		list.add(acc2);
		
		double sum = 0.0;
		
		for(Account ac : list) {
			sum += ac.getBalance();
		}
		System.out.println(sum);
		
		for(Account ac : list) {
			ac.deposit(10);
		}
		System.out.println("Atualizado");
		for(Account ac : list) {
			System.out.println(ac.getBalance());
		}
		

	}
	
}
