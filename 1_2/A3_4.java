import java.util.*;
public class A3_4 {

	public static void main(String[] args) {
		int num;
		int i = 0;
		int sum = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구하려는 범위의 숫자를 입력하세요: ");
		num = sc.nextInt();
		
		while(i <= num)
		{
			if(i % 3 == 0)
			{
				System.out.print(i + "\t");
				sum += i;
				count++;
				
				if(count % 5 == 0)
					System.out.println();
			}				
			i++;
		}
		System.out.print("\n");
		System.out.println("0부터 " + num + "까지의 3의 배수 합: " + sum);
	}

}
