<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="ruanko.newspublish.entity.User" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
    //��request���ȡ�����б�
    List<User> users = (List<User>)request.getAttribute("users");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'showusers.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <style type="text/css">
        h3{
            text-align: center;
        }
        a{
            color: black;
        }
        a:hover{
            color: blue;
            /*background-color: blue;
            border-radius:7px;*/
        }
    </style>

</head>

<body>
<div style="margin:0 auto;width: 10%">
    <h3>�����б�</h3>
    <a href="register.jsp" class="register">�������</a><br>
    <table border="1">
        <tr>
            <td>����</td>
            <td>����</td>
        </tr>
        <%
            for (int i = 0; i < users.size(); i++){
                User user = (User)users.get(i);
        %>
        <tr>
            <td><a href="UserShow?id=<%= user.getId() %>"><%= user.getUsername() %></a></td>
            <td><a href="deteledetail.jsp?id=<%= user.getId() %>">ɾ��</a> <a href="UserUpdate?id=<%= user.getId() %>">�޸�</a></td>
        </tr>
        <%
            }
        %>
    </table><br>
    <%--	  ���޸�--%>
    <a href="index.jsp" style="font-size: 14px;">&lt;������ҳ</a>
</div>
</body>
</html>
