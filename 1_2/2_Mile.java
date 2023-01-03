import java.util.*;

public class Mile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double mile;
		final double kilo;
		
		System.out.print("마일을 입력하시오: ");
		mile = input.nextDouble();
		
		kilo = mile * 1.609;
		
		System.out.print((mile) + "마일은 " + (kilo) + "킬로미터입니다.");
	}

}