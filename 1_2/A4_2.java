import java.util.*;
public class A4_2 {

	public static void main(String[] args) {
		int i;
		int num = 0;
		
		for(i=1;i<=100;i++)
			if(i % 3 == 0 || i % 4 == 0)
				num += i;

		System.out.println("3 �Ǵ� 4�� ����� �� = " + num);
	}

}
