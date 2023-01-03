import java.util.*;
public class A10_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Member> set = new HashSet<Member>();
		String find;
		String delete;
		int flag = 0;
		
		set.add(new Member("이길동", 30));
		set.add(new Member("홍길동", 30));
		
		Iterator<Member> i1 = set.iterator();
		System.out.println("총 객체 수: " + set.size());
		while(i1.hasNext()) {
			Member m = i1.next();
			System.out.println("이름: " + m.name + ", 나이: " + m.age);
		}
		
		System.out.print("찾는 이름을 입력: ");
		find = sc.next();
		Iterator<Member> i2 = set.iterator();
		while(i2.hasNext()) {
			Member m = i2.next();
			Member copy = new Member(find, m.age);
			if(set.contains(copy)) {
				System.out.println("찾는 데이터가 있다.");
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("찾는 데이터가 없다.");
		
		flag = 0;
		System.out.print("삭제하려는 이름 입력: ");
		delete = sc.next();
		Iterator<Member> i3 = set.iterator();
		while(i3.hasNext()) {
			Member m = i3.next();
			Member copy = new Member(delete, m.age);
			if(set.contains(copy)) {
				set.remove(copy);
				System.out.println(delete + " 회원이 삭제됨");
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("삭제하려는 회원 없음");
	}

}
