import java.util.*;
public class A7_1 {

	public static void main(String[] args) {
		int year;
		int month;
		int day;
		
		Scanner sc = new Scanner(System.in);
		Date da;
		
		System.out.print("�¾ �⵵�� �Է��ϼ���: ");
		year = sc.nextInt();
		System.out.print("�¾ ���� �Է��ϼ���: ");
		month = sc.nextInt();
		System.out.print("�¾ ��¥�� �Է��ϼ���: ");
		day = sc.nextInt();
		
		da = new Date(year, month, day);
		da.print();
	}

}
