package bookish;

public class BookUtil {

	public static void main(String[] args) {
		
		Book book1 = new Book("B101", "Python", "AI sweigart", "Technology", 600);
    Book book2 = new Book("B103", "java", "Durgasoft", "Technology", 800);
		Book book3 = new Book("B102", "Brand new world", "Aldous", "Fiction", 700);
		
		BookStore bookStore = new BookStore();
		Book[] books = {book1, book2, book3};
		bookStore.addBook(books);
		
		bookStore.searchTitle("java");
		bookStore.searchTitle("Brand new world");
		bookStore.searchAuthor("Aldous");
		bookStore.searchAuthor("Durgasoft");		
		bookStore.dispayAll();
		
	}

}
