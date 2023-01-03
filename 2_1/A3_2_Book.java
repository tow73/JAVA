
public class Book {
	String title;
	int page;
	String writer;
	
	public Book(String title, int page, String writer) {
		this.title = title;
		this.page = page;
		this.writer = writer;
	}
	public String getTitle() { return title; }
	public void setTitle(String t) { title = t; }
	public int getPage() { return page; }
	public void setPage(int p) { page = p; }
	public String getWriter() { return writer; }
	public void setWriter(String w) { writer = w; }
	public String getPublish(String publish) { return publish; }
	public void setPublish(String pu, String publish) { publish = pu; }
}
