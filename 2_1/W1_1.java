import java.util.*;
public class W1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int count = 0;
		double sum = 0;
		double avg = 0;
		
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���");
		
		do {
			n = sc.nextInt();
			count++;
			sum += n;
		}while(n != 0);
		avg = sum / (count - 1);
		
		System.out.println("�Է��� ���� ����: " + (count - 1));
		System.out.println("���: " + avg);
	}

}
