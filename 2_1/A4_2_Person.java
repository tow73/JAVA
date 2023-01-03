
public class Person implements Comparable {
	private String name;
	private double height;
	
	public Person(String n, double h) {
		name = n;
		height = h;
	}
	
	public String getName() { return name; }
	public double getHeight() { return height; }
	
	public int compareTo(Object obj) {
		Person other = (Person) obj;
		if(height > other.height)
			return 1;
		else if(height < other.height)
			return -1;
		else
			return 0;
	}
}
