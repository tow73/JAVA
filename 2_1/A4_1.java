import java.util.*;
public class A4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int id;
		String name;
		
		System.out.print("배열의 크기는>>");
		num = sc.nextInt();
		Profile[] p = new Profile[num];
		
		for(int i = 0; i < p.length; i++) {
			System.out.print("학번>>");
			id = sc.nextInt();
			System.out.print("이름>>");
			name = sc.next();
			p[i] = new Profile(id, name); 
			}
		
		Arrays.sort(p);
		for(Profile pro:p)
			System.out.println("학번= " + pro.getId() + ", 이름= " + pro.getName());
	}

}
