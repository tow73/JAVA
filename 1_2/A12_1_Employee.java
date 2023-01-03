
public class Employee {
	private String name;
	private int id;
	private String position;
	
	public Employee() {
		name = "¸ð¸§";
		id = -1;
	}
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void setName(String n) {name = n;}
	public String getName() {return name;}
	public void setId(int i) {id = i;}
	public int getId() {return id;}
	public void setPosition(String p) {position = p;}
	public String getPosition() {return position;}
	
	public String toString() {
		return name + "(" + position + ", " + id + ")";
	}
}
