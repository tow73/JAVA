import java.util.*;
public class A13_1 {

	public static void main(String[] args) {
		Point a = new Point(2, 3);
		Point aa = a;
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		
		if(a == b)
			System.out.println("a�� b�� �ּҰ� ����.");
		else
			System.out.println("a�� b�� �ּҰ� �ٸ���.");
		
		if(a == aa)
			System.out.println("a�� aa�� �ּҰ� ����.(a==aa)");
		else
			System.out.println("a�� aa�� �ּҰ� �ٸ���.(a!=aa)");
		
		if(a.equals(b) == true)
			System.out.println("a is equal to b");
		else
			System.out.println("a is not equal to b");
		
		if(a.equals(c) == true)
			System.out.println("a is equal to c");
		else
			System.out.println("a is not equal to c");
	}

}
