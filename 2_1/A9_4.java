import java.util.*;
public class A9_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Type t = new Type();
		int i;
		float f;
		
		System.out.print("������ �Է��ϼ���>> ");
		i = sc.nextInt();
		System.out.print("�Ǽ��� �Է��ϼ���>> ");
		f = sc.nextFloat();
		
		t.a(i);
		t.a(f);
	}

}
