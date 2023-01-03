import java.util.*;
public class W2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String tel;
		
		System.out.print("이름, 전화번호를 입력하세요. >> ");
		name = sc.next();
		tel = sc.next();
		Phone p1 = new Phone(name, tel);
		System.out.println(p1.getName() + "의 전화번호는 " + p1.getTel());
		
		System.out.print("이름, 전화번호를 입력하세요. >> ");
		name = sc.next();
		tel = sc.next();
		Phone p2 = new Phone(name, tel);
		System.out.println(p2.getName() + "의 전화번호는 " + p2.getTel());
	}

}
