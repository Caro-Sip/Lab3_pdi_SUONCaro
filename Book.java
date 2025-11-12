public class Book {
    int id; 
    String title; 
    String author;
    float price;

    Book(String title, String author, float price)
    {
        id = 0;
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
}
