package by.epam.training.unit13ht.task02;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private String name;
    private BigDecimal pricePerUnit;
    private UnitName unitName;

    public Product(String name, BigDecimal pricePerUnit, UnitName unitName) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.unitName = unitName;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    public UnitName getUnitName() {
        return unitName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", pricePerUnit=" + pricePerUnit +
                ", unitName='" + unitName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(pricePerUnit, product.pricePerUnit) &&
                Objects.equals(unitName, product.unitName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pricePerUnit, unitName);
    }
}
