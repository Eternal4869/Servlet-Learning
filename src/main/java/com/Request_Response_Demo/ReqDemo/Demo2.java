package com.Request_Response_Demo.ReqDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Request通用方式获取请求参数
 * Map<String,String[]> getParameterMap():获取所有参数Map集合
 * String[] getParameterValues(String name):根据名称获取参数值(数组)
 * String getParameter(String name):根据名称获取参数值(单个值)
 * 与d.html关联
 */

@WebServlet("/req2")
public class Demo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取所有参数的Map集合
        Map<String, String[]> parameterMap = req.getParameterMap();
        for (String key : parameterMap.keySet()) {
            System.out.print(key + ":");
            String[] parameterValues = req.getParameterValues(key);
            //获取值
            for (String k : parameterValues) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        //根据key获取参数值，数组
        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
    }
}
