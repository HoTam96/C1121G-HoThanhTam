<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 3/18/2022
  Time: 12:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<section>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container">
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01"
                    aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse menu-bar-1" id="navbarTogglerDemo01 ">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0 menu-bar top-bar-top ">
                    <li class="nav-item">
                        <a class="nav-link" aria-current="page" href="../HomPageFurama.jsp?">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" aria-current="page" href="Employee?">Employee</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="/Customer">Customer</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/Service">Service</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/Contract">Contract</a>
                    </li>

                </ul>
                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
</section>
