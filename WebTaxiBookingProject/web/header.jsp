

<%@page import="model.Account"%>
<%@page import="dal.DBContext"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/index.css" />
        <title>header</title>

        <%
            Account a = (Account) session.getAttribute("account");
        %>

    </head>
    <body >

        <!--header-->
        <header>
            <div class="container">
                <!--nav-->
                <nav class="py-sm-4 py-3 d-lg-flex ">
                    <div id="logo">
                        <h1> <a href="start.jsp"><span></span>MiMi Taxi</a> </h1>
                    </div>
                    <ul class="menu mt-md-2 ml-auto">
                        <li class="mr-lg-4 mr-2 active"><a href="start.jsp">Home</a></li>
                        <li class="mr-lg-4 mr-2"><a href="#booking">Booking</a></li>
                        <li class="mr-lg-4 mr-2"><a href="#about">About</a></li>   
                        <li class="mr-lg-4 mr-2"><a href="#vehicle">Vehicle</a></li>
                        <li class="mr-lg-4 mr-2"><a href="price.jsp">Price</a></li>

                        <li class="dropdown">


                            <form name="formLogin" action="LoginServlet" method="post">
                                <% if (session.getAttribute("account") == null) {%>
                                <script>
                                    function dieu_huong() {
                                        location.replace("register.jsp");
                                    }
                                </script>
                                <a class="mr-lg-4 mr-2" href="register.jsp" onclick="dieu_huong()">Register</a>
                                <a class="mr-lg-4 mr-2" href="login.jsp">Login</a>


                                <% } else {
                                %>
                                <img src="img/account.png" style="width: 40px; height: 40px">
                                <font size="4" color="white">&nbsp;<%=a.getUsername()%></font>
                                <%
                                    if (a.getTypeofAccount()== 1) {%>
                                <a href="management.jsp">Manage</a>
                                <%}%>
                                <p>My Account</p>
                                <div class="dropdown-content">
                                    <a href="customer_info.jsp"  target="home">Show Information</a>
                                    <a href="changepassword.jsp">Change Password</a>
                                    <a href="logout">Log Out</a>
                                </div>
                                <% }%>
                            </form>    
                        </li>

                    </ul>
                </nav>
            </div>
        </header>

    </body>
</html>
