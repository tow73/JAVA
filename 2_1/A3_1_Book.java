import java.util.*;
public class Book {
	String title;
	String writer;
	public Book(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}
	public String getWriter() { return "历磊绰: " + writer; }
	public String toString(){
		return "力格: " + title + ", 历磊: " + writer;
	}
}
