import java.util.*;
public class main {

	public static void main(String[] args) {
		int year;
		int month;
		int day;
		
		Scanner sc = new Scanner(System.in);
		Date da;
		
		System.out.print("태어난 년도를 입력하세요: ");
		year = sc.nextInt();
		System.out.print("태어난 월을 입력하세요: ");
		month = sc.nextInt();
		System.out.print("태어난 날짜를 입력하세요: ");
		day = sc.nextInt();
		
		da = new Date(year, month, day);
		da.print();
	}

}
