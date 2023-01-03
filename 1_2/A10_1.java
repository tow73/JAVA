import java.util.*;
public class A10_1 {

	public static void main(String[] args) {
		String title;
		String director;
		Scanner sc = new Scanner(System.in);
		
		Movie [] list = new Movie[2];
		
		for(int i=0; i<list.length; i++) {
			System.out.print("영화제목: ");
			title = sc.nextLine();
			System.out.print("영화감독: ");
			director = sc.nextLine();
			list[i] = new Movie(title, director);
		}
		for(int i=0; i<list.length; i++) {
			System.out.println(toString(list[i].title, list[i].director));
		}
	}
	public static String toString(String title, String director) {
		return "제목: " + title + ", 감독: " + director;
	}
}
