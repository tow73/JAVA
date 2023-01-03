
public class A13_4 {

	public static void main(String[] args) {
		Counter c = new Counter();
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
	}

}
