package by.epam.training.unit13ht.task01;

/*
Создайте описанные ниже классы.
Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс.
Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
Переопределите для данных классов методы equals и hashCode.
*/

import java.util.Objects;

public class Student {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private Date dateOfBirth;
    private Address address;
    private String phoneNumber;
    private String faculty;
    private int course;

    public Student() {
    }

    public Student(int id, String surname, String name, String patronymic, Date dateOfBirth, Address address, String phoneNumber, String faculty, int course) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
    }

    public Student(int id, String surname, String name, Date dateOfBirth, Address address, String faculty, int course) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.faculty = faculty;
        this.course = course;
    }

    public Student(int id, String surname, String name, Date dateOfBirth, Address address, String phoneNumber, String faculty, int course) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                course == student.course &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(name, student.name) &&
                Objects.equals(patronymic, student.patronymic) &&
                Objects.equals(dateOfBirth, student.dateOfBirth) &&
                Objects.equals(address, student.address) &&
                Objects.equals(phoneNumber, student.phoneNumber) &&
                Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, dateOfBirth, address, phoneNumber, faculty, course);
    }
}
