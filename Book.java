public class Book {
    int id; 
    String title; 
    String author;
    float price;

    Book(){}

    Book(String title, String author, float price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void change_price(float new_price)
    {
        price = new_price;
    }

    public void printBook()
    {
        System.out.println("Book Title:" + id);
        System.out.println("ID: " + id);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price + " USD");
        System.out.println("---------------\n");
    }

    public void printBookTable()
    {
        System.out.printf("| %5d | %-30s | %-20s | %10.2f USD |\n", id, title, author, price);
    }

    public void applyID(int id)
    {
        this.id = id;
    }
}
