<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%--
  Created by IntelliJ IDEA.
  User: monster
  Date: 2021/7/10
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>My JSP 'register.jsp' starting page</title>
    <style type="text/css">
        .register{
            position: relative;
            margin: auto;
            width: 400px;
            height: 500px;
        }
        .reg{
            margin: auto;
            width: 250px;
        }
    </style>
</head>
<body>
<div class="register">
    <div class="reg">
        <form action="UserRegister" method="post" >
            <h2 style="text-align: center">�û�ע��</h2>
            <p>
                <label>�û���:</label>
                <input type="" name="username"></p>
            <p>
                <label>��&emsp;��:</label>
                <input type="password" name="password">
            </p>
            <p>
                <label>�Ա�</label>
                ��<input type="radio" value="��" name="sex" checked="true">
                Ů<input type="radio" value="Ů" name="sex">
            </p>
            <label>������</label>
            <select name="arrive">
                <option>�Ϻ�</option>
                <option>����</option>
                <option>����</option>
                <option>����</option>
                <option selected="">����</option>
            </select><br>
            <label>��ע��</label><br>
            <textarea name="beizhu" rows="5" cols="15"></textarea><br><br>
                <input type="submit" value="�ύ">
        </form>
        <a href="userlogin.jsp" style="font-size: 13px;">���ص�¼����</a>
    </div>
</div>
</body>
</html>
