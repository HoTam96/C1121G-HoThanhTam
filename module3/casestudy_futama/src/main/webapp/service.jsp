<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 3/18/2022
  Time: 12:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>


    <jsp:include page="link.jsp"></jsp:include>

</head>
<body>
<jsp:include page="common/header.jsp"></jsp:include>
<jsp:include page="common/menu_bar_service.jsp"></jsp:include>
<section class="main">
    <div class="container-fluid">
        <div class="row main-main">
            <jsp:include page="common/vertical_nav_service.jsp"></jsp:include>

            <div class="col-lg-9 col-md-9 col-sm-12 table-responsive">
                <table id="example" class="table table-striped">
                    <thead>

                    <tr>
                        <th>Service Id</th>
                        <th>Service Name</th>
                        <th>Area</th>
                        <th>Rental Cost</th>
                        <th>People Max</th>
                        <th>Standard Room</th>
                        <th>Description other</th>
                        <th>area Pool/th>
                        <th>Number floor</th>
                        <th>Type rent</th>
                        <th>Type service</th>

                    </tr>
                    </thead>
                    <tody>
                        <c:forEach var="i" items="${service}">
                            <tr>
                                <td>${i.serviceId}</td>
                                <td>${i.serviceName}</td>
                                <td>${i.serviceArea}</td>
                                <td>${i.rentalCost}</td>
                                <td>${i.peopleMax}</td>
                                <td>${i.standardRoom}</td>
                                <td>${i.descriptionOther}</td>
                                <td>
                                    <c:if test="${i.areaPool==0}">
                                        none
                                    </c:if>
                                    <c:if test="${i.areaPool!=0}">
                                        ${i.areaPool}
                                    </c:if>
                                </td>
                                <td>
                                    <c:if test="${i.numberFloor==0}">
                                        none
                                    </c:if>
                                    <c:if test="${i.numberFloor!=0}">
                                        ${i.numberFloor}
                                    </c:if>
                                </td>

                                <td>${i.renTypeId.getRentTypeName()}</td>
                                <td>${i.serviceTypeId.getServiceName()}</td>
                                <td>
                                    <button type="button" class="btn btn-primary" data-bs-toggle="modal"><a
                                            href="Customer?action=edit&id=${i.serviceId}">edit</a>Edit
                                    </button>

                                    <button type="button" class="btn btn-primary" data-bs-toggle="modal"
                                            onclick="getId(${i.serviceId})"
                                            data-bs-target="#exampleModal">
                                        delete
                                    </button>
                                </td>
                            </tr>
                        </c:forEach>
                    </tody>
                </table>
            </div>
        </div>
    </div>

</section>


<%--        modal--%>

<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <form method="post" action="Customer?action=delete">
                <input name="id" id="idDelete">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">bạn có muốn người này ra khỏi danh sách
                        ? </h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal"
                            aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    Yes or No
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">
                        Close
                    </button>
                    <button type="submit" class="btn btn-primary">ok</button>
                </div>
            </form>
        </div>
    </div>
</div>
<jsp:include page="common/footer.jsp"></jsp:include>


</body>


<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap4.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<jsp:include page="script.jsp"></jsp:include>
<script>
    $.extend(true, $.fn.dataTable.defaults, {
        "searching": false,
        "ordering": false
    });
    $(document).ready(function () {
        $('#example').DataTable({
            "lengthMenu": [[5, 10, 15, -1], [5, 10, 15, "All"]]
        });
    });
</script>
<script>
    function getId(id) {
        document.getElementById("idDelete").value = id;
    }

</script>

<!-- JavaScript Bundle with Popper -->
</html>

