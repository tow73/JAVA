import java.util.*;
public class A11_2 {

	public static void main(String[] args) {
		Bread b1 = new Bread("����", 2000, 3);
		
		System.out.println(b1.toString());
		System.out.println("����: " + b1.getNum());
		
		System.out.println("*************");
		
		Drink d1 = new Drink("�ݶ�", 1500, "small");
		
		System.out.println(d1.toString());
		System.out.println("������: " + d1.getSize());
	}

}
