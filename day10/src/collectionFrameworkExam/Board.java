package collectionFrameworkExam;

public class Board {
	private String title; // 제목
	private String content; //내용
	private String writer; //작성자 
	
	
	public Board() {}
	public Board(String title, String content, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
