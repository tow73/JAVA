import java.util.*;
public class A5_6 {

	public static void main(String[] args) {
		String name, add;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.nextLine();
		System.out.print("�ּҸ� �Է��ϼ���: ");
		add = sc.nextLine();
		
		A5_6 obj;
		obj = new A5_6();
		obj.address(name, add);
	}
	void address(String n, String a) {
		System.out.println(n + "�� �ּҴ� " + a + "�Դϴ�.");
	}

}
