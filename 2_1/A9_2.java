import java.util.*;
public class A9_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		
		while(true) {
			System.out.print("한 줄로 문장을 입력하세요.(종료는 exit를 입력) >> ");
			s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			
			if(s.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
		
			System.out.println("어절 개수는 " + st.countTokens());
			System.out.println("공백의 개수는 " + (st.countTokens() - 1));
		}
	}

}
