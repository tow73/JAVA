import java.util.*;
public class Magazine extends Book{

	public Magazine(String title, int page, String writer) {
		super(title, page, writer);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title;
		int page;
		String writer;
		String publish;
		
		System.out.print("잡지 이름은? ");
		title = sc.nextLine();
		System.out.print("페이지 수는? ");
		page = sc.nextInt();
		sc.nextLine();
		System.out.print("저자는? ");
		writer = sc.nextLine();
		System.out.print("발매일은? ");
		publish = sc.nextLine();
		Book b = new Book(title, page, writer);
		
		System.out.println("책 이름: " + b.getTitle());
		System.out.println("페이지수: " + b.getPage());
		System.out.println("저자: " + b.getWriter());
		System.out.println("발매일: " + b.getPublish(publish));
	}

}
