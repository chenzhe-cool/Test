<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<style type="text/css">
      a{
        color: blue;
      }
      a:hover{
        background-color: blue;
        color: white;
        /*border-radius: 7px;*/
      }
    </style>
  </head>
  
  <body>
  <div style="margin: auto;width: 15%;">
    <center>
      <h2>��С���ŷ���ϵͳ</h2>
      <a href="ArticleShowList">����ϵͳ</a><br>
      <a href="UserShowList">�û�����</a><br>
      <a href="Logout">�˳���¼</a><br>
    </center>
  </div>
  </body>
</html>
