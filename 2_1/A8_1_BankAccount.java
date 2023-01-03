
public class BankAccount {
	int balance;

	public void deposit(int p) throws NegativeBalanceException {
		if(p < 0)
			throw new NegativeBalanceException("���� �Աݾ�");
		else {
			balance += p;
			System.out.println("���� �Ա� ó��=> �Աݾ�: " + p + ", �ܾ�: " + balance);
		}
	}
	public void withdraw(int p) throws NegativeBalanceException {
		if(p < 0)
			throw new NegativeBalanceException("�߸��� �ݾ�");
		if(p > balance)
			throw new NegativeBalanceException("�ܰ� ����");
		else {
			balance -= p;
			System.out.println("���� �Ա� ó��=> �����: " + p + ", �ܾ�: " + balance);
		}
	}
}
