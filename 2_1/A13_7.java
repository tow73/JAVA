
public class A13_7 {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		System.out.println("main() -- start() ȣ����");
		synchronized (b) {
			System.out.println("������ B�� ����Ǳ⸦ ��ٸ�...");
			b.wait();
			System.out.println("��ü �հ�: " + b.total);
		}
	}

}
