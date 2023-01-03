import java.util.*;
public class W1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hex;
		char h;
		
		System.out.print("16진수 한 글자 입력: ");
		hex = sc.next();
		h = hex.charAt(0);
		
		if(h >= 97 && h <= 102) {
			System.out.println("10진수 ==> " + (h - 87));
		}
		else {
			System.out.println("16진수가 아님");
		}
	}

}
