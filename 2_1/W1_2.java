import java.util.*;
public class W1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		char c;
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		s = sc.next();
		c = s.charAt(0);
		
		while(c != '0') {
			if(c >= 65 && c <= 90) {
				s = s.toLowerCase();
				System.out.println(s.charAt(0));
			}
			else if(c >= 97 && c <= 122) {
				s = s.toUpperCase();
				System.out.println(s.charAt(0));
			}
			else {
				System.out.println("�����ڰ� �ƴմϴ�.");
				System.out.println(s.charAt(0));
			}
			
			System.out.print("���ڸ� �Է��ϼ���: ");
			s = sc.next();
			c = s.charAt(0);
		}
	}

}
