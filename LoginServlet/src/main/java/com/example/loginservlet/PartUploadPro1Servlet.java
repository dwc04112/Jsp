
package com.example.loginservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/partUploadPro1")
@MultipartConfig(
        fileSizeThreshold = 0,
        location = "C:\\javaExample\\Jsp\\LoginServlet\\src\\main\\webapp\\upload"
)

public class PartUploadPro1Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public PartUploadPro1Servlet(){
        super();
    }

    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        String writer = request.getParameter("writer");
        Part part = request.getPart("partFile1");   //
        response.setContentType("text/html;charset=UTF-8");
        /*
          30 : writer라는 이름으로 폼에서 전송되어온 정보를 받는다
          31 : 입력양식의 name 속성 값이 partFile인 file 입력 양식에서 전송되어온 파일을 Part객체로 얻어옴
          Part 인터페이스는 miltipart/form-data POST 요청으로 수신받은 from 아이템이나 하나의 Part를 나타낸다
         */

        PrintWriter out = response.getWriter();

        String contentDisposition = part.getHeader("content-disposition");
        /*
        41 : content-disposition 헤더 정보를 얻어오는 부분
        여기서 헤더 정보는 : form-data; name="partFile1"; filename="C:\Users..test.txt" 와 같은 형태로 반환
        이 정보를 이용하여 클라이언트가 선택한 파일 이름을 얻을 수 있다
         */
        String uploadFileName = getUploadFileName(contentDisposition);
        // client가 업로드한 파일 명을 얻어온다

        part.write(uploadFileName);
        out.println("작성자 "+writer+"님이 "+uploadFileName+" 파일을 업로드 하였습니다.");
    }
    //사용 브라우저가 크롬인 경우
    private String getUploadFileName (String contentDisposition) {
        String uploadFileName = null;
        String[] contentSplitStr = contentDisposition.split(";");
        // 위의 content-disposition ";" 문자기준으로 분리하는 부분이다

        int firstQutosIndex = contentSplitStr[2].indexOf("\"");
        int lastQutosIndex = contentSplitStr[2].lastIndexOf("\"");
        // 문자열 부분에서 마지막 "\"가 존재하는 인덱스 값을 구하는 부분

        uploadFileName = contentSplitStr[2].substring(firstQutosIndex +1, lastQutosIndex);
        return uploadFileName;
    }
    /*
    //사용 브라우저가 IE인 경우
    private String getUploadFileName (String contentDisposition) {
        String uploadFileName = null;
        String[] contentSplitStr = contentDisposition.split(";");
        int lastPathSeparatorIndex = contentSplitStr[2].lastIndexOf("\\");
        int lastQutosIndex = contentSplitStr[2].lastIndexOf("\"");
        uploadFileName = contentSplitStr[2].substring(lastPathSeparatorIndex + 1, lastQutosIndex);
        return uploadFileName;
    }

     */
}

