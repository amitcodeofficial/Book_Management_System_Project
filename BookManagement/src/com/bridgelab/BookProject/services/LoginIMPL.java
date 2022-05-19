package com.bridgelab.BookProject.services;

import com.bridgelab.BookProject.common.ScannerUtil;
import com.bridgelab.BookProject.model.BookRegisterCustomer;

public class LoginIMPL {
    public static String validEmail;
    public Boolean getConfirmation(){
        String email= ScannerUtil.getString("Email");
        String password=ScannerUtil.getString("Password");

        int h=0;
        for(BookRegisterCustomer temp:RegisterDataIMPL.registerCustomers){
            if(temp.getEmail().equals(email)){
                h++;
            }
//            else{
//                System.out.println("Wrong Email");
//                break;
//            }

            if(temp.getPassword().equals(password)){
                h++;
            }
//            else{
//                System.out.println("Wrong Password");
//                break;
//            }
        }
        if(h>=2){
            validEmail=email;
            return true;
        }else{
            return false;
        }
    }
}
