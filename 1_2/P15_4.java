import java.util.*;
public class P15_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer s;
		
		do {
			System.out.println("문장을 입력하세요.(단어는 ,로 구분하여 입력): ");
			s = new StringTokenizer(sc.nextLine(), ",");
			System.out.println("어절 개수는 " + s.countTokens());
		} while(!s.nextToken().equals("quit"));
	}

}
