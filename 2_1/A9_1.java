import java.util.*;
public class A9_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int count = 0;
		
		System.out.print("�ܾ� ���ڿ��� �Է��ϼ���>> ");
		s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		String arr[] = s.split(" ");
		
		System.out.println("��� " + st.countTokens() + "���� �ܾ �ֽ��ϴ�.");
		System.out.println("[�и��� ��ū]");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			count++;
		}
		System.out.println("��ū��: " + count);
		
		System.out.println("====== sort ======");
		Arrays.sort(arr);
		for(String i : arr)
			System.out.println(i);
	}

}
