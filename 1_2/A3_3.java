import java.util.*;
public class A3_3 {

	public static void main(String[] args) {
		int n1, n2, n3;
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: ");
		n1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		n2 = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요: ");
		n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3)
			max = n1;
		else if(n2 > n1 && n2 > n3)
			max = n2;
		else if(n3 > n1 && n3 > n2)
			max = n3;
		
		System.out.println("가장 큰 숫자는 " + max +"입니다.");
	}

}
