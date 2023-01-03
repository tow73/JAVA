import java.util.*;
public class W2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i <num.length; i++) {
			num[i] = (int)(Math.random() * 99 + 1);
			sum += num[i];
		}
		avg = sum / 100;
		
		System.out.println("random() 으로 발생한 수: ");
		for(int i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i]);
			
			if((i + 1) % 10 == 0)
				System.out.println();
		}
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}

}
