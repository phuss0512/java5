<%@ page language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>Khach Hang</title>
</head>
<body>
<form action="/khach-hang/store" method="POST">
    <div>
        <label>ID</label> <input type="text" name="id" >
    </div>
    <div>
        <label>Mã</label> <input type="text" name="ma">
    </div>
    <div>
        <label>Tên</label> <input type="text" name="ten">
    </div>
    <div>
        <label>Tên đệm</label> <input type="text" name="tenDem" >
    </div>
    <div>
        <label>Họ</label> <input type="text" name="ho">
    </div>
    <div>
        <label>Ngày sinh</label> <input type="text" name="ngaySinh">
    </div>
    <div>
        <label>SDT</label> <input type="number" name="sdt" >
    </div>
    <div>
        <label>Địa chỉ</label> <input type="text" name="diaChi">
    </div>
    <div>
        <label>Thành phố</label> <input type="text" name="thanhPho">
    </div>
    <div>
        <label>Quốc gia</label> <input type="text" name="quocGia">
    </div>
    <div>
        <label>Mật khẩu</label> <input type="password" name="matKhau" >
    </div>

    <button>Create</button>
</form>
</body>
</html>