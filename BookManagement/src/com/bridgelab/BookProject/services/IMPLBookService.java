package com.bridgelab.BookProject.services;

import com.bridgelab.BookProject.common.ScannerUtil;
import com.bridgelab.BookProject.interfaces.IBookService;
import com.bridgelab.BookProject.model.BookRegisterCustomer;
import com.bridgelab.BookProject.model.BooksData;
import com.bridgelab.BookProject.model.CustomerBooksData;

public class IMPLBookService implements IBookService {

    private BookRegisterCustomer getValidUser(){
        return RegisterDataIMPL.registerCustomers.stream().filter(customer -> customer.getEmail().equals(LoginIMPL.validEmail)).findFirst().get();
    }

    @Override
    public void showBooks() {
        System.out.println(BooksIMPL.books);
    }

    @Override
    public void buyBooks() {
        int bookid = ScannerUtil.getInteger("Book Id");
        int bookBuyQuantity = ScannerUtil.getInteger("Books quantity to buy");
        BookRegisterCustomer customer = getValidUser();
        for (BooksData temp : BooksIMPL.books) {
            if (temp.getId() == bookid) {
                if (temp.getQuantity() != 0 && bookBuyQuantity < temp.getQuantity()) {
                    int tempQuantity = temp.getQuantity();
                    temp.setQuantity(tempQuantity - bookBuyQuantity);
                    CustomerBooksData newBoughtBook = new CustomerBooksData(temp.getId(), temp.getBookName(), temp.getBookAuthor(),temp.getBookPrice(),bookBuyQuantity);
                    customer.getCustomerBooksData().add(newBoughtBook);
                } else {
                    System.out.println("Wrong quantity book");
                }
            }
        }
    }

    @Override
    public void cancelBooks() {
        int bookidC = ScannerUtil.getInteger("Book ID");
        String confirmCancel = ScannerUtil.getString("Cancel yes or no");
        if (confirmCancel == "yes") {
            for (BooksData temp : BooksIMPL.books) {
            }
        }
    }

    @Override
    public void myBooks() {
       System.out.println(getValidUser().getCustomerBooksData());
    }

}
