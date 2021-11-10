import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        int itemCode = 0;
        String description = null;
        int quantity = 0;
        double price = 0.0;
        double totalPrice = 0.0;
        double overAllPrice = 0.0;
        char choice = '\0';
        char card = '\0';


        Scanner scan = new Scanner(System.in);

        List<Items> product = new ArrayList<Items>();

        do {

            System.out.println("Enter product details,");
            System.out.print("Item Code: ");
            itemCode = scan.nextInt();
            System.out.println("Enter product description");
            description = scan.next();
            System.out.print("Quantity: ");
            quantity = scan.nextInt();
            System.out.print("Price (per item): ");
            price = scan.nextDouble();

            totalPrice = price * quantity;

            overAllPrice += totalPrice;

            product.add(new Items(
                    itemCode, description, quantity, price, totalPrice));

            System.out.print("Want to add more item? (y or n): ");
            choice = scan.next().charAt(0);

            scan.nextLine();
        } while (choice == 'y' || choice == 'Y');
        System.out.println("payement in card?(y or n) : ");
        card = scan.next().charAt(0);

        for (Items p : product) {
            System.out.println(p);
        }
        if (overAllPrice > 10000)
            overAllPrice = 0.9 * overAllPrice;
        else if (card == 'y' || card == 'Y') {
            if (overAllPrice < 1000) {
                overAllPrice = (0.25 * overAllPrice) + overAllPrice;
            }
        }


        System.out.println("\nTotal Price = " + overAllPrice);

    }
}
