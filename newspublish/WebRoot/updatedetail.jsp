<%@page import="ruanko.newspublish.entity.Article"%>
<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	//��request��õ�Ҫ�޸ĵ�����
	Article article = (Article)request.getAttribute("article");
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updatedetail.jsp' starting page</title>
    
	
  </head>
  
  <body>
  <div style="margin: auto;width: 10%">
    �޸�����<br>
    <form action="ArticleUpdateDo" method="post">
    	<input type="hidden" name="id" value="<%= article.getId() %>" />
    	����<input type="text" name="title" value="<%= article.getTitle() %>" />
		<br>����<input type="text" name="author" value="<%= article.getAuthor() %>" />
    	<br>����
    	<textarea name="content" rows="5" cols="50"  ><%= article.getContent() %></textarea>
    	<br><input type="submit" value="�����޸�">
    </form>
    <a href="ArticleShowList" >���������б�</a>
  </div>
  </body>
</html>
