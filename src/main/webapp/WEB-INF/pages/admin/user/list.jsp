<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/pages/global.jsp" %>
<html>
<head>
    <title></title>
    <%@ include file="/WEB-INF/pages/admin/adminStatic.jsp" %>
</head>
<body>

<div class="user-list">
    <c:forEach items="${users}" var="user">
        <div class="panel panel-default">
            <div class="panel-body">
                ${user.email}
                <a href="/app/user/show/${user.id}">Show</a>
            </div>
        </div>
    </c:forEach>
</div>


</body>
</html>
