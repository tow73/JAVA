import java.util.*;
public class A5_4 {

	public static void main(String[] args) {
		int n1, n2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		n1 = sc.nextInt();
		
		A5_4 obj;
		obj = new A5_4();
		n2 = obj.abs(n1);
		
		System.out.print("�Էµ� ���� " + n1 + "�� ���밪�� " + n2 + "�Դϴ�.");
	}
	int abs(int num) {
		if(num < 0)
			return -num;
		else
			return num;
	}
	
}
