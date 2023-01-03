
public class Point {
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj){
		Point p = (Point)obj;
		if(p.x == x && p.y == y)
			return true;
		else
			return false;
	}
	
}
