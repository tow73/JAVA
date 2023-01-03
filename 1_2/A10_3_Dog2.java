import java.util.*;
public class Dog2 {
	private String name;
	private String type;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public Dog2(String name, String type) {
		this.name = name;
		this.type = type;
	}	
	public Dog2() {
		
	}
	
	public String toString() {
		return name + ", " + type;
	}
}
