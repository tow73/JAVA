
public class BankAccount {
	int balance;

	public void deposit(int p) throws NegativeBalanceException {
		if(p < 0)
			throw new NegativeBalanceException("음수 입금액");
		else {
			balance += p;
			System.out.println("정상 입금 처리=> 입금액: " + p + ", 잔액: " + balance);
		}
	}
	public void withdraw(int p) throws NegativeBalanceException {
		if(p < 0)
			throw new NegativeBalanceException("잘못된 금액");
		if(p > balance)
			throw new NegativeBalanceException("잔고 부족");
		else {
			balance -= p;
			System.out.println("정상 입금 처리=> 인출액: " + p + ", 잔액: " + balance);
		}
	}
}
