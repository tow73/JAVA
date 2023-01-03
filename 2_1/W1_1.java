import java.util.*;
public class W1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int count = 0;
		double sum = 0;
		double avg = 0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
		
		do {
			n = sc.nextInt();
			count++;
			sum += n;
		}while(n != 0);
		avg = sum / (count - 1);
		
		System.out.println("입력한 수의 개수: " + (count - 1));
		System.out.println("평균: " + avg);
	}

}
