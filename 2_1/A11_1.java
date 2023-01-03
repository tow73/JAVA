import java.util.*;
public class A11_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> word = new HashMap<String, String>();
		String enter;
		int flag = 1;
		
		word.put("java", "자바");
		word.put("school", "학교");
		word.put("map", "지도");
		
		System.out.println("*** keySet() ***");
		for(String key : word.keySet())
			System.out.println("단어: " + key + ", 의미: " + word.get(key));
		System.out.println("*** entrySet() ***");
		for(Map.Entry<String, String> entry : word.entrySet())
			System.out.println("(" + entry.getKey() + ", " + entry.getValue() + ")");
		
		System.out.println("\n");
		do {
			if(flag == 0)
				System.out.println("찾는 단어가 없습니다.");
			
			System.out.print("찾고 싶은 단어: ");
			enter = sc.next();
			
			flag = 0;
			for(String key : word.keySet()) {
				if(enter.equals(key)) {
					System.out.println("단어의 의미는 " + word.get(key));
					flag = 1;
				}	
			}
		}while(!enter.equals("quit"));
		System.out.println("프로그램 종료");
	}

}
