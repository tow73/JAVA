import java.util.*;
public class A13_2 {

	public static void main(String[] args) {
		int x = (int)(Math.random() * 100);
		int y = (int)(Math.random() * 100);
		
		System.out.println("Movable 타입 객체 배열-Shape클래스에서 인터페이스 구현");
		
		Movable r = new Rectangle();
		Movable t = new Triangle();
		Movable c = new Circle();
		
		((Rectangle) r).draw();
		r.move(x, y);
		((Triangle) t).draw();
		t.move(x, y);
		((Circle) c).draw();
		c.move(x, y);
	}

}
