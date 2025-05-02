public class Book
{
	public void displayInfo(String libraryName , String title , String author)
	{
	System.out.println("Library Name:" +libraryName);
	System.out.println("Book Title:" +title);
 	System.out.println("Author:" +author);
	}
		public static void main(String[] args)
		{
		Book book = new Book();
		book.displayInfo("City public library" , "The Great Gatsby" , "F.Scott Fitzgerald");
		book.displayInfo("city public library" , "1984" , "Georg orwell");
		}
}