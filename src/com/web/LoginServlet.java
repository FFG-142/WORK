package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author dell
 * @date 2019.9.17
 * 登录的请求响应
 */
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求代码
        req.setCharacterEncoding("UTF-8");
        //通过req请求参数获取前台表单的用户名参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //跳转之前把用户名存入req对象
        req.setAttribute("username",username);
        req.setAttribute("password",password);
        //通过req跳转,服务器端跳转（地址不变）
        //req.getRequestDispatcher("/index.jsp").forward(req,resp);
        //通过req请求对象获取session会话对象
        HttpSession session = req.getSession();
        //用户名存入session对象
        session.setAttribute("username",username);
        session.setAttribute("password",password);
        //通过resp跳转
        resp.sendRedirect("/index.jsp");
    }

}