package com.lyk.spring.mvc;

import com.lyk.spring.service.LoginService;
import jdk.nashorn.internal.objects.Global;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContext;

import javax.annotation.Resource;

@Controller
public class LoginController {
    @Resource
    LoginService service;
    @Resource
    javax.servlet.http.HttpServletRequest request;

    @RequestMapping("index")
    public ModelAndView toLoginPage(){
        return new ModelAndView("WEB-INF/jsp/login.jsp");
    }

    @RequestMapping("login")
    public ModelAndView doLogin(){
        String loginPageUrl = "WEB-INF/jsp/login.jsp";
        String successPageUrl = "WEB-INF/jsp/success.jsp";

        String uname = request.getParameter("uname");
        String upasswd = request.getParameter("upasswd");

        return service.doLogin(loginPageUrl,successPageUrl,uname,upasswd);
    }
}
