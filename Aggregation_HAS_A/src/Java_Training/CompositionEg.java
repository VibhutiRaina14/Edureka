package Java_Training;
class Book
{
	String title;
	String author;
	String isbn;
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public Book(String title, String author, String isbn) {
		//super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	public String displayBookDetails() {
		// TODO Auto-generated method stub
		return "Book [title=" + getTitle() + ", author=" + getAuthor() + ", isbn=" + getIsbn() + "]";
	}
	
}
	class Library
	{
		private Book[] books;
		private int bookCount;
		//ctor
		public Library(int capacity)
		{
			books=new Book[capacity];
			bookCount=0;
		}
		//add a book to library
		public boolean addBook(Book book)
		{
			if(bookCount<books.length) {
				books[bookCount++]=book;
				return true;
			}
			else
			{
				System.out.println("Library is full.Cannot add more books");
				return false;
			}
		}
		//to display all books in lib
		public void displayLibraryBooks()
		{
			System.out.println("Library Books");
			for(int i=0;i<bookCount;i++)
			{
				System.out.println("Book"+(i+1)+":");
				books[i].displayBookDetails();
				System.out.println();
			}
		}
	}
public class CompositionEg {
	public static void main(String[] args)
	{
		//creating library with capacity 3
		Library l=new Library(3);
		Book b1=new Book("1","2","3");
		Book b2=new Book("11","21","31");
		Book b3=new Book("111","211","311");
		Book b4=new Book("1","2","3");
		//add books to the library
		l.addBook(b1);
		l.addBook(b2);
		l.addBook(b3);
		//library full, try to add 
		l.addBook(b4);
		//display all
		l.displayLibraryBooks();
	}

}
