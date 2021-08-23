package com.example.loginservlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/GetPostL")

public class GetPostLogin extends HttpServlet {
    public GetPostLogin(){
        super();

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String color = req.getParameter("color");
        String RGB = req.getParameter("RGB");

        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.println("색상은 "+color+"입니다");
        out.println("RGB는 "+RGB+"입니다");
    }
}
