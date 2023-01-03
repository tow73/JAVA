
public class ThreadB extends Thread {
	int total;
	
	public void run() {
		System.out.println("run() 메소드 시작----");
		synchronized (this) {
			System.out.println("합계루틴 시작----");
			for(int i = 0; i < 100; i ++)
				total += i;
			System.out.println("합계 루틴 끝----");
			notify();
		}
	}
}
