import java.util.*;
public class A10_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Member> set = new HashSet<Member>();
		String find;
		String delete;
		int flag = 0;
		
		set.add(new Member("�̱浿", 30));
		set.add(new Member("ȫ�浿", 30));
		
		Iterator<Member> i1 = set.iterator();
		System.out.println("�� ��ü ��: " + set.size());
		while(i1.hasNext()) {
			Member m = i1.next();
			System.out.println("�̸�: " + m.name + ", ����: " + m.age);
		}
		
		System.out.print("ã�� �̸��� �Է�: ");
		find = sc.next();
		Iterator<Member> i2 = set.iterator();
		while(i2.hasNext()) {
			Member m = i2.next();
			Member copy = new Member(find, m.age);
			if(set.contains(copy)) {
				System.out.println("ã�� �����Ͱ� �ִ�.");
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("ã�� �����Ͱ� ����.");
		
		flag = 0;
		System.out.print("�����Ϸ��� �̸� �Է�: ");
		delete = sc.next();
		Iterator<Member> i3 = set.iterator();
		while(i3.hasNext()) {
			Member m = i3.next();
			Member copy = new Member(delete, m.age);
			if(set.contains(copy)) {
				set.remove(copy);
				System.out.println(delete + " ȸ���� ������");
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("�����Ϸ��� ȸ�� ����");
	}

}
