import java.util.*;
public class Book {
	String title;
	String writer;
	public Book(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}
	public String getWriter() { return "저자는: " + writer; }
	public String toString(){
		return "제목: " + title + ", 저자: " + writer;
	}
}
