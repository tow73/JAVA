import java.util.*;
public class A5_5 {

	public static void main(String[] args) {
		String n;
		int r, a;
		Student obj;
		obj = new Student();
		n = obj.name = "Kim";
		r = obj.rollno = 20180001;
		a = obj.age = 20;
		
		System.out.println("�л��� �̸�: " + n);
		System.out.println("�л��� �й�: " + r);
		System.out.println("�л��� ����: " + a);
	}

}
