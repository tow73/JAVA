import java.util.*;
public class Book {
	String title;
	String writer;
	public Book(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}
	public String getWriter() { return "���ڴ�: " + writer; }
	public String toString(){
		return "����: " + title + ", ����: " + writer;
	}
}
