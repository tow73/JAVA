import java.util.*;
public class P15_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer s;
		int num;
		
		System.out.print("문자열을 입력하시오: ");
		s = new StringTokenizer(sc.nextLine());
		
		num = s.countTokens();
		while(s.hasMoreTokens()) {
			System.out.print(s.nextToken() + ", ");
		}
		System.out.println("\n모두 " + num + "개의 단어가 있습니다");
	}

}
