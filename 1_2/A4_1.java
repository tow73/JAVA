import java.util.*;
public class A4_1 {

	public static void main(String[] args) {
		int i = (int)(Math.random() * 100);
		int num;
		int count = 1;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �����Ͽ� ���ÿ�: ");
			num = sc.nextInt();
			
			if(num == i)
				System.out.println("�����մϴ�. �õ�Ƚ��=" + count);
			else
				if(num < i)
					System.out.println("LOW");
				else
					System.out.println("HIGH");
				count ++;
		} while(num != i);
	}

}
