
public class Student {
	String name;
	int rollno;
	int age;
	
	public Student(String n, int r, int a) {
		name = n;
		rollno = r;
		age = a;
	}
	
	void print() {
		System.out.println("�̸�: " + name);
		System.out.println("�й�: " + rollno);
		System.out.println("����: " + age);
	}
}
