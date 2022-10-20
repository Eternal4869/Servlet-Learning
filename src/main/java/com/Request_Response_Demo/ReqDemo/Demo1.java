package com.Request_Response_Demo.ReqDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

//Request获取请求数据
//与c.html关联

@WebServlet("/req1")
public class Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String getMethod():获取请求方式
        String method = req.getMethod();
        System.out.println("Method : " + method);

        //String getContextPath():获取虚拟路径(项目访问路径):/req1
        String contextPath = req.getContextPath();
        System.out.println("ContextPath : " + contextPath);

        //StringBuffer getRequestURL():获取URL(统一资源定位符):http://localhost:8080:Tomcat-Demo/req1
        StringBuffer requestURL = req.getRequestURL();
        System.out.println("URL : " + requestURL.toString());

        //String getRequestURI():获取URI(统一资源标识符):/Tomcat-Demo/req1
        String requestURI = req.getRequestURI();
        System.out.println("URI : " + requestURI);

        //String getQueryString():获取请求参数(GET方式):username=zhangsan
        String queryString = req.getQueryString();
        System.out.println("Query string : " + queryString);


        //--------------------------
        //String getHeader(name):获取请求头
        //user-agent:浏览器版本信息
        System.out.println(req.getHeader("user-agent"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取post 请求体:请求参数
        //获取字符输入流
        BufferedReader br = req.getReader();
        String s = br.readLine();
        System.out.println(s);
    }
}
