import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle r;
		
		int width;
		int height;
		
		System.out.print("�簢���� ���θ� �Է�: ");
		width = sc.nextInt();
		System.out.print("�簢���� ���θ� �Է�: ");
		height = sc.nextInt();
		
		r = new Rectangle(width, height);
		r.area();
	}

}
