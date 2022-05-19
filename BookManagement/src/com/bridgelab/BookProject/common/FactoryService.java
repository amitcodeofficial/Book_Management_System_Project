package com.bridgelab.BookProject.common;

import com.bridgelab.BookProject.interfaces.IBookService;
import com.bridgelab.BookProject.services.IMPLBookService;
import com.bridgelab.BookProject.services.LoginIMPL;
import com.bridgelab.BookProject.services.RegisterDataIMPL;

public class FactoryService {
    public static IBookService instanceBS;
    public static RegisterDataIMPL instanceR;
    public static LoginIMPL instanceL;

    public static RegisterDataIMPL getRegisterData(){
        instanceR=new RegisterDataIMPL();
        return instanceR;
    }

    public static LoginIMPL getLoginData(){
        instanceL=new LoginIMPL();
        return instanceL;
    }

    public static IBookService getBookService(){
        instanceBS = new IMPLBookService();
        return instanceBS;
    }
}
