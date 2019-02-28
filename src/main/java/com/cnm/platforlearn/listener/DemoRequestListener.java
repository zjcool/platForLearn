package com.cnm.platforlearn.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;


@WebListener
public class DemoRequestListener implements ServletRequestListener {
    private String requestURI = "";

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println(requestURI + ":==============>请求被销毁了");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        requestURI = ((HttpServletRequest) sre.getServletRequest()).getRequestURI();
        System.out.println(requestURI+ ":==============>请求被创建");

    }
}
