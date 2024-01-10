<%@ page import="org.najot.model.Maxsulot" %><%--
  Created by IntelliJ IDEA.
  User: Shakhboz Juraev
  Date: 10.01.2024
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<% Maxsulot maxsulot = (Maxsulot) request.getAttribute("maxsulot");%>
<html>
<head>
    <title>Maxsulot</title>
    <link href="<%= request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <h1>Maxsulot haqida</h1>
    <div class="card mt-3">
        <div class="card-body">
            <h2 class="card-title">Nomi: <%= maxsulot.getNomi()%></h2>
            <h2 class="card-text">Narxi: $<%= maxsulot.getId()%></h2>
        </div>
    </div>
    <a href="<%= request.getContextPath()%>/delete/<%= maxsulot.getId()%>" class="btn btn-danger">Delete</a>
    <a href="<%= request.getContextPath()%>/updatemaxsulot/<%= maxsulot.getId()%>" class="btn btn-warning">Update</a>
    <a href="${pageContext.request.contextPath}/maxsulotlar" class="btn btn-dark">Back to Products</a>
</div>
<script src="<%= request.getContextPath()%>/js"></script>
</body>
</html>