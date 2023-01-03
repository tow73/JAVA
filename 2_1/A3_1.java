import java.util.*;
public class A3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title;
		String writer;
		String find;
		int num;
		int i;
		
		System.out.print("책의 권수>> ");
		num = sc.nextInt();
		sc.nextLine();
		
		Book[] b = new Book[num];
		
		for(i = 0; i < b.length; i++) {
			System.out.print("제목>> ");
			title = sc.nextLine();
			System.out.print("저자>> ");
			writer = sc.nextLine();
			b[i] = new Book(title, writer);
		}
		for(i = 0; i < b.length; i++)
			System.out.println(b[i].toString());
		
		System.out.print("찾으려는 책의 제목은>> ");
		find = sc.next();
		for(i = 0; i < b.length; i++)
			if(find.equals(b[i].title)) {
				System.out.println(b[i].getWriter());
				break;
			}	
		if(i == b.length)
			System.out.println("찾으려는 책이 없습니다.");
	}
}
