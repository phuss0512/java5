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
    <title>Cửa Hàng</title>
</head>
<body>
<div class="container">

    <div class="row">
        <div class="col-3"></div>
        <div class="col-6">
            <div class="card my-3 ">
                <div style="text-align: center">
                    <h3>Thêm Cửa Hàng</h3>
                </div>
                <div class="card-body">
                    <sf:form action="/cua-hang/store" method="POST" modelAttribute="ch">

                        <div class="mb-3">
                            <label for="exampleFormControlInput1" class="form-label">Mã</label>
                            <span style="color: red ">*</span>
                            <sf:input type="text" class="form-control" id="exampleFormControlInput1" redname="ma"
                                      path="ma"/>
                            <sf:errors path="ma" cssStyle="color: red"></sf:errors>
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput4" class="form-label">Tên</label>
                            <span style="color: red ">*</span>
                            <sf:input type="text" class="form-control" id="exampleFormControlInput4" redname="ten"
                                      path="ten"/>
                            <sf:errors path="ten" cssStyle="color: red"></sf:errors>
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput6" class="form-label">Địa chỉ</label>
                            <span style="color: red ">*</span>
                            <sf:input type="text" class="form-control" id="exampleFormControlInput6" redname="diaChi"
                                      path="diaChi"/>
                            <sf:errors path="diaChi" cssStyle="color: red"></sf:errors>
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput7" class="form-label">Thành phố</label>
                            <span style="color: red ">*</span>
                            <sf:input type="text" class="form-control" id="exampleFormControlInput7" redname="thanhPho"
                                      path="thanhPho"/>
                            <sf:errors path="thanhPho" cssStyle="color: red"></sf:errors>
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput8" class="form-label">Quốc gia</label>
                            <span style="color: red ">*</span>
                            <sf:input type="text" class="form-control" id="exampleFormControlInput8" redname="quocGia"
                                      path="quocGia"/>
                            <sf:errors path="quocGia" cssStyle="color: red"></sf:errors>
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