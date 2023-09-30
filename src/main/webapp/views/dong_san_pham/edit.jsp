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
    <title>Nhà Sản Xuất</title>
</head>
<body>
<div class="container">

    <div class="row">
        <div class="col-3"></div>
        <div class="col-6">
            <div class="card my-3 ">
                <div style="text-align: center">
                    <h3>Sửa Dòng sản phẩm</h3>
                </div>
                <div class="card-body">
                    <sf:form action="/dong-san-pham/update/${ma}" method="POST" modelAttribute="dsp">

                        <div class="mb-3">
                            <label for="exampleFormControlInput1" class="form-label">Mã</label>
                            <span style="color: red ">*</span>
                            <sf:input type="text" class="form-control" id="exampleFormControlInput1" redname="ma" path="ma"/>
                            <sf:errors path="ma" cssStyle="color: red"></sf:errors>
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput4" class="form-label">Tên</label>
                            <span style="color: red ">*</span>
                            <sf:input type="text" class="form-control" id="exampleFormControlInput4" redname="ten" path="ten"/>
                            <sf:errors path="ten" cssStyle="color: red"></sf:errors>
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