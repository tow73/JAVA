import java.util.*;
public class P15_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer s;
		int num;
		
		System.out.print("���ڿ��� �Է��Ͻÿ�: ");
		s = new StringTokenizer(sc.nextLine());
		
		num = s.countTokens();
		while(s.hasMoreTokens()) {
			System.out.print(s.nextToken() + ", ");
		}
		System.out.println("\n��� " + num + "���� �ܾ �ֽ��ϴ�");
	}

}
