import java.util.*;
public class A11_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> word = new HashMap<String, String>();
		String enter;
		int flag = 1;
		
		word.put("java", "�ڹ�");
		word.put("school", "�б�");
		word.put("map", "����");
		
		System.out.println("*** keySet() ***");
		for(String key : word.keySet())
			System.out.println("�ܾ�: " + key + ", �ǹ�: " + word.get(key));
		System.out.println("*** entrySet() ***");
		for(Map.Entry<String, String> entry : word.entrySet())
			System.out.println("(" + entry.getKey() + ", " + entry.getValue() + ")");
		
		System.out.println("\n");
		do {
			if(flag == 0)
				System.out.println("ã�� �ܾ �����ϴ�.");
			
			System.out.print("ã�� ���� �ܾ�: ");
			enter = sc.next();
			
			flag = 0;
			for(String key : word.keySet()) {
				if(enter.equals(key)) {
					System.out.println("�ܾ��� �ǹ̴� " + word.get(key));
					flag = 1;
				}	
			}
		}while(!enter.equals("quit"));
		System.out.println("���α׷� ����");
	}

}
