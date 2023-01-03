import java.util.*;
public class A4_3 {

	public static void main(String[] args) {
		String alpha;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요: ");
		alpha = sc.next();
		while(true)
		{
			if(alpha.equals("quit"))
			{
				System.out.println("프로그램 종료!");
				break;
			}
			else
			{
				switch(alpha) {
				case "a": case "e": case "i": case "o": case "u":
					System.out.println("모음입니다.");
					break;
				case "A": case "E": case "I": case "O": case "U":
					System.out.println("모음입니다.");
					break;
				default:
					System.out.println("자음입니다.");
				}
			}
			System.out.print("문자를 입력하세요: ");
			alpha = sc.next();
		}
	}

}
