
public class W6_1 {

	public static void main(String[] args) {
		int i;
		Movable[] m = new Movable[3];
		m[0] = new Rectangle();
		m[1] = new Triangle();
		m[2] = new Circle();
		
		for (i = 0; i < m.length; i++) {
			m[i].draw();
			m[i].move((int)(Math.random() * 101), (int)(Math.random() * 101));
		}	
	}

}
