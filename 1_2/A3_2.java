import java.util.*;
public class A3_2 {

	public static void main(String[] args) {
		String a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, ���߿��� �Է��ϼ���");
		System.out.print("User A >>> ");
		a = sc.next();
		System.out.print("User B >>> ");
		b = sc.next();
		
		if(a.equals("����") && b.equals("����"))
			System.out.println("�����ϴ�.");
		else if(a.equals("����") && b.equals("����"))
			System.out.println("�����ϴ�.");
		else if(a.equals("��") && b.equals("��"))
			System.out.println("�����ϴ�.");
		else if(a.equals("����") && b.equals("����"))
			System.out.println("B�� �̰���ϴ�.");
		else if(a.equals("����") && b.equals("��"))
			System.out.println("A�� �̰���ϴ�.");
		else if(a.equals("����") && b.equals("����"))
			System.out.println("A�� �̰���ϴ�.");
		else if(a.equals("����") && b.equals("��"))
			System.out.println("B�� �̰���ϴ�.");
		else if(a.equals("��") && b.equals("����"))
			System.out.println("B�� �̰���ϴ�.");
		else if(a.equals("��") && b.equals("����"))
			System.out.println("A�� �̰���ϴ�.");
	}

}
