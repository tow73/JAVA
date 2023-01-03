import java.util.*;
public class A4_5 {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		double sum = 0;
		double max = -999;
		
		list.add(1.0);
		list.add(2.0);
		list.add(3.0);
		list.add(4.0);
		for(int i = 0; i < 4; i++)
		{
			sum += list.get(i);
			if(list.get(i) > max)
				max = list.get(i);
		}
		for(Double num:list)
			System.out.print(num + "  ");
		System.out.println("\n합은" + sum);
		System.out.println("최대값은" + max);
	}

}
