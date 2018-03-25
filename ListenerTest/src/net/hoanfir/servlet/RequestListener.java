package net.hoanfir.servlet;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

//  监听ServletRequest域创建与销毁
//  生命周期：每一次请求都会创建request，每次请求结束就销毁

//  servletrequestlistener周期很短，idea新建的listener文件不自动生成，因为不怎么用


public class RequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {

    }
}
