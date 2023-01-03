
public class A13_6 {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			b.wait();
			System.out.println("전체 합계: " + b.total);
		}
	}

}
