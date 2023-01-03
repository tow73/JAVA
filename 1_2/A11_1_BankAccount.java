import java.util.*;
public class BankAccount {
	private String name;
	private String accNo = ((int)(Math.random() * 9000 + 1000) + "-" + 
			(int)(Math.random() * 9000 + 1000));
	private int balance;
	private double interest;

	public BankAccount() {

	};
	public BankAccount(String name, int balance) {
		this.name = name;
		this.balance = balance;
	};
	public BankAccount(String name, int balance, double interest) {
		this.name = name;
		this.balance = balance;
		this.interest = interest;
	};

	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
	public void setBalance(int balance) { this.balance = balance; }
	public Integer getBalance() { return balance; }
	public void setInterest(double interest) { this.interest = interest; }
	public Double getInterest() { return interest; }

	public void setAccNo(String accNo) { this.accNo = accNo; }
	public String getAccNo() { return accNo; }

	public boolean deposit(int money) {
		if(money >= 0) {
			balance += money;
			return true;
		}
		else
			return false;
	}
	public boolean withdraw(int money) {
		if(balance >= money) {
			balance -= money;
			return true;
		}
		else
			return false;
	}
	public static boolean transfer(BankAccount from, BankAccount to, int money) {
		if(from.withdraw(money) == true && to.deposit(money) == true)
			return true;
		else {
			to.withdraw(money);
			return false;
		}		
	}
	public String toString() {
		return getAccNo() + " :: " + name + " :: " + balance + 
				" :: " + interest + "%";
	}
}
