package com.lyk.struts;

public class LoginAction {
    private Users us;

    public String excute(){
        if(us.getUsername().equals("admin") && us.getPasswd().equals("123")){
            return "success";
        }else{
            return "fail";
        }
    }

    public Users getUs() {
        return us;
    }

    public void setUs(Users us) {
        this.us = us;
    }
}
