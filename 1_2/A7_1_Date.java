
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
		System.out.println("당신의 생일은 " + year + "년 " + month + "월" + 
				 day + "일입니다.");
		System.out.println("현재 나이는 " + getAge() + "입니다.");
	}
}
