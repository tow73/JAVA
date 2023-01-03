
public class Rectangle {
	int width;
	int height;
	int area;
	
	public Rectangle(int w, int h) {	
		area = w * h;
	}
	void area() {
		System.out.println("사각형의 넓이는 " + area + "이다.");
	}
}
