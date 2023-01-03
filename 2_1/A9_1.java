import java.util.*;
public class A9_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int count = 0;
		
		System.out.print("단어 문자열을 입력하세요>> ");
		s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		String arr[] = s.split(" ");
		
		System.out.println("모두 " + st.countTokens() + "개의 단어가 있습니다.");
		System.out.println("[분리된 토큰]");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			count++;
		}
		System.out.println("토큰수: " + count);
		
		System.out.println("====== sort ======");
		Arrays.sort(arr);
		for(String i : arr)
			System.out.println(i);
	}

}
