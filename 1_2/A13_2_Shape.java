import java.util.*;
abstract class Shape implements Movable {
	public abstract void draw();
	@Override
	public abstract void move(int dx, int dy);
}
