package by.epam.com.java.lessons.fourth.LessonFourPartTwo;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int id;
    private String lastName;
    private String firstName;
    private String surName;
    private String address;
    private String creditCardNumber;
    private int bankAccountNumber;

    public Customer() {
    }

    public Customer(int id, String lastName, String firstName, String surName, String address,
            String creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    private List createCustomers() {
        List<Customer> arrayCustomers = new ArrayList<>();
        arrayCustomers.add(new Customer(1, "Ivanov", "Ivan", "Ivanovich", "Minsk", "443300", 220022));
        arrayCustomers.add(new Customer(2, "Maltsev", "Sergey", "Petrovich", "New York", "223300", 221122));
        return arrayCustomers;
    }

    public void show() {
        List<Customer> arrayCustomers = createCustomers();
        System.out.println("List of our customers: ");
        for (Customer customer : arrayCustomers) {
            System.out.println(
                    customer.getId() + " " + customer.getFirstName() + " " + customer.getLastName() + " " + customer
                            .getAddress() + " " + customer.getCreditCardNumber() + " " + customer
                            .getBankAccountNumber());
        }
    }

    public void showCustomersFromMinsk(){
        List<Customer> arrayCustomers = createCustomers();
        System.out.println("\n" + "Customers from Minsk: ");
        for (Customer customer : arrayCustomers) {
            if (customer.getAddress().equals("Minsk"))
            System.out.println(
                    customer.getId() + " " + customer.getFirstName() + " " + customer.getLastName());
        }
    }
}
