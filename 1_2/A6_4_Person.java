
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
		System.out.println("�̸�: " + name + ", Ű: " + height
				+ ", ������: " + weight);
	}
}
