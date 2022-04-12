package Library;

import java.util.ArrayList;  
import java.util.List;

public class Stock implements Fines
{
	String addBook;
	List<String> book;
	double fees;
	double total;
	
	
	public Stock()
	{
		this.book = avaliBook();
		this.fees = bookPenalty();
	}
	public List<String> addBook(String addBook)
	{
		String name = addBook;
		book.add(name);
		return book; 
	}
	
	public List<String> removeBook(String addBook)
	{
		String name = addBook;
		book.remove(name);
		return book; 
	}
	
	void printBooks()
	{
		for(String element: book)
		System.out.println("Books available: " + element);
	}
	
	public static List<String> avaliBook()
	{
		List<String> tempBook = new ArrayList<String>();
		
		 tempBook.add("Anime Book");
		 tempBook.add("Adventure Book");
		 tempBook.add("Art Book");
		 tempBook.add("Sci-fi Book");
		 tempBook.add("Biography Book");
		 
		return tempBook;
	}
	public double calculatePayment(int days)
	{
		total = fees * days;
		return total;
	}
	void checkBalance()
	{
		System.out.println("Your current balance is: " + total);
	}
}
