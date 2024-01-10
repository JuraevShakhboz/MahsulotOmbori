<%@ page import="org.najot.model.Maxsulot" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Shakhboz Juraev
  Date: 10.01.2024
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<% List<Maxsulot> productList = (List<Maxsulot>) request.getAttribute("maxsulot");%>
<html>
<head>
    <title>Maxsulotlar</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
        <th scope="col"></th>
    </tr>
    </thead>
    <tbody>
    <% for(Maxsulot maxsulot : productList){%>
    <tr>
        <td><%=maxsulot.getId()%></td>
        <td><%=maxsulot.getNomi()%></td>
        <td><%=maxsulot.getNarxi()%></td>
        <td>
            <a href="<%= request.getContextPath()%>/maxsulot/<%= maxsulot.getId()%>" class="btn btn-primary">view</a>
            <a href="<%= request.getContextPath()%>/updatemaxsulot/<%= maxsulot.getId()%>" class="btn btn-warning">update</a>
            <a href="<%= request.getContextPath()%>/delete/<%= maxsulot.getId()%>" class="btn btn-danger">delete</a>
        </td>
    </tr>
    <%}%>
    </tbody>
</table>
<a href="<%= request.getContextPath()%>" class="btn btn-secondary mt-3">Home</a>
<script src="<%= request.getContextPath()%>/js"></script>
</body>
</html>