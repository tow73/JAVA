import java.util.*;
public class A12_1 {

	public static void main(String[] args) {
		String name;
		String position;
		int id;
		int monthly;
		int hours;
		Scanner sc = new Scanner(System.in);
		
		Employee e0 = new Employee("��", -1);
		SalariedEmployee e1 = new SalariedEmployee("��", -1);
		HourlyEmployee e2 = new HourlyEmployee("��", -1);
		
		System.out.print("�̸���? ");
		e0.setName(sc.next());
		System.out.print("������ȣ��? ");
		e0.setId(sc.nextInt());
		System.out.print("������? ");
		e0.setPosition(sc.next());
		
		System.out.println(e0.toString() + "\n");
		
		System.out.print("�̸���? ");
		e1.setName(sc.next());
		System.out.print("������ȣ��? ");
		e1.setId(sc.nextInt());
		System.out.print("������? ");
		e1.setPosition(sc.next());;
		System.out.print("������? ");
		e1.setMonthly(sc.nextInt());

		System.out.println(e1.toString() + "\n");
		
		System.out.print("�̸���? ");
		e2.setName(sc.next());
		System.out.print("������ȣ��? ");
		e2.setId(sc.nextInt());
		System.out.print("������? ");
		e2.setPosition(sc.next());;
		System.out.print("�ñ���? ");
		e2.setHours(sc.nextInt());
		System.out.print("���� �ð���? ");
		e2.setRate(sc.nextInt());

		System.out.println(e2.toString());
	}

}
