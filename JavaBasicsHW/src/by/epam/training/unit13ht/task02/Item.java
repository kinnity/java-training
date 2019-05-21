package by.epam.training.unit13ht.task02;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {

    private Product product;
    private double amount;

    public Item(Product product, double amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public BigDecimal calculatePrice() {
        return product.getPricePerUnit().multiply(BigDecimal.valueOf(amount));
    }

    @Override
    public String toString() {
        return "Item{" +
                "product=" + product +
                ", amount=" + amount +
                ", price=" + calculatePrice() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.amount, amount) == 0 &&
                Objects.equals(product, item.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, amount);
    }
}
