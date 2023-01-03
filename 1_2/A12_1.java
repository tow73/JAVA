import java.util.*;
public class A12_1 {

	public static void main(String[] args) {
		String name;
		String position;
		int id;
		int monthly;
		int hours;
		Scanner sc = new Scanner(System.in);
		
		Employee e0 = new Employee("모름", -1);
		SalariedEmployee e1 = new SalariedEmployee("모름", -1);
		HourlyEmployee e2 = new HourlyEmployee("모름", -1);
		
		System.out.print("이름은? ");
		e0.setName(sc.next());
		System.out.print("직원번호는? ");
		e0.setId(sc.nextInt());
		System.out.print("직급은? ");
		e0.setPosition(sc.next());
		
		System.out.println(e0.toString() + "\n");
		
		System.out.print("이름은? ");
		e1.setName(sc.next());
		System.out.print("직원번호는? ");
		e1.setId(sc.nextInt());
		System.out.print("직급은? ");
		e1.setPosition(sc.next());;
		System.out.print("월급은? ");
		e1.setMonthly(sc.nextInt());

		System.out.println(e1.toString() + "\n");
		
		System.out.print("이름은? ");
		e2.setName(sc.next());
		System.out.print("직원번호는? ");
		e2.setId(sc.nextInt());
		System.out.print("직급은? ");
		e2.setPosition(sc.next());;
		System.out.print("시급은? ");
		e2.setHours(sc.nextInt());
		System.out.print("일한 시간은? ");
		e2.setRate(sc.nextInt());

		System.out.println(e2.toString());
	}

}
