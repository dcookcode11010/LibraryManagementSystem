package Library;

import java.util.Scanner;

public class Checkout 
{

	public static void main(String[] args) 
	{
		String name;
		int selection = 0;
		int days;
		Stock s =  new Stock();
		
		System.out.println("Please enter a selection: \n" + "1 - View books available. \n" + "2 - Return a book. \n" + "3 - Checkout book \n" +"4 - Check your balance \n");
		
		do
		{	
			Scanner ss = new Scanner(System.in);
			
			selection = ss.nextInt();
			switch(selection)
			{
				case 1:
					s.printBooks();
					System.out.println("Anymore enter a selections: \n");
					System.out.println("Please enter a selection: \n" + "1 - View books available. \n" + "2 - Return a book. \n" + "3 - Checkout book \n" +"4 - Check your balance \n");
					break;
					
				case 2:
					System.out.println("Please enter the book returning: \n");
					Scanner sss = new Scanner(System.in);
					name = sss.nextLine();
					s.addBook(name);
					System.out.println("Anymore enter a selections: \n");
					System.out.println("Please enter a selection: \n" + "1 - View books available. \n" + "2 - Return a book. \n" + "3 - Checkout book \n" +"4 - Check your balance \n");
					break;
					
				case 3:
					System.out.println("Please enter the book you would like to check out: \n");
					Scanner ssss = new Scanner(System.in);
					name = ssss.nextLine();
					s.removeBook(name);
					System.out.println("Anymore enter a selections: \n");
					System.out.println("Please enter a selection: \n" + "1 - View books available. \n" + "2 - Return a book. \n" + "3 - Checkout book \n" +"4 - Check your balance \n");
					break;
					
				case 4:
					System.out.println("Hello are you returning late today? If so, how many days? \n");
					Scanner sssss = new Scanner(System.in);
					days = sssss.nextInt();
					s.calculatePayment(days);
					s.checkBalance();
					System.out.println("Anymore enter a selections: \n");
					System.out.println("Please enter a selection: \n" + "1 - View books available. \n" + "2 - Return a book. \n" + "3 - Checkout book \n" +"4 - Check your balance \n");
					break;
					
				default: 
					System.out.println("No more selections? Have a great day! \n");
			}
		}
		while(selection != 5);
	}
}
