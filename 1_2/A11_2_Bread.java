
public class Bread extends Food {
	int num;
	
	public Bread(String name, int price, int num) {
		this.name = name;
		this.price = price;
		this.num = num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Integer getNum() {
		return num;
	}
}
