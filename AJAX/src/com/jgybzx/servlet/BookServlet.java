package com.jgybzx.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/**
 * @author: guojy
 * @date: 2019/12/11 21:08
 * @Description:
 * @version:
 */
//http://localhost:8080/AJAX/BookServlet
@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ajax请求成功");
        String bookid = req.getParameter("bookid");
        System.out.println(bookid);
        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<String> strings = parameterMap.keySet();
        for (String string : strings) {
            System.out.println(parameterMap.get(string)[0]);
        }
        System.out.println("触qwqwe发成   功 ");
        System.out.println("热部署怎么这么慢");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
