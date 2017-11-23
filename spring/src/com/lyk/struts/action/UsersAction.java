package com.lyk.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import javafx.scene.Parent;

public class UsersAction extends ActionSupport {
    public String add() throws Exception{
        System.out.println("add");
        return SUCCESS;
    }
    public String update() throws Exception{
        System.out.println("update");
        return SUCCESS;
    }
    public String show() throws Exception{
        System.out.println("show");
        return SUCCESS;
    }
    public String delete() throws Exception{
        System.out.println("delete");
        return SUCCESS;
    }
}
