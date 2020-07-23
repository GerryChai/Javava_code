package Book;

//import Book.Book.*;

	public class Test{
		public static void main(String[] args){
			Book book= new Book ( "bookname like me", "thisthatauthor", 99.2);
			System.out.println("The book name is: "+ book.getTitle());
			System.out.println("The author is: "+ book.getAuthor());
			System.out.println("The price is: "+ book.getPrice());	

		}
	}
