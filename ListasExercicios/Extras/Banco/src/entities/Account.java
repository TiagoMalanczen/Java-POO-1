package entities;

import model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrayLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrayLimit) {
		super();
		if(balance < 0 || number < 0) {
			throw new DomainException("Deposit/Withdraw error: Amount must be greater than zero");
		}
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrayLimit = withdrayLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrayLimit() {
		return withdrayLimit;
	}
	
	public void deposit(Double amount) {
		if(amount < 0) {
			throw new DomainException("Deposit/Withdraw error: Amount must be greater than zero");
		}
		this.balance += amount;
		
	}
	public void withdraw(Double amount) {
		if(this.withdrayLimit < amount) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		if(this.balance < amount) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		if(amount < 0) {
			throw new DomainException("Deposit/Withdraw error: Amount must be greater than zero");
		}
		
		this.balance -= amount;
	}
	
}
