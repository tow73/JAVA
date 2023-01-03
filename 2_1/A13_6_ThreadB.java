
public class ThreadB extends Thread {
	int total;
	
	public void run() {
		synchronized (this) {
			for(int i = 0; i < 100; i ++)
				total += i;
			System.out.println("합계 루틴 끝----");
			notify();
		}
	}
}
