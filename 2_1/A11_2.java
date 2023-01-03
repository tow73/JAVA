import java.util.*;
public class A11_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> country = new HashMap<String, Integer>();
		int max = 0;
		String max_key = "";
		
		System.out.println("나라 이름과 인구 3개를 입력하세요.(예: Korea 5000)");
		for(int i=0; i<3; i++) {
			System.out.print((i + 1) + ". 나라이름, 인구>> ");
			country.put(sc.next(), sc.nextInt());
		}
		
		for(Map.Entry<String, Integer> entry : country.entrySet()) {
			if(max < entry.getValue()) {
				max_key = entry.getKey();
				max = entry.getValue();
			}
		}
		System.out.println("제일 인구가 많은 나라는 (" + max_key + ", " + max + ")");
	}

}
