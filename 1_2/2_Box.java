import java.util.*;

public class Box {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, box, rest;
		
		System.out.print("�������� ������ �Է��Ͻÿ�: ");
		x = input.nextInt();
		
		box = x / 10;
		rest = x % 10;
		
		System.out.println((box) + "�ڽ��� �ʿ��ϰ�" + (rest) + "���� �����ϴ�.");
	}

}