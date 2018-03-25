package net.hoanfir.servlet;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class FirstServletContextAttributeListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("Attribute被添加");
        System.out.println(servletContextAttributeEvent.getValue());
        System.out.println(servletContextAttributeEvent.getName());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("Attribute被删除");
        System.out.println(servletContextAttributeEvent.getValue());
        System.out.println(servletContextAttributeEvent.getName());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("Attribute被修改");
        System.out.println(servletContextAttributeEvent.getValue());    //修改前的值
        System.out.println(servletContextAttributeEvent.getName());
    }
}
