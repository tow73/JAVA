import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle r;
		
		int width;
		int height;
		
		System.out.print("사각형의 가로를 입력: ");
		width = sc.nextInt();
		System.out.print("사각형의 세로를 입력: ");
		height = sc.nextInt();
		
		r = new Rectangle(width, height);
		r.area();
	}

}
