import java.util.*;
public class A3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title;
		String author;
		int i;
		Book[] b = new Book[2];
		
		for(i = 0; i < b.length; i++) {
			System.out.print("����>> ");
			title = sc.nextLine();
			System.out.print("����>> ");
			author = sc.nextLine();
			b[i] = new Book(title, author);
		}
		
		for(i = 0; i < b.length; i++)
			System.out.println("(" + b[i].getTitle() + ", " + b[i].getAuthor() + ")");
	}

}
