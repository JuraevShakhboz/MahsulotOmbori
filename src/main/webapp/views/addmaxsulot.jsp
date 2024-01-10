<%--
  Created by IntelliJ IDEA.
  User: Shakhboz Juraev
  Date: 10.01.2024
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Maxsulot qo'shish</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form id="myForm" action="<%= request.getContextPath()%>/submitaddmaxsulot">
    <div class="mb-3">
        <label for="name" class="form-label">Name</label>
        <input type="text"  id="name" name="name" >
    </div>
    <div class="mb-3">
        <label for="price" class="form-label">Price</label>
        <input type="number"  id="price" name="price">
    </div>
    <button type="submit" class="btn btn-primary" onclick="submitForm()">Submit</button>
</form>
<a href="${pageContext.request.contextPath}/maxsulotlar" class="btn btn-secondary mt-3">Back to Products</a>
<script>
    function submitForm() {
        document.getElementById("myForm").submit();
    }
</script>
</body>
</html>