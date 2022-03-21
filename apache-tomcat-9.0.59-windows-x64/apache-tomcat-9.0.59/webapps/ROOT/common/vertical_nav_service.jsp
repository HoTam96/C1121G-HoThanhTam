<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 3/18/2022
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 3/18/2022
  Time: 12:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="col-lg-3 col-md-3 col-sm-3">

    <!-- Vertical navbar -->
    <div class="vertical-nav bg-white" id="sidebar">
        <div class="py-4 px-3 mb-4 bg-light">
            <div class="media d-flex align-items-center"><img src="https://scontent.fsgn2-5.fna.fbcdn.net/v/t1.6435-9/80794050_2518549658421928_3313638586795950080_n.jpg?_nc_cat=104&ccb=1-5&_nc_sid=8bfeb9&_nc_ohc=UwmhFreGrT4AX-DJInD&_nc_ht=scontent.fsgn2-5.fna&oh=00_AT97yCYuOiEHHan0fLos2NPbkgvKSac0ITUYUh1IEn8bHg&oe=62585CC2" alt="..." width="65" class="mr-3 rounded-circle img-thumbnail shadow-sm">
                <div class="media-body">
                    <h4 class="m-0">Tâm Hồ</h4>
                    <p class="font-weight-light text-muted mb-0">SUPPER Man</p>
                </div>
            </div>
        </div>

        <p class="text-gray font-weight-bold text-uppercase px-3 small pb-4 mb-0"> Bạn đang tương tác với service</p>

        <ul class="nav flex-column bg-white mb-0">
            <li class="nav-item">
                <a href="../HomPageFurama.jsp?" class="nav-link text-dark font-italic bg-light">
                    <i class="fa fa-th-large mr-3 text-primary fa-fw"></i>
                    Home
                </a>
            </li>


            <li class="nav-item dropdown nav-item">
                <a class="fa fa-address-card text-primary mr-3 nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Create
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <c:forEach var="i" items="${serviceType}">
                            <li><a class="dropdown-item" href="Service?action=create&id=${i.getServiceTypeId()}">${i.getServiceName()}</a></li>
                    </c:forEach>

                </ul>
            </li>


            <li class="nav-item">
                <a href="https://www.facebook.com/tam.hothanh.77/" target="_blank" class="nav-link text-dark font-italic">
                    <i class="fa fa-cubes mr-3 text-primary fa-fw"></i>
                    FaceBook
                </a>
            </li>
            <li class="nav-item">
                <a href="https://www.youtube.com/channel/UCqX-IRaFWD37Q8dGev2jJpA" target="_blank" class="nav-link text-dark font-italic">
                    <i class="fa fa-cubes mr-3 text-primary fa-fw"></i>
                    Youtobe
                </a>
            </li>

        </ul>

        <p class="text-gray font-weight-bold text-uppercase px-3 small py-4 mb-0">Charts</p>

        <ul class="nav flex-column bg-white mb-0">
            <li class="nav-item">
                <a href="https://www.facebook.com/Review-phim-111300914535483" class="nav-link text-dark font-italic">
                    <i class="fa fa-area-chart mr-3 text-primary fa-fw"></i>
                    Message
                </a>
            </li>
            <li class="nav-item">
                <a href="#" class="nav-link text-dark font-italic">
                    <i class="fa fa-bar-chart mr-3 text-primary fa-fw"></i>
                    Zalo
                </a>
            </li>
            <li class="nav-item">
                <a href="#" class="nav-link text-dark font-italic">
                    <i class="fa fa-pie-chart mr-3 text-primary fa-fw"></i>
                    Bản đồ
                </a>
            </li>
            <li class="nav-item">
                <a href="#" class="nav-link text-dark font-italic">
                    <i class="fa fa-line-chart mr-3 text-primary fa-fw"></i>
                    biểu đồ
                </a>
            </li>
        </ul>
    </div>
    <!-- End vertical navbar -->


    <!-- Page content holder -->

    <!-- End demo content -->





</div>
