<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"/>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <title>CTSP</title>
</head>
<body>
<div class="container">

    <div class="row">
        <div class="col-3"></div>
        <div class="col-6">
            <div class="card my-3 ">
                <div style="text-align: center">
                    <h3>Thêm CTSP</h3>
                </div>
                <div class="card-body">
                    <sf:form action="/chi-tiet-san-pham/store" method="POST" modelAttribute="ctsp">

                        <div class="mb-3">
                            <label for="exampleFormControlInput1" class="form-label">Mã</label>
                            <span style="color: red ">*</span>
                            <sf:input type="text" class="form-control" id="exampleFormControlInput1" redname="ma"
                                      path="ma"/>
                            <sf:errors path="ma" cssStyle="color: red"></sf:errors>
                        </div>


                        <div class="mb-3">
                            <label for="exampleFormControlInput2" class="form-label">Sản Phẩm</label>
                            <span style="color: red ">*</span>
                            <sf:input type="text" class="form-control" id="exampleFormControlInput2" redname="sanPham"
                                      path="sanPham"/>
                            <sf:errors path="sanPham" cssStyle="color: red"></sf:errors>
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput3" class="form-label">Dòng Sản Phẩm</label>
                            <sf:input type="text" class="form-control" id="exampleFormControlInput3" redname="dongSanPham"
                                      path="dongSanPham"/>
                                      <sf:errors path="dongSanPham" cssStyle="color: red"></sf:errors>
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput4" class="form-label">Màu Sắc</label>
                            <span style="color: red ">*</span>
                            <sf:input type="text" class="form-control" id="exampleFormControlInput4" redname="mauSac"
                                      path="mauSac"/>
                            <sf:errors path="mauSac" cssStyle="color: red"></sf:errors>
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput5" class="form-label">Nhà Sản Xuất</label>
                            <sf:input type="text" class="form-control" id="exampleFormControlInput5" redname="nhaSanXuat"
                                      path="nhaSanXuat"/>
                            <sf:errors path="nhaSanXuat" cssStyle="color: red"></sf:errors>
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput10" class="form-label">Năm bảo hành</label>
                            <span style="color: red ">*</span>
                            <sf:input type="number" class="form-control" id="exampleFormControlInput10" redname="namBH"
                                      path="namBH"/>
                            <sf:errors path="namBH" cssStyle="color: red"></sf:errors>
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput6" class="form-label">Mô tả</label>
                            <span style="color: red ">*</span>
                            <sf:input type="text" class="form-control" id="exampleFormControlInput6" redname="moTa"
                                      path="moTa"/>
                            <sf:errors path="moTa" cssStyle="color: red"></sf:errors>
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput7" class="form-label">Số lượng tồn</label>
                            <span style="color: red ">*</span>
                            <sf:input type="number" class="form-control" id="exampleFormControlInput7" redname="soLuongTon"
                                      path="soLuongTon"/>
                            <sf:errors path="soLuongTon" cssStyle="color: red"></sf:errors>
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput8" class="form-label">Giá Nhập</label>
                            <span style="color: red ">*</span>
                            <sf:input type="text" class="form-control" id="exampleFormControlInput8" redname="giaNhap"
                                      path="giaNhap"/>
                            <sf:errors path="giaNhap" cssStyle="color: red"></sf:errors>
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput9" class="form-label">Giá bán</label>
                            <span style="color: red ">*</span>
                            <sf:input type="text" class="form-control" id="exampleFormControlInput9" redname="giaBan"
                                      path="giaBan"/>
                            <sf:errors path="giaBan" cssStyle="color: red"></sf:errors>
                        </div>


                        <div>
                            <button>Submit</button>
                        </div>
                    </sf:form>
                </div>
            </div>
        </div>
        <div class="col-3 my-3">
            <div class="card" style="width: 18rem;">
                <ul class="list-group list-group-flush">
                    <li class="list-group-item"><a href="http://localhost:8080/khach-hang/index"> Khách hàng</a></li>
                    <li class="list-group-item"><a href="http://localhost:8080/nhan-vien/index"> Nhân viên</a></li>
                    <li class="list-group-item"><a href="http://localhost:8080/cua-hang/index"> Cửa hàng</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>


</body>
</html>