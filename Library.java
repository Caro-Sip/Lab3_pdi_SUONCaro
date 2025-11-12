import java.util.ArrayList;
import java.util.List;

public class Library 
{
    public static void main(String[] argv)
    {
        List<Book> books = new ArrayList<Book>();
        int number_of_book = 0;

        books.add(new Book(1, "The Hobbit", "J.R.R. Tolkien", 10.99f));
        books.add(new Book(2, "1984", "George Orwell", 8.50f));
        books.add(new Book(3, "To Kill a Mockingbird", "Harper Lee", 9.75f));
        books.add(new Book(4, "Pride and Prejudice", "Jane Austen", 7.20f));
        books.add(new Book(5, "Clean Code", "Robert C. Martin", 32.00f));

        float price_avg = 0;

        for(Book b : books)
        {
            number_of_book++;
            b.printBook();
            price_avg += b.price;
        }

        price_avg = price_avg / number_of_book;

        System.out.println("The average price of the books " + String.format("%.2f", price_avg));
    }
}
