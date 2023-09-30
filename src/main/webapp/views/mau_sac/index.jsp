<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous"
    />
    <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"
    ></script>
    <title>Màu sắc</title>
</head>
<body>
<div class="container">
    <div style="text-align: center">
        <h3>Màu sắc</h3>
    </div>
    <table class="table table-bordered">
        <thead>
        <tr>
            <td>Mã</td>
            <td>Ten</td>

            <td colspan="2">Thao tác</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${data}" var="ms">
            <tr>
                <td>${ ms.ma }</td>
                <td>${ ms.ten }</td>
                <td><a href="/mau-sac/edit/${ms.ma}">Sửa</a> </td>
                <td><a href="/mau-sac/delete/${ms.ma}">Xóa</a> </td>


            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>