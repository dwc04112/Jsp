package com.example.loginservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/redirectTest")    //url 요청을 받는부분
public class RedirectServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //response.sendRedirect("RedirectResult.jsp");
        response.sendRedirect("RedirectResult.jsp?key1=hihi&key2=value");
    }
}
