import java.util.*;
public class A10_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member m = new Member();
		
		System.out.println("3���� �̸��� �Է�:");
		for(int i=0; i<3; i++)
			m.TreeSet(sc.nextLine());
		
		m.Print();
	}

}
