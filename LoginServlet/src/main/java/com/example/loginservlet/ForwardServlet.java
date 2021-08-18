package com.example.loginservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/forwardTest") //url 요청을 받는부분
public class ForwardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // jsp 에서의 forward 처리
        // test용 value
        String name = "name1";
        String age = "24";

        request.setAttribute("name", name);     //속성을 지정해서 request에 넣음
        request.setAttribute("age", age);
        RequestDispatcher dis = request.getRequestDispatcher("ForwardResult.jsp");  //포워드 시키기 ( ForwardResult.jsg가 대상 )
        dis.forward(request, response);

        // 결과를 출력하는 코드가 없다.
        // ForwardResult.jsp에서 처리해서 보여주는 것이므로.
    }
}
