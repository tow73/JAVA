import java.util.*;
public class W2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		double sum = 0;
		String name[] = new String[5];
		
		System.out.print("������ �Է��ϼ���: ");
		for(int i : num) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		System.out.println("���� " + sum);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		for(int i = 0; i < name.length; i++)
			name[i] = sc.next();
		for(String n : name) {
			System.out.print(n + " ");
		}
	}

}
