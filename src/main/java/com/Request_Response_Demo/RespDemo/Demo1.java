package com.Request_Response_Demo.RespDemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * Response 实现资源重定向
 */

@WebServlet("/resp1")
public class Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("response 1 ...");
        //重定向
//        //1.设置相应状态码 302
//        response.setStatus(302);
//        //2.设置相应头
//        response.setHeader("location","/Tomcat-Demo/resp2");

        //简化方式完成重定向
        response.sendRedirect(request.getContextPath() + "/resp2");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
