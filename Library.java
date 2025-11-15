import java.util.ArrayList;
import java.util.List;

public class Library 
{
    public static void main(String[] argv)
    {
        List<Book> books = new ArrayList<Book>();
        int number_of_book = 0;

        try (java.util.Scanner scanner = new java.util.Scanner(System.in))
        {
            do
            {
                Book temp = new Book();

                System.out.print("Enter book title (or 'exit' to finish): ");
                temp.title = scanner.nextLine();
                if(temp.title.equalsIgnoreCase("exit"))
                {
                    break;
                }

                System.out.print("Enter book author: ");
                temp.author = scanner.nextLine();

                System.out.print("Enter book price: ");
                temp.price = scanner.nextFloat();

                temp.applyID(++number_of_book);

                books.add(temp);

                scanner.nextLine(); // Consume the newline character
            }while(true);
        }
        catch(Exception e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("\n--- Book List ---");
    
        float price_avg = 0;

        for(Book b : books)
        {
            b.printBook();
            price_avg += b.price;
        }

        price_avg = price_avg / (number_of_book + 1);

        System.out.println("The average price of the books " + String.format("%.2f", price_avg));
    }
}