import java.util.*;
public class W2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 10;
		int b = 20;
		int c = 30;
		
		Average avg = new Average();
		
		System.out.println("두 수의 평균: " + avg.getAverage(a, b));
		System.out.println("세 수의 평균: " + avg.getAverage(a, b, c));
	}

}
