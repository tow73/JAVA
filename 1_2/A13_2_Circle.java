import java.util.*;
public class Circle extends Shape {
	int x = (int)(Math.random() * 100);
	int y = (int)(Math.random() * 100);
	
	public void setX(int x) {x = this.x;}
	public int getX() {return x;}
	public void setY(int y) {y = this.y;}
	public int getY() {return y;}
	
	public void draw() {
		System.out.println("\n�� �׸���");
	}
	
	@Override
	public void move(int dx, int dy) {
		System.out.println("�� �̵� ��ǥ");
		System.out.println("x: " + x + " y: " + y);
	}
}
