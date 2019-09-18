<%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2019/9/18
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>个人中心</h3>
<%--<%--%>
<%--for(int i=0;i<10;i++) {--%>
<%--    out.println(i);--%>
<%--}--%>
<%--string username = request.getAttribute("username");--%>
<%--if(username!=null){--%>
<%--    out.println(username);--%>
<%--}--%>
<%--%>--%>
<%=session.getAttribute("username")%>
</body>
</html>
