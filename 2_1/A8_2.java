import java.util.*;
public class A8_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		String[] day = {"��", "��", "ȭ", "��", "��", "��", "��"};

		while(true) {
			try {
				System.out.print("������ �Է��ϼ���>>");
				n = sc.nextInt();
				if(n <= -1)
					break;
				System.out.println(day[n]);
			}
			catch(InputMismatchException e) {
				System.out.println("���! ���� �Է����� �ʾҽ��ϴ�.");
				sc.next();
			}
		}
		System.out.println("���α׷� �����մϴ�...");
	}

}
