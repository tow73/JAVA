import java.util.*;
public class W2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = null;
		char s;
		String answer;
		
		do {
			System.out.print("����� �ֹι�ȣ�� �Է��ϼ���. (012345-1234567) >>");
			id = sc.next();
			
			s = id.charAt(7);
			if(s == '1' || s == '3')
				System.out.println("����� �����Դϴ�.");
			else if(s == '2' || s == '4')
				System.out.println("����� �����Դϴ�.");
			else
				System.out.println("��ȿ���� ���� �ֹι�ȣ�Դϴ�.");
			
			System.out.print("�Է��� ����ϰڽ��ϱ�? (y/n) ");
			answer  = sc.next();
		}while(!answer.equals("n"));
	}

}
