import java.util.*;
public class W1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hex;
		char h;
		
		System.out.print("16���� �� ���� �Է�: ");
		hex = sc.next();
		h = hex.charAt(0);
		
		if(h >= 97 && h <= 102) {
			System.out.println("10���� ==> " + (h - 87));
		}
		else {
			System.out.println("16������ �ƴ�");
		}
	}

}
