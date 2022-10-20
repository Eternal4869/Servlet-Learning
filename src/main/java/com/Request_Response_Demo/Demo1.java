package com.Request_Response_Demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Request&Response介绍
 */

@WebServlet(urlPatterns = "/resDemo1")
public class Demo1 extends HttpServlet {
    //在浏览器输入 http://localhost:8080/Tomcat-Demo/resDemo1?name=name ，即可看到 name欢迎你
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //使用request对象获取请求数据
        String name = req.getParameter("name");

        //使用response对象设置响应数据
        resp.setHeader("content-type", "text/html;charset=utf-8");
        resp.getWriter().write("<h1>" + name + ",欢迎你</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Demo1 post...");
    }
}
