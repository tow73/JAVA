import java.util.*;

public class Temperate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double f, c;
		
		System.out.print("È­¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
		f = sc.nextDouble();
		
		c = (f - 32) * 5 / 9;
		
		System.out.println("¼·¾¾¿Âµµ´Â " + c);
	}

}