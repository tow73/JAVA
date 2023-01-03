import java.util.*;
public class A4_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int option;
		
		int size = 0;
		String name;
		String phone;
		String[][] members = null;
		
		while(true) {
			System.out.println("--------------------------------------------------");//50
			System.out.println("1.회원수 | 2.정보입력 | 3.회원리스트 | 4.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			option = sc.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.print("회원수> ");
				size = sc.nextInt();
				members = new String[size][2];
				break;
			case 2:
				for(int i = 0; i < size; i++) {
					System.out.print("이름을 입력하세요: ");
					name = sc.next();
					System.out.print("전화번호를 입력하세요: ");
					phone = sc.next();
					members[i][0] = name;
					members[i][1] = phone;
				}
				break;
			case 3:
				System.out.println("** 회원 정보 ** ");
				for(int i = 0; i < size; i++) {
					for(int j = 0; j < 2; j++)
						System.out.print(members[i][j] + " ");
					System.out.println();
				}
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit(1);
			}
		}
	}

}
