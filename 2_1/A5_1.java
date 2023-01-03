import java.util.*;
public class A5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		String op;
		
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		op = sc.next();
		
		if(op.equals("+")) {
			Calc a = new Add();
			a.setValue(n1, n2);
			System.out.println(a.calculate());
		}
		else if(op.equals("-")) {
			Calc s = new Sub();
			s.setValue(n1, n2);
			System.out.println(s.calculate());
		}
		else if(op.equals("*")) {
			Calc m = new Mul();
			m.setValue(n1, n2);
			System.out.println(m.calculate());
		}
		else if(op.equals("/")) {
			Calc d = new Div();
			d.setValue(n1, n2);
			System.out.println(d.calculate());
		}
	}

}
