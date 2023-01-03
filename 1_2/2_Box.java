import java.util.*;

public class Box {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, box, rest;
		
		System.out.print("오렌지의 개수를 입력하시오: ");
		x = input.nextInt();
		
		box = x / 10;
		rest = x % 10;
		
		System.out.println((box) + "박스가 필요하고" + (rest) + "개가 남습니다.");
	}

}