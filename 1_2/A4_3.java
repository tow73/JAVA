import java.util.*;
public class A4_3 {

	public static void main(String[] args) {
		String alpha;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		alpha = sc.next();
		while(true)
		{
			if(alpha.equals("quit"))
			{
				System.out.println("���α׷� ����!");
				break;
			}
			else
			{
				switch(alpha) {
				case "a": case "e": case "i": case "o": case "u":
					System.out.println("�����Դϴ�.");
					break;
				case "A": case "E": case "I": case "O": case "U":
					System.out.println("�����Դϴ�.");
					break;
				default:
					System.out.println("�����Դϴ�.");
				}
			}
			System.out.print("���ڸ� �Է��ϼ���: ");
			alpha = sc.next();
		}
	}

}
