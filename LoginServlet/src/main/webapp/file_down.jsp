<%@ page import="java.io.FileInputStream" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.nio.charset.StandardCharsets" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String fileName = request.getParameter("file_name");
    String savePath = "upload";
    ServletContext context = config.getServletContext();
    String sDownloadPath = context.getRealPath(savePath);
    String sFilePath = sDownloadPath + "\\" + fileName;
    byte[] b = new byte[4096];
    String sMimeType = config.getServletContext().getMimeType(sFilePath);
    System.out.println("sMimeType>>>>>>>>" + sMimeType);
    if(sMimeType == null){
        sMimeType = "application/octet-stream";
    }
    // Microsoft Internet Explorer로 받은 요청인지 아닌지?
    String agent = request.getHeader("User-Agent");
    boolean ieBrowser = (agent.contains("MSIE")) || (agent.contains("Trident"));
    // Microsoft Internet Explorer라면 파일 이름을 어떻게 처리해서 보낼것인지?
    if(ieBrowser) {
        fileName = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");
    } else {
        fileName = new String(fileName.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
    }
    /*
     * client가 받을 response header의 내용을 일부 변경.
     * */
    response.setContentType(sMimeType);
    response.setHeader("Content-Disposition", "attachment; filename= " + fileName);
    // 저장된 파일을 메모리로 불러온다.
    FileInputStream in = new FileInputStream(sFilePath);
    // enduser로 보낼 파일 데이터(바이트배열)를 준비
    ServletOutputStream out2 = response.getOutputStream();
    int numRead;
    // outputstream에 데이터를 실어서
    while((numRead = in.read(b, 0, b.length)) != -1) {
        out2.write(b, 0, numRead);
    }
    // client에게 보낸다.
    out2.flush();
    out2.close();
    in.close();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>