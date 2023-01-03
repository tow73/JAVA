import java.util.*;
public class A9_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Type t = new Type();
		int i;
		float f;
		
		System.out.print("정수를 입력하세요>> ");
		i = sc.nextInt();
		System.out.print("실수를 입력하세요>> ");
		f = sc.nextFloat();
		
		t.a(i);
		t.a(f);
	}

}
