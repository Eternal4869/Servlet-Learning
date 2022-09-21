package com.ServletDemo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 思考 1.HttpServlet为什么要根据请求方式的不同，调用不同的方法
 * 2.如何调用？
 */

@WebServlet(urlPatterns = "/Demo5")
public class Demo5 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //根据请求方式的不同，进行分别的处理
        HttpServletRequest httpReq = (HttpServletRequest) servletRequest; //强制类型转换，使得可以获取请求方式
        //1. 获取请求方式
        String method = httpReq.getMethod();
        //2. 判断
        if ("GET".equals(method)) {
            //get方式的逻辑处理
        } else if ("POST".equals(method)) {
            //post方式的逻辑处理
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
