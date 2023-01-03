import java.util.*;
public class A5_6 {

	public static void main(String[] args) {
		String name, add;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		name = sc.nextLine();
		System.out.print("주소를 입력하세요: ");
		add = sc.nextLine();
		
		A5_6 obj;
		obj = new A5_6();
		obj.address(name, add);
	}
	void address(String n, String a) {
		System.out.println(n + "의 주소는 " + a + "입니다.");
	}

}
