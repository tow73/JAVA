import java.util.*;

public class Mile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double mile;
		final double kilo;
		
		System.out.print("������ �Է��Ͻÿ�: ");
		mile = input.nextDouble();
		
		kilo = mile * 1.609;
		
		System.out.print((mile) + "������ " + (kilo) + "ų�ι����Դϴ�.");
	}

}