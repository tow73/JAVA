import java.util.*;
public class A3_1 {

	public static void main(String[] args) {
		String op;
		double n1, n2;
		double result = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		op = sc.nextLine();
		System.out.print("���� 2���� �Է��ϼ���(ex. 3 23): ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		if(op.equals("+"))
		{
			result = n1 + n2;
			System.out.println(n1 + op + n2 + " = " + result);
		}			
		else if(op.equals("-"))
		{
			result = n1 - n2;
			System.out.println(n1 + op + n2 + " = " + result);
		}
			
		else if(op.equals("*"))
		{
			result = n1 * n2;
			System.out.println(n1 + op + n2 + " = " + result);
		}
		else if(op.equals("/"))
		{
			result = n1 / n2;
			if(result < 1)
				System.out.println("������ ������ �� ����");
			else
				System.out.println(n1 + op + n2 + " = " + result);
		}
	}

}
