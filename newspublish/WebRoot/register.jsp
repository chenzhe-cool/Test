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
            <h2 style="text-align: center">用户注册</h2>
            <p>
                <label>用户名:</label>
                <input type="" name="username"></p>
            <p>
                <label>密&emsp;码:</label>
                <input type="password" name="password">
            </p>
            <p>
                <label>性别：</label>
                男<input type="radio" value="男" name="sex" checked="true">
                女<input type="radio" value="女" name="sex">
            </p>
            <label>户籍：</label>
            <select name="arrive">
                <option>上海</option>
                <option>广州</option>
                <option>重庆</option>
                <option>其他</option>
                <option selected="">北京</option>
            </select><br>
            <label>备注：</label><br>
            <textarea name="beizhu" rows="5" cols="15"></textarea><br><br>
                <input type="submit" value="提交">
        </form>
        <a href="userlogin.jsp" style="font-size: 13px;">返回登录界面</a>
    </div>
</div>
</body>
</html>
