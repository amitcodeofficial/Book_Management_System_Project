package com.bridgelab.BookProject.services;

import com.bridgelab.BookProject.common.ScannerUtil;
import com.bridgelab.BookProject.model.BookRegisterCustomer;
import java.util.ArrayList;

public class RegisterDataIMPL {
    public static ArrayList<BookRegisterCustomer> registerCustomers = new ArrayList<BookRegisterCustomer>();

    public static BookRegisterCustomer getCustomer(){
        String firstName = ScannerUtil.getString("FirstName");
        String lastName = ScannerUtil.getString("LastName");
        String email = ScannerUtil.getString("Email");
        String password = ScannerUtil.getString("Password");
        BookRegisterCustomer customerNew = new BookRegisterCustomer(firstName,lastName,email,password);
        return customerNew;
    }

    public void addCustomer(){
        BookRegisterCustomer newcustomer = getCustomer();
        registerCustomers.add(newcustomer);
        System.out.println("Customer Registered");
    }
}
