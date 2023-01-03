import java.util.*;
public class Account {
	private int accountNumber;
	private String owner;
	private int balance;
	
	public Account(int accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(int b){
		accountNumber += b;
	}
	
	public void withdraw(int b) {
		accountNumber -= b;
	}
	
	public String toString() {
		return owner + ": 현재 잔액은 " + accountNumber + "입니다.";
	}
	
	void transfer(Account A, Account B, int b) {
		B.deposit(b);
		A.withdraw(b);
	}
}