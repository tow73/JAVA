import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s;
		
		String name = " ";
		int rollno = 0;
		int age = 0;
		
		System.out.print("이름을 입력하시오: ");
		name = sc.nextLine();
		System.out.print("학번을 입력하시오: ");
		rollno = sc.nextInt();
		System.out.print("나이를 입력하시오: ");
		age = sc.nextInt();
		
		s = new Student(name, rollno, age);
		s.print();
	}

}
