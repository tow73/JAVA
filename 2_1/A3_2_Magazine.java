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
		
		System.out.print("���� �̸���? ");
		title = sc.nextLine();
		System.out.print("������ ����? ");
		page = sc.nextInt();
		sc.nextLine();
		System.out.print("���ڴ�? ");
		writer = sc.nextLine();
		System.out.print("�߸�����? ");
		publish = sc.nextLine();
		Book b = new Book(title, page, writer);
		
		System.out.println("å �̸�: " + b.getTitle());
		System.out.println("��������: " + b.getPage());
		System.out.println("����: " + b.getWriter());
		System.out.println("�߸���: " + b.getPublish(publish));
	}

}
