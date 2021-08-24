package com.example.loginservlet;

import javax.servlet.http.Part;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/partUploadPro2")
@MultipartConfig(
        fileSizeThreshold = 0,
        location = "C:\\javaExample\\Jsp\\LoginServlet\\src\\main\\webapp\\upload"
)
public class PartUploadPro2Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public PartUploadPro2Servlet(){
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String writer = request.getParameter("writer");
        String uploadFileNameList = "";
        // 업로드할 파일을 문자열로 연결하기 위해 선언된 변수
        // 업로드된 모든 파일 이름들을 문자열로 저장할 변수

        for(Part part: request.getParts()){
            if(!part.getName().equals("writer")){
                String contentDisposition = part.getHeader("content-disposition");
                //클라이언트에서 전송된 content-disposition 헤더 정보를 얻어오는 부분
                String uploadFileName = getUploadFileName (contentDisposition);
                part.write(uploadFileName);
                uploadFileNameList +=" " + uploadFileName;
            }
        }   //모든 파라미터 값을 가지고 Part객체를 생성해서 파일 업로드 작업업

       out.println("작성자" +writer+"님이 "+uploadFileNameList +" 파일을 업로드 하였습니다.");
    }
    private String getUploadFileName(String contentDisposition) {
        String uploadFileName = null;
        String[] contentSplitStr = contentDisposition.split(";");
        int firstQutosIndex = contentSplitStr[2].indexOf("\"");
        int lastQutosIndex = contentSplitStr[2].lastIndexOf("\"");
        uploadFileName = contentSplitStr[2].substring(firstQutosIndex +1, lastQutosIndex);
        return uploadFileName;
    }

}
