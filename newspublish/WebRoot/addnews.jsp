<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>�������</title>
  </head>
  
  <body>
  <div style="margin: auto;width: 10%">
    ������� <br>
    <form action="ArticleAdd" method="post">
    	����<input type="text" name="title" />
		<br>����<input type="text" name="author" />
    	<br>����<textarea name="content" rows="5" cols="50"></textarea>
    	<br><input type="submit" value="���">
    </form>
  </div>
  </body>
</html>
