package by.epam.training.unit13ht.task02;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product appleProduct = new Product("Apple", BigDecimal.valueOf(2.36), UnitName.KILO);
        Product milkProduct = new Product("Milk", BigDecimal.valueOf(1.64), UnitName.LITER);
        Product waffleProduct = new Product("Waffle", BigDecimal.valueOf(1.12), UnitName.PIECE);

        System.out.println("Products: ");
        System.out.println(" ----------------------------");
        printProduct(appleProduct);
        printProduct(milkProduct);
        printProduct(waffleProduct);
        System.out.println(" ----------------------------");

        Item apples = new Item(appleProduct, 1.36);
        Item milk = new Item(milkProduct, 1);
        Item waffle = new Item(waffleProduct, 2);

        System.out.println("\nItems: ");
        System.out.println(" -----------------------------------");
        printItem(apples);
        printItem(milk);
        printItem(waffle);
        System.out.println(" -----------------------------------");

        List<Item> items = new ArrayList<>();
        items.add(apples);
        items.add(milk);

        System.out.println("\n--create payment");

        Payment payment = new Payment(items, PaymentType.CARD, LocalDateTime.now());
        printPayment(payment);

        System.out.println("\n--add item to payment");
        payment.addItem(waffle);
        printPayment(payment);

        System.out.println("\n--delete item from payment");
        payment.deleteItem(milk);
        printPayment(payment);
    }

    public static void printProduct(Product product) {
        System.out.printf("|%-10s|%-10.2f|%-6s|\n", product.getName(), product.getPricePerUnit(), product.getUnitName());
    }

    public static void printItem(Item item) {
        System.out.printf("|%-10s|%-6s %-6s|%-10.2f|\n", item.getProduct().getName(), item.getAmount(), item.getProduct().getUnitName(), item.calculatePrice());
    }

    public static void printPayment(Payment payment) {
        System.out.println("\nPayment items: ");
        System.out.println(" -----------------------------------");
        for (Item item : payment.getItems()) {
            printItem(item);
        }
        System.out.println(" -----------------------------------");

        System.out.println("Payment type: " + payment.getPaymentType());
        System.out.println("Total price: " + payment.calculateTotalPrice());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Date and time of payment: " + payment.getDateTimeOfPayment().format(formatter));

    }
}
