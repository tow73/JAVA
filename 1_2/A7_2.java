import java.util.*;
public class A7_2 {

	public static void main(String[] args) {
		int dice1;
		int dice2;
		int count = 0;
		
		Dice di1 = new Dice();
		Dice di2 = new Dice();	
		
		do {
			di1.roll();
			di2.roll();
			dice1 = di1.getValue();
			dice2 = di2.getValue();
			System.out.println("�ֻ���1 = " + dice1 + " �ֻ���2 = " + dice2);
			count++;
		}while((dice1 + dice2) != 2);
		
		System.out.println("(1, 1)�� �����µ� �ɸ� Ƚ�� = " + count);
	}

}
