import java.util.*;
public class P15_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer s;
		
		do {
			System.out.println("������ �Է��ϼ���.(�ܾ�� ,�� �����Ͽ� �Է�): ");
			s = new StringTokenizer(sc.nextLine(), ",");
			System.out.println("���� ������ " + s.countTokens());
		} while(!s.nextToken().equals("quit"));
	}

}
