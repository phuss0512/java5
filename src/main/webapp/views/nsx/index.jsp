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
    <title>Nhà sản xuất</title>
</head>
<body>
<div class="container">
    <h3>Nhà sản xuất</h3>
    <table class="table table-bordered">
        <thead>
        <tr>
            <td>Mã</td>
            <td>Ten</td>

            <td colspan="2">Thao tác</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${data}" var="nsx">
            <tr>
                <td>${ nsx.ma }</td>
                <td>${ nsx.ten }</td>
                <td><a href="/nsx/edit/${nsx.ma}">Sửa</a> </td>
                <td><a href="/nsx/delete/${nsx.ma}">Xóa</a> </td>


            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>