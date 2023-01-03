import java.util.*;
public class A5_4 {

	public static void main(String[] args) {
		int n1, n2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		n1 = sc.nextInt();
		
		A5_4 obj;
		obj = new A5_4();
		n2 = obj.abs(n1);
		
		System.out.print("입력된 정수 " + n1 + "의 절대값은 " + n2 + "입니다.");
	}
	int abs(int num) {
		if(num < 0)
			return -num;
		else
			return num;
	}
	
}
