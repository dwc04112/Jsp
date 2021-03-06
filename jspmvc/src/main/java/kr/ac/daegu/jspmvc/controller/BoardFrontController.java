package kr.ac.daegu.jspmvc.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.bbs")
//모든 문자열.bbs 로 들어오는 url요청은 여기서 처리해라

public class BoardFrontController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String requestURI = request.getRequestURI();    //localhost:8080으로 호출을 했을 때
        String contextPath = request.getContextPath();
        String cmdURI = requestURI.substring(contextPath.length());
        // log
        System.out.println("requestURI = " + requestURI);
        System.out.println("contextPath = " + contextPath);
        System.out.println("cmdURI = " + cmdURI);

        String viewPage = null;
        // 글 목록 조회 처리
        if(cmdURI.equals("/boardList.bbs")){
            viewPage = "view/boardList.jsp";
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
        dispatcher.forward(request, response);

    }
}
