
public class MyMath<T> {
	double avg;

	public double getAverage(Number[] n) {
		for(int i=0; i<n.length; i++)
			avg += n[i].doubleValue();
		avg /= n.length;
		
		return avg;
	}
}
