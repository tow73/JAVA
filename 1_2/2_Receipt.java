import java.util.*;

public class Receipt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int money, price, surtax, change;
		
		System.out.print("���� ��: ");
		money = input.nextInt();
		System.out.print("��ǰ ����: ");
		price = input.nextInt();
		
		surtax = price / 10;
		change = money - price;
		
		System.out.println("�ΰ���: " + (surtax));
		System.out.println("�ܵ�: " + (change));
	}

}