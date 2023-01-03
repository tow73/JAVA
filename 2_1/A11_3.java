import java.util.*;
public class A11_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> data = new HashMap<String, String>();
		int num;
		String find;
		int flag = 0;
		
		
		System.out.print("입력하려는 데이터의 수는: ");
		num = sc.nextInt();
		
		System.out.println("이름과 전화번호를 입력하세요.(예: 홍길동 010-111-1212)");
		for(int i=0; i<num; i++) {
			System.out.print((i + 1) + ". 이름, 전화번호>> ");
			data.put(sc.next(), sc.next());
		}
		
		System.out.print("전화번호를 찾으려는 회원의 이름은: ");
		find = sc.next();
		for(String key : data.keySet()) {
			if(find.equals(key)) {
				System.out.println(key + "의 전화번호는: " + data.get(key));
				flag = 1;
			}		
		}
		if(flag == 0)
			System.out.println("해당하는 이름의 회원은 리스트에 없습니다.");
	}

}
