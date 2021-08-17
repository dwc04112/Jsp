package com.example.loginservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/memReg")
public class MemRegServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name= request.getParameter("name");
        String adr= request.getParameter("adr");
        String tel= request.getParameter("tel");
        String hob = request.getParameter("hob");

        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("이름 = " +name+"<br/>");
        out.println("주소 = " +adr+"<br/>");
        out.println("전화번호 = " +tel+"<br/>");
        out.println("취미 = " +hob+"<br/>");

    }
}
