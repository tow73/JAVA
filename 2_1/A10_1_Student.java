
public class Student implements Comparable<Student> {
	String name;
	int id;
	int korean;
	int english;
	int math;
	int sum;
	float avg;
	
	public Student(String name, int id, int korean, int english, int math) {
		this.name = name;
		this.id = id;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	public int getTotal() {
		sum = korean + english + math;
		return sum;
	}
	public float getAvg() {
		avg = (float)sum / 3;
		return avg;
	}
	public int compareTo(Student obj) {
		return name.compareTo(obj.getName());
	}
	public String toString() {
		sum = getTotal();
		avg = getAvg();
		return name + "," + id + ": " + korean + ", " + english + 
				", " + math + ", " + sum + ", " + avg;
	}
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
}
