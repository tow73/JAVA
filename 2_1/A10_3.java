import java.util.*;
public class A10_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member m = new Member();
		
		System.out.println("3명의 이름을 입력:");
		for(int i=0; i<3; i++)
			m.TreeSet(sc.nextLine());
		
		m.Print();
	}

}
