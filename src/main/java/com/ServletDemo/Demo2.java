package com.ServletDemo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Demo2", loadOnStartup = 0)
public class Demo2 implements Servlet {

    /**
     * 完成初始化的方法
     * 1.调用时机：默认情况下，servlet被第一次访问时调用
     * * loadOnStartup:设置为0或正整数时，会在项目启动时调用init()方法，使用时需要将urlPatterns补齐（默认值为-1，代表被掉访问时才启动）
     * 2.调用次数：1次
     *
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 1.调用时机：每一次servlet被访问时
     * 2.调用次数：多次
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet.");
    }

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

    public static void main(String[] args) {

    }
}
