
public class ThreadB extends Thread {
	int total;
	
	public void run() {
		System.out.println("run() �޼ҵ� ����----");
		synchronized (this) {
			System.out.println("�հ��ƾ ����----");
			for(int i = 0; i < 100; i ++)
				total += i;
			System.out.println("�հ� ��ƾ ��----");
			notify();
		}
	}
}
