package entities;

public class SavingsAccount extends Account{

	private Double interestRest;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRest) {
		super(number, holder, balance);
		this.interestRest = interestRest;
	}

	public Double getInterestRest() {
		return interestRest;
	}

	public void setInterestRest(Double interestRest) {
		this.interestRest = interestRest;
	}
	
	public void updateBalance() {
		balance	+=  balance * this.interestRest;
	}
}
