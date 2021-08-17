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
    <title>My JSP 'login.jsp' starting page</title>
    <style type="text/css">
        .frame1{
            position: relative;
            border:1px solid black;
            height: 280px;
            width:300px;
            margin:200px auto;
        }
        .login{
            display: inline-block;
            margin-left: 50%;
        }
        a:hover{
            color: blue;
        }
    </style>
</head>
<body>
<div class="frame1">
    <form name="form1" action="UserLogin" method="post" onsubmit="return check(form1.username.value)">
        <h2 style="text-align: center">用户登录</h2><br>
        <div style="width: 230px;margin: auto">
        <p>
            用户名：<input type="text" name="username">
        </p>
        <p>
            密&emsp;码：<input type="password" name="password">  <%--&emsp;全角占位符，相当于一个中文的位置--%>
        </p>
        </div>

        <input class="login" type="button" value="登录" onclick="check_login()">
<%--        <div style="display: inline-block; margin-left: 60%">
            <a  href="register.jsp">注册</a>
        </div>--%>
<%--        <input class="register" type="button" value="注册" onclick="window.open('register.jsp')">--%>
    </form>
    <label style="font-size: 13px">
        &emsp;还没有账号？
        <a href="register.jsp">立即注册</a>
    </label>
</div>
<script type="text/javascript">
    function check(str){
        var mess="不允许输入的字符：\r\n";
        var mark="yes";
        if(str.indexOf(";")>=0){
            mark="no";
            mess+=" ; ";
        }
        if(str.indexOf("&")>=0){
            mark="no";
            mess+=" & ";
        }
        if(str.indexOf("<")>=0){
            mark="no";
            mess+=" < ";
        }
        if(str.indexOf(">")>=0){
            mark="no";
            mess+=" > ";
        }
        if(str.indexOf("--")>=0){
            mark="no";
            mess+=" -- ";
        }
        if(str.indexOf("/")>=0){
            mark="no";
            mess+=" / ";
        }
        if(str.indexOf("%")>=0){
            mark="no";
            mess+=" % ";
        }
        if(str.indexOf("'")>=0){
            mark="no";
            mess+=" ' ";
        }
        if(mark=="no"){
            alert(mess);
            return false;
        }
        else
            return true;
    }

    function check_login() {
        var user_name=form1.username.value;//获取表单form1的用户名的值
        var user_pwd=form1.password.value;//获取表单form1密码值
        if((user_name=="")||(user_name==null)){//判断用户名是否为空，为空就弹出提示框"请输入用户名"，否则正常执行下面的代码。
            alert("请输入用户名！");
            form1.username.focus();//获取焦点，即：鼠标自动定位到用户名输入框，等待用户输入用户名。
            return;
        }
        else if((user_pwd=="")||(user_pwd==null)){//判断密码是否为空，为空就弹出提示框"请输入密码"，否则正常执行下面的代码。
            alert("请输入密码！");
            form1.password.focus();//获取焦点。
            return;}
        else {//如果用户名、密码都正常输入，则提交表单，浏览器经打开新的（主页）窗口。
            form1.submit();
        }
    }
</script>
</body>
</html>
