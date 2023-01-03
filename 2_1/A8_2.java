import java.util.*;
public class A8_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};

		while(true) {
			try {
				System.out.print("정수를 입력하세요>>");
				n = sc.nextInt();
				if(n <= -1)
					break;
				System.out.println(day[n]);
			}
			catch(InputMismatchException e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
				sc.next();
			}
		}
		System.out.println("프로그램 종료합니다...");
	}

}
