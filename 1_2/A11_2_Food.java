
public class Food {
	String name;
	int price;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public Integer getPrice() {
		return price;
	}
	
	public String toString() {
		return name + ", " + price;
	}
}
