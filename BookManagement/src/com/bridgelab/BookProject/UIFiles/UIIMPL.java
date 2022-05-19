package com.bridgelab.BookProject.UIFiles;

import com.bridgelab.BookProject.common.FactoryService;
import com.bridgelab.BookProject.common.ScannerUtil;
import com.bridgelab.BookProject.interfaces.IBookService;
import com.bridgelab.BookProject.services.LoginIMPL;
import com.bridgelab.BookProject.services.RegisterDataIMPL;

public class UIIMPL {

    public static void UI(){
        int choice=-1;
        do{
            System.out.println("1.Login");
            System.out.println("2.Register");
            System.out.println("0.Exit");
            choice= ScannerUtil.getInteger("Choice");

            switch(choice){
                case 1:
                    UIIMPL.UILogin();
                    break;
                case 2:
                    UIIMPL.UIRegister();
                    break;
            }
        }while(choice!=0);
    }

    public static void UIRegister(){
        RegisterDataIMPL registerOnClick = FactoryService.getRegisterData();
        registerOnClick.addCustomer();
    }

    public static void UILogin(){
        IBookService bookService=FactoryService.getBookService();
        LoginIMPL loginOnClick = FactoryService.getLoginData();
        Boolean confirm = loginOnClick.getConfirmation();
        if(confirm==true){
            System.out.println("Customer Exists");
            int choice=-1;
            do{
               System.out.println("1.Show Books");
               System.out.println("2.Buy Books");
               System.out.println("3.Cancel Books");
               System.out.println("4.My Books");
               System.out.println("0.LogOut");
               choice = ScannerUtil.getInteger("Choice");

               switch (choice){
                   case 1:
                       bookService.showBooks();
                       break;
                   case 2:
                       bookService.buyBooks();
                       break;
                   case 3:
                       bookService.cancelBooks();
                       break;
                   case 4:
                       bookService.myBooks();
                       break;
               }
            }while(choice!=0);
        }else{
            System.out.println("Customer Doesn't Exists");
        }
    }
}
