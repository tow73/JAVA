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
			System.out.print("사용자 번호를 입력하세요>> ");
			num = sc.next();
			System.out.print("사용자 이름을 입력하세요>> ");
			name = sc.next();
			System.out.print("사용자 전화번호를 입력하세요>> ");
			phone = sc.next();
			System.out.print("사용자 이메일을 입력하세요>> ");
			mail = sc.next();
			System.out.print("입력이 끝났으면 0, 계속 입력하려면 1을 입력하세요>> ");
			flag = sc.nextInt();
			
			info.print(num + "," + name + "," + phone + "," + mail + "\n");
			info.flush();
		}while(flag != 0);
		
		System.out.print("검색할 사용자 번호를 입력하세요>> ");
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
					
					System.out.println("사용자 번호 " + num + "의 전화번호는 " + phone + "입니다.");
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		if(flag == 0)
			System.out.println("검색한 사용자 번호가 없습니다.");
		info.close();
	}

}
