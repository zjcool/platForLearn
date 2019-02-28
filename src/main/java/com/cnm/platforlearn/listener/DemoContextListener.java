package com.cnm.platforlearn.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class DemoContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("==============>请求上下文被初始化了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("==============>请求上下文被销毁了");
    }
}
