import java.util.List;
import java.util.ArrayList;

public class store {
    public static void main(String[] args) {
        List<item> itemList = new ArrayList<>();

        try(java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("Enter number of items: ");
            int number_of_items = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < number_of_items; i++) 
            {
                System.out.print("Enter item name: ");
                String name = scanner.nextLine();

                System.out.print("Enter item quantity: ");
                int quantity = scanner.nextInt();

                System.out.print("Enter item price per unit: ");
                float unit_price = scanner.nextFloat();
                scanner.nextLine();

                System.out.print("\n");

                item newItem = new item(name, quantity, unit_price);
                newItem.setID(i);
                itemList.add(newItem);
            }
        }
        System.out.printf("%5s %-10s %5s %10s %10s%n","ID", "Name", "Amt", "UnitPrice", "TotalPrice");
        for (item it : itemList) {
            it.displayItemsTable();
        }
    }
}
