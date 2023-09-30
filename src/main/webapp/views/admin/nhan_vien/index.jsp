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
    <title>Nhân viên</title>
</head>
<body>
<div class="container">
    <table class="table table-bordered">
        <thead>
            <tr>
                <td>Mã</td>
                <td>Họ</td>
                <td>Tên đệm</td>
                <td>Tên</td>
                <td>Giới tính</td>
                <td>Ngày sinh</td>
                <td>Địa chỉ</td>
                <td>SĐT</td>
                <td colspan="2">Thao tác</td>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${data}" var="nv">
            <tr>
                <td>${ nv.ma }</td>
                <td>${ nv.ho }</td>
                <td>${ nv.tenDem }</td>
                <td>${ nv.ten }</td>
                <td>${ nv.gioiTinh }</td>
                <td>${ nv.ngaySinh }</td>
                <td>${ nv.diaChi }</td>
                <td>${ nv.sdt }</td>
                <td><a href="/nhan-vien/edit/${nv.ma}">Sửa</a> </td>
                <td><a href="">Xóa</a> </td>


            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>