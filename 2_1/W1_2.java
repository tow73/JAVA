import java.util.*;
public class W1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		char c;
		
		System.out.print("문자를 입력하세요: ");
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
				System.out.println("영문자가 아닙니다.");
				System.out.println(s.charAt(0));
			}
			
			System.out.print("문자를 입력하세요: ");
			s = sc.next();
			c = s.charAt(0);
		}
	}

}
