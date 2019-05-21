package by.epam.training.unit13ht.task02;

/*
2. Создайте класс Payment (покупка), сформируйте покупку из нескольких товаров.
 */

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Item> items;

    private PaymentType paymentType;
    private LocalDateTime dateTimeOfPayment;

    public Payment(List<Item> items, PaymentType paymentType, LocalDateTime dateTimeOfPayment) {
        this.items = new ArrayList<>(items);
        this.paymentType = paymentType;
        this.dateTimeOfPayment = dateTimeOfPayment;
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public BigDecimal calculateTotalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Item item : items) {
            totalPrice = totalPrice.add(item.calculatePrice());
        }
        return totalPrice;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public LocalDateTime getDateTimeOfPayment() {
        return dateTimeOfPayment;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "items=" + items +
                ", totalPrice=" + calculateTotalPrice() +
                ", paymentType='" + paymentType + '\'' +
                ", dateTimeOfPayment=" + dateTimeOfPayment +
                '}';
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void deleteItem(Item item) {
        items.remove(item);
    }

}
