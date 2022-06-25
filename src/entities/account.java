package entities;

import exception.domainException;

public class account {

	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;

	public account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		deposito(balance);
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposito(double amount) {
		balance += amount;
	}

	public void whitdraw(double amount) {
		if (amount > withdrawLimit) {
			throw new domainException("Withdraw error: The amount exceeds withdraw limit");
		}
		else if (amount > balance){
			throw new domainException("Withdraw error: Not enough balance");
		}
		else { 
		balance -= amount;
		}
	}



	public String toString() {
		return "New balance: " + balance;
	}

}
