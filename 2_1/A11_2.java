import java.util.*;
public class A11_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> country = new HashMap<String, Integer>();
		int max = 0;
		String max_key = "";
		
		System.out.println("���� �̸��� �α� 3���� �Է��ϼ���.(��: Korea 5000)");
		for(int i=0; i<3; i++) {
			System.out.print((i + 1) + ". �����̸�, �α�>> ");
			country.put(sc.next(), sc.nextInt());
		}
		
		for(Map.Entry<String, Integer> entry : country.entrySet()) {
			if(max < entry.getValue()) {
				max_key = entry.getKey();
				max = entry.getValue();
			}
		}
		System.out.println("���� �α��� ���� ����� (" + max_key + ", " + max + ")");
	}

}
