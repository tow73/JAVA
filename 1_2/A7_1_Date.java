
public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	public int getAge() { return 2021 - year + 1; }
	void print() {
		System.out.println("����� ������ " + year + "�� " + month + "��" + 
				 day + "���Դϴ�.");
		System.out.println("���� ���̴� " + getAge() + "�Դϴ�.");
	}
}
