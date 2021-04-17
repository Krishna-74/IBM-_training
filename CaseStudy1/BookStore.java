package bookish;

public class BookStore {
	
	Book[] books = new Book[3];

	public void addBook(Book[] b) {
		for (int i=0; i<3; i++) {
			books[i] = b[i];
		}
	}
	
	public void searchTitle(String title) {
		boolean foundBook=false;
		int foundBookNumber = 0;
		for (int i=0; i<books.length; i++) {
			if(title.equals(books[i].getTitle())){
				foundBook = true;
				foundBookNumber = i;
				break;
			}
		}
		if(foundBook) {
			System.out.println("found \n");
			books[foundBookNumber].showDetails();
		}else {
			System.out.println("\n not found\n");
			System.out.println("The title : " + title +  " is not found");
		}
	}
	
	public void searchAuthor(String author) {
		boolean foundAuthor=false;
		int foundAuthorNumber = 0;
		for (int i=0; i<books.length; i++) {
			if(author.equals(books[i].getAuthor())){
				foundAuthor = true;
				foundAuthorNumber = i;
				break;
			}
		}
		if(foundAuthor) {
			System.out.println("found \n");
			books[foundAuthorNumber].showDetails();
		}else {
			System.out.println("\n not found\n");
			System.out.println("The author : " + author + " is not found");
		}
	}
	
	public void dispayAll() {
		System.out.println("all books:");
		for (int i=0; i<books.length; i++) {
			books[i].showDetails();
			System.out.println("");
		}
	}
}
