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
		return owner + ": ���� �ܾ��� " + accountNumber + "�Դϴ�.";
	}
	
	void transfer(Account A, Account B, int b) {
		B.deposit(b);
		A.withdraw(b);
	}
}