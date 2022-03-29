<%--
  Created by IntelliJ IDEA.
  User: truongtrinhkhai
  Date: 22/03/2022
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Bootstrap CRUD Data Table for Database with Modal Form</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="container-fluid-xl">
    <div class="table-responsive">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-6">
                        <h2>Manage <b>DANH SÁCH SÁCH</b></h2>
                    </div>
                    <div class="col-sm-6">
                        <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>mượn</span></a>
                    </div>
                </div>
                <div class="row">
                    <form method="get">
                        <br/>
                        <input type="hidden" name="action" value="search">
                        <input type="text" name="search_by_name" size="25" placeholder="Enter Book Name">
<%--                        <input type="text" name="search_by_price" size="25" placeholder="Enter Price">--%>
<%--                        <input type="text" name="search_by_color" size="25" placeholder="Enter Color">--%>
<%--                        <input type="text" name="search_by_category" size="25" placeholder="Enter Category">--%>
                        <input type="submit" value="tìm kiếm">
                    </form>
                </div>
            </div>
            <table class="table table-striped table-hover" id="example">
                <thead>
                <tr>
                    <th>Mã sách</th>
                    <th>Tên Sách</th>
                    <th>Tác Gia</th>
                    <th>Mô Tả</th>
                    <th>Số Lượng</th>
                    <th>Actions</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="i" items="${list}">
                    <tr>
                        <td>${i.maSach}</td>
                        <td>${i.tenSach}</td>
                        <td>${i.tacGia}</td>
                        <td>${i.moTa}</td>
                        <td>${i.so_luong}</td>
                        <td>
                            <a href="sach?action=create">mượn sách</a>
<%--                            <a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit" onclick='sendProductInfor("${benhAn.maBenhNhan}", "${benhAn.tenBenhNhan}", "${benhAn.ngayNhapVien}", "${benhAn.ngayRaVien}", "${benhAn.liDo}", "${benhAn.getMaBenhAn().getMaBenhAn()}")'>&#xE254;</i></a>--%>
<%--                            <a  href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete" onclick='sendProductId("${benhAn.maBenhNhan}")'>&#xE872;</i></a>--%>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
<%--            phân trang--%>
<%--            <div class="clearfix">--%>
<%--                <div class="hint-text">Showing <b>5</b> out of <b>25</b> entries</div>--%>
<%--                <ul class="pagination">--%>
<%--                    <li class="page-item disabled"><a href="product?index=${index-1}">Previous</a></li>--%>
<%--&lt;%&ndash;                    <c:forEach begin="1" end="${endPage}" var="i">&ndash;%&gt;--%>
<%--&lt;%&ndash;                        <li class="page-item"><a href="product?index=${i}" class="page-link">${i}</a></li>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    </c:forEach>&ndash;%&gt;--%>
<%--                    <li class="page-item"><a href="product?index=${index+1}" class="page-link">Next</a></li>--%>


<%--                </ul>--%>
<%--            </div>--%>
        </div>
    </div>
</div>







<!-- tạo mới  Modal HTML -->
<div id="addEmployeeModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form method="post" action="sach?action=create" class="needs-validation" novalidate>
                <div class="modal-header">
                    <h4 class="modal-title">Add Sách</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label>Tên sách</label>
<%--                        [A-Za-z0-9]+([A-Za-z0-9]+)*--%>
                        <input type="text" class="form-control" name="maBenhNhan" required pattern="^(BN-)\d{3}">
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">Name cannot have any extra spaces or no characters</div>
<%--                        <small class="error">hihi</small>--%>
                    </div>
                    <div class="form-group">
                        <label>ten Benh Nhan</label>
                        <input type="text" class="form-control" name="tenBenhNhan" required pattern="^[\p{Lu}\p{Ll}]+( [\p{Lu}\p{Ll}]+)*$">
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">Price must be greater than 0</div>
                    </div>
                    <div class="form-group">
                        <label>ngay Nhap Vien</label>
                        <input type="date" class="form-control" name="ngayNhapVien" required>
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">Quantity must be greater than 0</div>
                    </div>
                    <div class="form-group">
                        <label>ngay Ra Vien</label>
                        <input type="date" class="form-control" name="ngayRaVien" required>
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">Color cannot have any extra spaces or no characters</div>
                    </div>
<%--                    <div class="form-group">--%>
<%--                        <label>ma Benh An</label>--%>
<%--                        <select name="maBenhAn">--%>
<%--                            <c:forEach items="${categoryList}" var="category">--%>
<%--                                <option value="${category.getId()}">${category.getName()}</option>--%>
<%--                            </c:forEach>--%>
<%--                        </select>--%>
<%--                    </div>--%>

                    <div class="form-group">
                        <label>li Do</label>
                        <input type="text" class="form-control" name="liDo" required>
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">Color cannot have any extra spaces or no characters</div>
                    </div>
                    <div class="form-group">
                        <label>Ma Benh An</label>
                        <input type="text" class="form-control" name="maBenhAn" required pattern="^(BA-)\d{3}">
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">bệnh án cannot have any extra spaces or no characters</div>
                    </div>

                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-success" value="Add">
                </div>
            </form>
        </div>
    </div>
