public class Book{
	private static int counter = 0;
	public Book(String title){
		System.out.println("Sold book: "+ title);
		counter++;
	}
	public static int getCounter(){
		return counter;
	}
}