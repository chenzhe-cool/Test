<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
    //�õ�Ҫɾ�������ŵ�id
    int id = Integer.parseInt(request.getParameter("id"));
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>My JSP 'deleteuser.jsp' starting page</title>
</head>

<body>
<div style="margin: auto;width: 10%">
    ȷ��ɾ��?<br>
    <form action="UserDelete" method="post">
        <!-- ����ʹ�����������Ҿ������idû�б�Ҫ��ʾ���û���Ҳ����Ҫ�û����룬������Ҫ�ڱ��ύ��ʱ���ܽ����id�ύ��������������ʹ���������� -->
        <input type="hidden" value="<%= id %>" name="id">
        <input type="submit" value="ɾ��">
    </form>
    <a href="UserShowList" >�����û��б�</a>
</div>
</body>
</html>

