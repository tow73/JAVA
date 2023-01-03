
public class Rectangle extends Shape implements Movable {
	private int width;
	private int height;
	
	public void setWidth(int w) { width = w; }
	public void setHeight(int h) { height = h; }
	
	public void draw() {
		System.out.println("사각형 그리기");
		System.out.println("사각형 이동 좌표");
	}
}
