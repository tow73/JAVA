import java.util.*;
public class A5_3 {

	public static void main(String[] args) {
		int n1, n2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		n1 = sc.nextInt();
		System.out.print("정수를 입력하세요: ");
		n2 = sc.nextInt();
		
		A5_3 obj;
		obj = new A5_3();
		obj.sum(n1, n2);
	}
	void sum(int m1, int m2) {
		int sum;
		sum = m1 + m2;
		System.out.print(m1 + " + " + m2 + " = " + sum);
	}

}
