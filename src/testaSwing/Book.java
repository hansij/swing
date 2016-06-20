package testaSwing;

public class Book {
	private String title;
	private String author;
	private String language;
	private int price;
	
	public Book() {}
	
	public Book(String title, String author, String language, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.language = language;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
