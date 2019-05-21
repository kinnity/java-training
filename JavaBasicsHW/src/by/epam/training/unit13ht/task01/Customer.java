package by.epam.training.unit13ht.task01;

/*
Создайте описанные ниже классы.
Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс.
Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
Переопределите для данных классов методы equals и hashCode.
*/

import java.util.Objects;

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private Address address;
    private String creditCardNumber;
    private String bankAccountNumber;

    public Customer() {
    }

    public Customer(int id, String surname, String name, String patronymic, Address address, String creditCardNumber, String bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public Customer(int id, String surname, String name, String patronymic, Address address) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
    }

    public Customer(int id, String surname, String name, String patronymic, Address address, String creditCardNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(surname, customer.surname) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(patronymic, customer.patronymic) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(creditCardNumber, customer.creditCardNumber) &&
                Objects.equals(bankAccountNumber, customer.bankAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, address, creditCardNumber, bankAccountNumber);
    }
}
