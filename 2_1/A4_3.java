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
			System.out.println("1.ȸ���� | 2.�����Է� | 3.ȸ������Ʈ | 4.����");
			System.out.println("--------------------------------------------------");
			System.out.print("����> ");
			option = sc.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.print("ȸ����> ");
				size = sc.nextInt();
				members = new String[size][2];
				break;
			case 2:
				for(int i = 0; i < size; i++) {
					System.out.print("�̸��� �Է��ϼ���: ");
					name = sc.next();
					System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
					phone = sc.next();
					members[i][0] = name;
					members[i][1] = phone;
				}
				break;
			case 3:
				System.out.println("** ȸ�� ���� ** ");
				for(int i = 0; i < size; i++) {
					for(int j = 0; j < 2; j++)
						System.out.print(members[i][j] + " ");
					System.out.println();
				}
				break;
			case 4:
				System.out.println("���α׷� ����");
				System.exit(1);
			}
		}
	}

}
