import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s;
		
		String name = " ";
		int rollno = 0;
		int age = 0;
		
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		name = sc.nextLine();
		System.out.print("�й��� �Է��Ͻÿ�: ");
		rollno = sc.nextInt();
		System.out.print("���̸� �Է��Ͻÿ�: ");
		age = sc.nextInt();
		
		s = new Student(name, rollno, age);
		s.print();
	}

}
