import java.util.*;
public class A7_3 {

	public static void main(String[] args) {
		String word;
		String reverse = "";
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		word = sc.nextLine();
		
		for(i = word.length() - 1; i >= 0; i--)
			reverse += word.charAt(i);
		
		System.out.println("�빮�ڷ� ��ȯ: " + word.toUpperCase());
		System.out.println("�Ųٷ� ���: " + reverse);
	}

}
