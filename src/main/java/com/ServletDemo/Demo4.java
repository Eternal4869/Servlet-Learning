package com.ServletDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet体系结构
 * 开发B/S架构的web项目，都是针对HTTP协议的，所以需要自定义Servlet，继承自HttpServlet
 */

@WebServlet(urlPatterns = "/Demo4")
public class Demo4 extends HttpServlet {
    //访问Demo4时，控制台会输出Get...
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Get...");
    }

    //访问a.html时，控制台会输出Post...
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Post...");
    }
}
