import java.util.*;
public class A11_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BankAccount b0 = new BankAccount();
		BankAccount b1 = new BankAccount("�ҳ��", 2000);
		BankAccount b2 = new BankAccount("������", 500, 3.25);
		b0.setName("��ź");
		b0.setBalance(100);
		b0.setInterest(3.5);
		b1.setInterest(2.1);

		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());

		System.out.print("����" + b0.getAccNo() + "�� �Ա��� �ݾ��� �Է��ϼ���: ");
		if(b0.deposit(sc.nextInt()) == true)
			System.out.println("�Ա��� �����߽��ϴ�.");
		else
			System.out.println("�Ա��� �����߽��ϴ�.");

		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());

		System.out.print("����" + b1.getAccNo() + "���� ����� �ݾ��� �Է��ϼ���: ");
		if(b1.withdraw(sc.nextInt()) == true)
			System.out.println("����� �����߽��ϴ�.");
		else
			System.out.println("����� �����߽��ϴ�.");

		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());

		System.out.print("����" + b1.getAccNo() + "���� "
				+ b2.getAccNo() + "���� �۱��� �ݾ��� �Է��ϼ���: ");
		if(BankAccount.transfer(b1, b2, sc.nextInt()) == true)
			System.out.println("�۱��� �����߽��ϴ�.");
		else
			System.out.println("�۱��� �����߽��ϴ�.");

		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}
}
