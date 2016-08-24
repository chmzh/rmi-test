package com.cmz.client;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.cmz.service.UserService;

public class HessianClient {

    public static String url = "http://localhost:8080/rmi-web/remoting/UserService";
    public static void  main(String[] args){
        HessianProxyFactory factory = new HessianProxyFactory();
        try {
            UserService userService = (UserService) factory.create(UserService.class, url);
            userService.setName("abc");
            System.out.println(userService.getName());
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
