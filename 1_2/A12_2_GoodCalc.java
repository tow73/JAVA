
public class GoodCalc extends Calculator {
	public int add(int n1, int n2) {
		return n1 + n2;
	}
	public int sub(int n1, int n2) {
		return n1 - n2;
	}
	
	public double avg(int[] a) {
		int i;
		int total = 0;
		int average = 0;
		
		for(i = 0; i < a.length; i++)
			total += a[i];
		average = total / 3;
		
		return average;
	}
}
