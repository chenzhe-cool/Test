<%@page import="ruanko.newspublish.entity.Article"%>
<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	//��request���ȡ����
	Article article = (Article)request.getAttribute("article");
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>��ʾ��������</title>
    
  </head>
  
  <body>
  <div style="margin: auto;width: 10%">
    ��ʾ������ϸ���� <br>
   ���ű���:<h1><%= article.getTitle() %></h1> 
   <br>����:<%= article.getAuthor() %>
   <br>��������:<%= article.getContent() %>
  </div>
  </body>
</html>
