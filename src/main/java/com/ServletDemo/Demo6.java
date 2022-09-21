package com.ServletDemo;

/**
 * 思考 1.HttpServlet为什么要根据请求方式的不同，调用不同的方法
 * 2.如何调用？
 */

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * 根据自己的MyHttpServletServlet来编写
 */

@WebServlet(urlPatterns = "/Demo6")
public class Demo6 extends MyHttpServlet {
    //访问b.html时，提交后控制台会输出Post。。。
    @Override
    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("Post。。。");
    }

    //访问Demo6时，控制台输出Get。。。
    @Override
    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("Get。。。");
    }
}
