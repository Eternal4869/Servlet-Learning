package com.Request_Response_Demo.ReqDemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * 请求转发
 * getRequestDispatcher(contextPath).forward(req,resp);
 * 请求转发资源间共享数据
 * void setAttribute(String name,Object o):存储数据到request域中
 * Object getAttribute(String name):根据key，获取值
 * void removeAttribute(String name):根据key，删除该键值对
 */

@WebServlet("/req4")
public class Demo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Demo4...");
        //资源共享
        request.setAttribute("name", "张三");
        //请求转发
        request.getRequestDispatcher("/req5").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
