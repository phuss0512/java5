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
    <title>Khach Hang</title>
</head>
<body>
<div class="container">
    <table class="table table-bordered">
        <thead>
        <tr>
            <td>Mã</td>
            <td>Sản Phẩm</td>
            <td>Dòng sản phảm</td>
            <td>Màu sắc</td>
            <td>Nhà sản xuất</td>
            <td>Nam bảo hành</td>
            <td>Mô tả</td>
            <td>Số Lượng tồn</td>
            <td>Giá nhập</td>
            <td>Giá bán</td>
            <td colspan="2">Thao tác</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${data}" var="ctsp">
            <tr>
                <td>${ ctsp.ma }</td>
                <td>${ ctsp.sanPham }</td>
                <td>${ ctsp.dongSanPham }</td>
                <td>${ ctsp.mauSac }</td>
                <td>${ ctsp.nhaSanXuat}</td>
                <td>${ ctsp.namBH }</td>
                <td>${ ctsp.moTa }</td>
                <td>${ ctsp.soLuongTon }</td>
                <td>${ ctsp.giaNhap }</td>
                <td>${ ctsp.giaBan }</td>
                <td><a href="/chi-tiet-san-pham/edit/${ctsp.ma}">Sửa</a> </td>
                <td><a href="/chi-tiet-san-pham/delete/${ctsp.ma}">Xóa</a> </td>


            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>