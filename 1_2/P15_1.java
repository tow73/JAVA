import java.util.StringTokenizer;
public class P15_1 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Will Java change my life?");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st.countTokens());
	}

}
