import java.util.*;
public class A4_6 {

	public static void main(String[] args) {
		int size;
		int[] score;
		int sum = 0;
		double avg = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է¹޴� �л��� ����? : ");
		size = sc.nextInt();
		score = new int[size];
		for(int i = 0; i < score.length; i++)
		{
			System.out.print((i + 1) + "��° �л��� ������ �Է��ϼ���: ");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		avg = sum / score.length;
		System.out.println("�հ�: " + sum);
		System.out.println("���: " + avg);
	}

}
