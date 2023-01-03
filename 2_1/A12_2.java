import java.util.*;
import java.io.*;
public class A12_2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter info = null;
		String num;
		String name;
		String phone;
		String mail;
		int flag = 1;
		String find;
		Scanner scan;
		
		try{				
			info = new PrintWriter(new FileWriter("C:\\result.txt"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		do {
			System.out.print("����� ��ȣ�� �Է��ϼ���>> ");
			num = sc.next();
			System.out.print("����� �̸��� �Է��ϼ���>> ");
			name = sc.next();
			System.out.print("����� ��ȭ��ȣ�� �Է��ϼ���>> ");
			phone = sc.next();
			System.out.print("����� �̸����� �Է��ϼ���>> ");
			mail = sc.next();
			System.out.print("�Է��� �������� 0, ��� �Է��Ϸ��� 1�� �Է��ϼ���>> ");
			flag = sc.nextInt();
			
			info.print(num + "," + name + "," + phone + "," + mail + "\n");
			info.flush();
		}while(flag != 0);
		
		System.out.print("�˻��� ����� ��ȣ�� �Է��ϼ���>> ");
		find = sc.next().trim();
		try {
			scan = new Scanner(new File("C:\\result.txt")).useDelimiter(",");
			
			while(scan.hasNext()) {
				num = scan.next();
				
				if(find.equals(num)) {
					name = scan.next();
					phone = scan.next();
					mail = scan.next();
					flag = 1;
					
					System.out.println("����� ��ȣ " + num + "�� ��ȭ��ȣ�� " + phone + "�Դϴ�.");
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		if(flag == 0)
			System.out.println("�˻��� ����� ��ȣ�� �����ϴ�.");
		info.close();
	}

}
