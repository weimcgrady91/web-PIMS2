<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function register() {
            var loginForm = document.forms[0];
            loginForm.action = '';
        }
    </script>
</head>

<body>
<s:a action="setLocal?language=zh&location=CN">中文</s:a>
<s:a action="setLocal?language=en&location=US">English</s:a>
<s:form action="login" validate="true">
    <s:textfield key="username" name="username"/>
    <s:textfield key="password" name="password"/>
    <s:submit key="login"/><s:submit key="register" onclick="register();"/>
</s:form>
</body>
</html>
