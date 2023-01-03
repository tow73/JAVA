import java.util.*;
public class A7_3 {

	public static void main(String[] args) {
		String word;
		String reverse = "";
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요: ");
		word = sc.nextLine();
		
		for(i = word.length() - 1; i >= 0; i--)
			reverse += word.charAt(i);
		
		System.out.println("대문자로 변환: " + word.toUpperCase());
		System.out.println("거꾸로 출력: " + reverse);
	}

}