</div>




<!-- Edit Modal HTML -->
<div id="editEmployeeModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form method="post" action="/BenhNhan?action=edit">
                <input type="hidden" name="id_modal_edit" id="idEdit">
                <div class="modal-header">
                    <h4 class="modal-title">Edit BỆNH NHÂN</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label>tên bênh nhân</label>
                        <input type="text" class="form-control" name="name" required id="nameEdit" pattern="^[\p{Lu}\p{Ll}]+( [\p{Lu}\p{Ll}]+)*$">
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">Name cannot have any extra spaces or no characters</div>
                    </div>
                    <div class="form-group">
                        <label>ngày nhập viện</label>
                        <input type="date" class="form-control" name="startDade" required id="startDadeEdit">
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">Price must be greater than 0</div>
                    </div>
                    <div class="form-group">
                        <label>ngày ra viênh</label>
                        <input type="date" class="form-control" name="endDade" required id="endDadeEdit">
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">Quantity must be greater than 0</div>
                    </div>
                    <div class="form-group">
                        <label>Lí Do</label>
                        <input type="text" class="form-control" name="liDo" required id="liDo">
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">li do cannot have any extra spaces or no characters</div>
                    </div>
                    <div class="form-group">
                        <label>mã bệnh án</label>
                        <input type="text" class="form-control" name="maBenhAn" required id="maBenhAnEdit" pattern="^(BA-)\d{3}$">
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">ma benh an cannot have any extra spaces or no characters</div>
                    </div>

<%--                    <div class="form-group">--%>
<%--                        <label>Category Name</label>--%>
<%--                        <select name="category_id" id="categoryNameEdit">--%>
<%--                            <c:forEach items="${categoryList}" var="category">--%>
<%--                                <option value="${category.getId()}" selected>${category.getName()}</option>--%>
<%--                            </c:forEach>--%>
<%--                        </select>--%>
<%--                        &lt;%&ndash;                        <input type="text" class="form-control" name="category_name" required>&ndash;%&gt;--%>
<%--                    </div>--%>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-info" value="Save">
                </div>
            </form>
        </div>
    </div>
</div>



<!-- Delete Modal HTML -->

<div id="deleteEmployeeModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form method="post" action="BenhNhan?action=delete">
                <input type="hidden" name="id_modal_delete" id="isDelete">
                <div class="modal-header">
                    <h4 class="modal-title">Delete Employee</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <p>Are you sure you want to delete these Records?</p>
                    <p class="text-warning"><small>This action cannot be undone.</small></p>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-danger" value="Delete">
                </div>
            </form>
        </div>
    </div>
</div>

</body>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>


<script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function(){
        // Activate tooltip
        $('[data-toggle="tooltip"]').tooltip();

        // Select/Deselect checkboxes
        var checkbox = $('table tbody input[type="checkbox"]');
        $("#selectAll").click(function(){
            if(this.checked){
                checkbox.each(function(){
                    this.checked = true;
                });
            } else{
                checkbox.each(function(){
                    this.checked = false;
                });
            }
        });
        checkbox.click(function(){
            if(!this.checked){
                $("#selectAll").prop("checked", false);
            }
        });
    });

    function sendProductInfor(id, name, ngayNhapVien, ngayRaVien, liDo, maBenhAn) {
        document.getElementById('idEdit').value = id;
        document.getElementById('nameEdit').value = name;
        document.getElementById('startDadeEdit').value = ngayNhapVien;
        document.getElementById('endDadeEdit').value = ngayRaVien;
        document.getElementById('liDo').value = liDo;
        document.getElementById('maBenhAnEdit').value = maBenhAn;
    }

    function sendProductId(id) {
        document.getElementById('isDelete').value = id;
    }

    // Disable form submissions if there are invalid fields
    (function() {
        'use strict';
        window.addEventListener('load', function() {
            // Get the forms we want to add validation styles to
            var forms = document.getElementsByClassName('needs-validation');
            // Loop over them and prevent submission
            var validation = Array.prototype.filter.call(forms, function(form) {
                form.addEventListener('submit', function(event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        }, false);
    })();
</script>
<%--code phân trang--%>
<script>
    $.extend( true, $.fn.dataTable.defaults, {
        "searching": false,
        "ordering": false
    } );
    $(document).ready(function() {
        $('#example').DataTable({
            "lengthMenu": [[5, 10, 15, -1], [5, 10, 15, "All"]]
        });
    } );
</script>


</html>
