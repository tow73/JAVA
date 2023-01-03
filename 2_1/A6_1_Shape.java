
public class Shape implements Movable {
	protected int x, y;
	
	public void move(int x,int y) {
		System.out.printf("x: %d, y: %d\n\n", x, y);
	}
	
	public void draw() {
		System.out.println("도형 그리기");
	}
}
