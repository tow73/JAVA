import java.util.*;
public class A12_2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int arr[] = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		Scanner sc = new Scanner(System.in);
		
		GoodCalc g = new GoodCalc();
		
		System.out.println("���� ���Ϸ��� �� ���� �Է��Ͻÿ�");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("��: " + g.add(num1, num2));
		System.out.println("��: " + g.sub(num1, num2));
		System.out.println("�迭{1,2,3}�� ���: " + g.avg(arr));
	}

}
