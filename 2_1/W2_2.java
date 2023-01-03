import java.util.*;
public class W2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = null;
		char s;
		String answer;
		
		do {
			System.out.print("당신의 주민번호를 입력하세요. (012345-1234567) >>");
			id = sc.next();
			
			s = id.charAt(7);
			if(s == '1' || s == '3')
				System.out.println("당신은 남자입니다.");
			else if(s == '2' || s == '4')
				System.out.println("당신은 여자입니다.");
			else
				System.out.println("유효하지 않은 주민번호입니다.");
			
			System.out.print("입력을 계속하겠습니까? (y/n) ");
			answer  = sc.next();
		}while(!answer.equals("n"));
	}

}
