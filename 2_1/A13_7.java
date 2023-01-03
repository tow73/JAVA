
public class A13_7 {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		System.out.println("main() -- start() 호출함");
		synchronized (b) {
			System.out.println("스레드 B가 종료되기를 기다림...");
			b.wait();
			System.out.println("전체 합계: " + b.total);
		}
	}

}
