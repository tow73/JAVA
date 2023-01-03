import java.util.*;
public class A11_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BankAccount b0 = new BankAccount();
		BankAccount b1 = new BankAccount("소년단", 2000);
		BankAccount b2 = new BankAccount("아이유", 500, 3.25);
		b0.setName("방탄");
		b0.setBalance(100);
		b0.setInterest(3.5);
		b1.setInterest(2.1);

		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());

		System.out.print("계좌" + b0.getAccNo() + "에 입금할 금액을 입력하세요: ");
		if(b0.deposit(sc.nextInt()) == true)
			System.out.println("입금이 성공했습니다.");
		else
			System.out.println("입금이 실패했습니다.");

		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());

		System.out.print("계좌" + b1.getAccNo() + "에서 출금할 금액을 입력하세요: ");
		if(b1.withdraw(sc.nextInt()) == true)
			System.out.println("출금이 성공했습니다.");
		else
			System.out.println("출금이 실패했습니다.");

		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());

		System.out.print("계좌" + b1.getAccNo() + "에서 "
				+ b2.getAccNo() + "으로 송금할 금액을 입력하세요: ");
		if(BankAccount.transfer(b1, b2, sc.nextInt()) == true)
			System.out.println("송금이 성공했습니다.");
		else
			System.out.println("송금이 실패했습니다.");

		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}
}
