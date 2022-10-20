package com.Request_Response_Demo.ReqDemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 请求参数中文乱码处理
 * 关联e.html
 */

@WebServlet("/req3")
public class Demo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决乱码
        String method = request.getMethod();
        if (method.equals("GET")) {
            //通用解决方案(GET和POST都能用)
            String username = request.getParameter("username");
            byte[] bytes = username.getBytes(StandardCharsets.ISO_8859_1);
            username = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(username);
        }
        if (method.equals("POST")) {
            request.setCharacterEncoding("UTF-8");
            //获取username
            String username = request.getParameter("username");
            System.out.println(username);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
