package com.ServletDemo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * servlet 方法介绍
 */

@WebServlet(urlPatterns = "/Demo3")
public class Demo3 implements Servlet {
    private ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = config;
        System.out.println("init");
    }

    /**
     * 获取ServletConfig对象
     * 返回Tomcat启动servlet时创建的ServletConfig对象
     *
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet.");
    }

    /**
     * 获取servlet信息
     *
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 1.调用时机：在servlet被销毁时调用（内存释放或服务器关闭时，servlet对象会被销毁，调用）
     * 2.调用次数：1次
     */
    @Override
    public void destroy() {
        System.out.println("Destroy");
    }
}
