<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String contextPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
 <title>Dubbo服务端首页</title>
</head>
<body>
<a href="<%=contextPath%>/dubbo">Dubbo服务端</a><br>
</body>
</html>