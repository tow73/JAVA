import java.util.*;
public class main {
	String name = "홍길동";
	float height = 163;
	float weight = 48.5f;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		main m = new main();
		Person p;
		
		String name;
		float height;
		float weight;
		
		System.out.print("이름은? : ");
		name = sc.nextLine();
		System.out.print("키는? : ");
		height = sc.nextFloat();
		System.out.print("몸무게는? : ");
		weight = sc.nextFloat();
		
		p = new Person(name, height, weight);
		System.out.println("이름: " + m.name + ", 키: " + m.height
				+ ", 몸무게: " + m.weight);
		p.print();
	}

}
