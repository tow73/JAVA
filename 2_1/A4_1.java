import java.util.*;
public class A4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int id;
		String name;
		
		System.out.print("�迭�� ũ���>>");
		num = sc.nextInt();
		Profile[] p = new Profile[num];
		
		for(int i = 0; i < p.length; i++) {
			System.out.print("�й�>>");
			id = sc.nextInt();
			System.out.print("�̸�>>");
			name = sc.next();
			p[i] = new Profile(id, name); 
			}
		
		Arrays.sort(p);
		for(Profile pro:p)
			System.out.println("�й�= " + pro.getId() + ", �̸�= " + pro.getName());
	}

}
