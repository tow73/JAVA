import java.util.*;
public class A3_3 {

	public static void main(String[] args) {
		int n1, n2, n3;
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���: ");
		n1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���: ");
		n2 = sc.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ���: ");
		n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3)
			max = n1;
		else if(n2 > n1 && n2 > n3)
			max = n2;
		else if(n3 > n1 && n3 > n2)
			max = n3;
		
		System.out.println("���� ū ���ڴ� " + max +"�Դϴ�.");
	}

}
