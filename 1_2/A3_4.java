import java.util.*;
public class A3_4 {

	public static void main(String[] args) {
		int num;
		int i = 0;
		int sum = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���Ϸ��� ������ ���ڸ� �Է��ϼ���: ");
		num = sc.nextInt();
		
		while(i <= num)
		{
			if(i % 3 == 0)
			{
				System.out.print(i + "\t");
				sum += i;
				count++;
				
				if(count % 5 == 0)
					System.out.println();
			}				
			i++;
		}
		System.out.print("\n");
		System.out.println("0���� " + num + "������ 3�� ��� ��: " + sum);
	}

}
