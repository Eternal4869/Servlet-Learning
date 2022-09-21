package com.ServletDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * urlPattern配置:一个servlet可以配置多个访问路径：urlPattern = {路径名}
 * urlPattern配置规则：
 * ①精确匹配：（1）配置路径:"/user/select"
 * （2）访问路径:"localhost:8080/web-demo/user/select"
 * ②目录匹配：（1）配置路径:"user/*"
 * （2）访问路径:"localhost"8080/user/web-demo/aaa"、"localhost"8080/web-demo/bbb"
 * ③扩展名匹配：（1）配置路径:"*.do"
 * （2）访问路径:"localhost"8080/web-demo/aaa.do"、"localhost"8080/web-demo/bbb.do"
 * ④任意匹配：（1）配置路径："/"、"/*"
 * （2）访问路径:"localhost"8080/web-demo/hehe"、"localhost"8080/web-demo/haha"
 */

@WebServlet(urlPatterns = "/Demo7")
public class Demo7 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post...");
    }
}
