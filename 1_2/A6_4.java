import java.util.*;
public class main {
	String name = "ȫ�浿";
	float height = 163;
	float weight = 48.5f;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		main m = new main();
		Person p;
		
		String name;
		float height;
		float weight;
		
		System.out.print("�̸���? : ");
		name = sc.nextLine();
		System.out.print("Ű��? : ");
		height = sc.nextFloat();
		System.out.print("�����Դ�? : ");
		weight = sc.nextFloat();
		
		p = new Person(name, height, weight);
		System.out.println("�̸�: " + m.name + ", Ű: " + m.height
				+ ", ������: " + m.weight);
		p.print();
	}

}
