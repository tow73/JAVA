import java.util.*;
public class A9_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyMath<Number> m = new MyMath<>();
		Number[] num = {1,2,3,4,5,6};
		
		System.out.println("¹è¿­ " + Arrays.toString(num) + "ÀÇ Æò±Õ: " + m.getAverage(num));
	}

}
