import java.util.*;
public class W1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n500;
		int n100;
		int n50;
		int n10;
		int money = 0;
		
		System.out.print("500�� ���� ����: ");
		n500 = sc.nextInt();
		System.out.print("100�� ���� ����: ");
		n100 = sc.nextInt();
		System.out.print("50�� ���� ����: ");
		n50 = sc.nextInt();
		System.out.print("10�� ���� ����: ");
		n10 = sc.nextInt();
		money = n500 * 500 + n100 * 100 + n50 * 50 + n10 * 10;
		
		System.out.println("�ݾ��� " + money + "�� �Դϴ�.");
	}

}
