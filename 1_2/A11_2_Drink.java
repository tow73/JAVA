
public class Drink extends Food {
	String size;
	
	public Drink(String name, int price, String size) {
		this.name = name;
		this.price = price;
		this.size = size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getSize() {
		return size;
	}
}
