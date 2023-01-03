
public class Person {
	String name;
	float height;
	float weight;
	
	public Person(String n, float h, float w) {
		name = n;
		height = h;
		weight = w;
	}
	void print() {
		System.out.println("이름: " + name + ", 키: " + height
				+ ", 몸무게: " + weight);
	}
}
