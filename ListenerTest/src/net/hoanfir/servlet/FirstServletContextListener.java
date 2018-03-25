package net.hoanfir.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//  事件源：被监听的对象、监听器：用于监听事件源的对象、注册监听器：将监听器和事件源进行绑定
//  响应行为：监听器听到事件源的状态变化后，所涉及的功能代码

//  监听器分类
//  按照被监听的对象划分:ServletContext域 ServletRequest域 HttpSession域
//  按照监听的内容划分:
//      域对象的创建和销毁：ServletContextListener FirstHttpSessionListener ServletRequestListener
//      域对象的属性的变换：ServletContextAttributeListener HttpSessionAttributeListener ServletRequestAttributeListener
//  额外两个:HttpSessionActivationListener HttpSessionBindingListener

//  原始方法，对于listener监听器，servlet3.0之前要用xml配置（原始方法），之后只需依赖注入即可
//  需要在web.xml里进行listener配置
//  如果使用依赖注入@weblistener则无需配置
public class FirstServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("servletcontext初始化了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("servletcontext销毁了");
    }
}
