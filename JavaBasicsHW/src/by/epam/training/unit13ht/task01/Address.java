package by.epam.training.unit13ht.task01;

import java.util.Objects;

public class Address {
    private String country;
    private String city;
    private String street;
    private int houseNumber;
    private int flatNumber;

    public Address() {
    }

    public Address(String country, String city, String street, int houseNumber, int flatNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    public Address(String country, String city, String street, int houseNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return houseNumber == address.houseNumber &&
                flatNumber == address.flatNumber &&
                Objects.equals(country, address.country) &&
                Objects.equals(city, address.city) &&
                Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, street, houseNumber, flatNumber);
    }
}
