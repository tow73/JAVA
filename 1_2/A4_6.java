import java.util.*;
public class A4_6 {

	public static void main(String[] args) {
		int size;
		int[] score;
		int sum = 0;
		double avg = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력받는 학생의 수는? : ");
		size = sc.nextInt();
		score = new int[size];
		for(int i = 0; i < score.length; i++)
		{
			System.out.print((i + 1) + "번째 학생의 성적을 입력하세요: ");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		avg = sum / score.length;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}

}
