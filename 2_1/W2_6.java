import java.util.*;
public class W2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String tel;
		
		System.out.print("�̸�, ��ȭ��ȣ�� �Է��ϼ���. >> ");
		name = sc.next();
		tel = sc.next();
		Phone p1 = new Phone(name, tel);
		System.out.println(p1.getName() + "�� ��ȭ��ȣ�� " + p1.getTel());
		
		System.out.print("�̸�, ��ȭ��ȣ�� �Է��ϼ���. >> ");
		name = sc.next();
		tel = sc.next();
		Phone p2 = new Phone(name, tel);
		System.out.println(p2.getName() + "�� ��ȭ��ȣ�� " + p2.getTel());
	}

}
