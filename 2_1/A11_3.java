import java.util.*;
public class A11_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> data = new HashMap<String, String>();
		int num;
		String find;
		int flag = 0;
		
		
		System.out.print("�Է��Ϸ��� �������� ����: ");
		num = sc.nextInt();
		
		System.out.println("�̸��� ��ȭ��ȣ�� �Է��ϼ���.(��: ȫ�浿 010-111-1212)");
		for(int i=0; i<num; i++) {
			System.out.print((i + 1) + ". �̸�, ��ȭ��ȣ>> ");
			data.put(sc.next(), sc.next());
		}
		
		System.out.print("��ȭ��ȣ�� ã������ ȸ���� �̸���: ");
		find = sc.next();
		for(String key : data.keySet()) {
			if(find.equals(key)) {
				System.out.println(key + "�� ��ȭ��ȣ��: " + data.get(key));
				flag = 1;
			}		
		}
		if(flag == 0)
			System.out.println("�ش��ϴ� �̸��� ȸ���� ����Ʈ�� �����ϴ�.");
	}

}
