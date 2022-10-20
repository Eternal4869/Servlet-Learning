package com.Request_Response_Demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * request继承体系
 * ServletRequest：Java提供的请求对象根接口
 * HttpServletRequest：Java提供的对Http协议封装的请求对象接口
 * RequestFacade：Tomcat定义的实现类
 * HttpServletRequest extends ServletRequest
 * extends HttpServletRequest
 */

@WebServlet("/reqDemo2")
public class Demo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
