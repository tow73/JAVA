import java.util.*;
public class A9_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		
		while(true) {
			System.out.print("�� �ٷ� ������ �Է��ϼ���.(����� exit�� �Է�) >> ");
			s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			
			if(s.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
		
			System.out.println("���� ������ " + st.countTokens());
			System.out.println("������ ������ " + (st.countTokens() - 1));
		}
	}

}
