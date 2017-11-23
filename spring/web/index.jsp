<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Sarkuler
  Date: 2017/11/20
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%--<s:form action="login" method="post">
    <s:textfield label="用户名" name="us.username"></s:textfield>
    <s:password label="密码" name="us.passwd"></s:password>
    <s:checkboxlist list="{'aaa','bbb','ccc'}" label="爱好" name="hobby" ></s:checkboxlist>
    <s:checkboxlist list="#{'1':'aaa','2':'bbb','3':'ccc'}" label="爱好" name="hobby1" ></s:checkboxlist>
    <s:radio list="#{'1':'aaa','2':'bbb','3':'ccc'}" label="爱好" name="hobby2"></s:radio>
    <s:select multiple="true" list="#{'1':'aaa','2':'bbb','3':'ccc'}" label="爱好" name="hobby2"></s:select>
    <s:submit value="提交"></s:submit>
</s:form>--%>
<a href="/userAction.do">访问</a>
<a href="/userAction!add.action">访问add</a>
<a href="/userAction!update.action">访问update</a>
<a href="/userAction!delete.action">访问delete</a>
<a href="/userAction!show.action">访问show</a>
</body>
</html>
