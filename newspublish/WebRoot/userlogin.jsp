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
        <h2 style="text-align: center">�û���¼</h2><br>
        <div style="width: 230px;margin: auto">
        <p>
            �û�����<input type="text" name="username">
        </p>
        <p>
            ��&emsp;�룺<input type="password" name="password">  <%--&emsp;ȫ��ռλ�����൱��һ�����ĵ�λ��--%>
        </p>
        </div>

        <input class="login" type="button" value="��¼" onclick="check_login()">
<%--        <div style="display: inline-block; margin-left: 60%">
            <a  href="register.jsp">ע��</a>
        </div>--%>
<%--        <input class="register" type="button" value="ע��" onclick="window.open('register.jsp')">--%>
    </form>
    <label style="font-size: 13px">
        &emsp;��û���˺ţ�
        <a href="register.jsp">����ע��</a>
    </label>
</div>
<script type="text/javascript">
    function check(str){
        var mess="������������ַ���\r\n";
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
        var user_name=form1.username.value;//��ȡ��form1���û�����ֵ
        var user_pwd=form1.password.value;//��ȡ��form1����ֵ
        if((user_name=="")||(user_name==null)){//�ж��û����Ƿ�Ϊ�գ�Ϊ�վ͵�����ʾ��"�������û���"����������ִ������Ĵ��롣
            alert("�������û�����");
            form1.username.focus();//��ȡ���㣬��������Զ���λ���û�������򣬵ȴ��û������û�����
            return;
        }
        else if((user_pwd=="")||(user_pwd==null)){//�ж������Ƿ�Ϊ�գ�Ϊ�վ͵�����ʾ��"����������"����������ִ������Ĵ��롣
            alert("���������룡");
            form1.password.focus();//��ȡ���㡣
            return;}
        else {//����û��������붼�������룬���ύ��������������µģ���ҳ�����ڡ�
            form1.submit();
        }
    }
</script>
</body>
</html>
