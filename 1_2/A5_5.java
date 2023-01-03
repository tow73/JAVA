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
		
		System.out.println("학생의 이름: " + n);
		System.out.println("학생의 학번: " + r);
		System.out.println("학생의 나이: " + a);
	}

}
