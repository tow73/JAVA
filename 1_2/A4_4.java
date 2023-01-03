import java.util.*;
public class A4_4 {

	public static void main(String[] args) {
		double[] s = new double[4];
		double sum = 0;
		double max = -999;
		
		for(int i = 0; i < 4; i++)
		{
			s[i] = i + 1;
			sum += s[i];
			if(s[i] > max)
				max = s[i];
		}
			
		System.out.print("toString() 로 출력: ");
		System.out.println(Arrays.toString(s));
		for(double num : s)
			System.out.print(num + " ");
		System.out.println("\n합은" + sum);
		System.out.println("최대값은" + max);
	}

}
