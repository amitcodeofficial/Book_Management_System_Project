package com.bridgelab.BookProject.model;

import java.util.ArrayList;
import java.util.List;

public class BookRegisterCustomer {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int boughtBooks;
    private List<CustomerBooksData> customerBooksData = new ArrayList<CustomerBooksData>();

    public BookRegisterCustomer(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBoughtBooks() {
        return boughtBooks;
    }

    public void setBoughtBooks(int boughtBooks) {
        this.boughtBooks = boughtBooks;
    }

    public List<CustomerBooksData> getCustomerBooksData() {
        return customerBooksData;
    }

    public void setCustomerBooksData(List<CustomerBooksData> customerBooksData) {
        this.customerBooksData = customerBooksData;
    }

    @Override
    public String toString() {
        return "BookRegisterCustomer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", boughtBooks=" + boughtBooks +
                '}';
    }
}
