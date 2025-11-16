public class item {
    int id = 0;
    String name;
    float price;
    int quantity;
    float unit_price;

    item(String name, int quantity, float unit_price) {
        this.name = name;
        this.quantity = quantity;
        this.unit_price = unit_price;
        price = totalPrice();
    }

    public void setID(int id) {
        this.id = id;
    }

    public float totalPrice() {
        return price * quantity;
    }

    public void displayItem()
    {
        System.out.println("Item ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Unit: " + unit_price);
        System.out.println("Total Price: " + totalPrice());
    }

    public void displayItemsTable()
    {
        System.out.printf("%5d %-10s %5d %10.2f %10.2f%n", id, name, quantity, unit_price, price);
    }
}
