import java.util.*;
public class A10_1 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student("홍길동",1,100,100,100));
		list.add(new Student("송중기",2,90,60,80));
		list.add(new Student("김자바",3,70,80,75));
		list.add(new Student("이자바",4,80,75,90));
		list.add(new Student("안자바",5,90,60,100));
		
		Collections.sort(list);
		
		Iterator<Student> i = list.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println(s.toString());
		}
	}

}
