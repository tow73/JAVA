import java.util.*;

public class Temperate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double f, c;
		
		System.out.print("ȭ���µ��� �Է��Ͻÿ�: ");
		f = sc.nextDouble();
		
		c = (f - 32) * 5 / 9;
		
		System.out.println("�����µ��� " + c);
	}

}