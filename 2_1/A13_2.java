
public class A13_2 {

	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();
	}

}
