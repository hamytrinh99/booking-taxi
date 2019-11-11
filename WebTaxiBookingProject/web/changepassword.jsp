<%-- 
    Document   : register
    Created on : Oct 17, 2019, 2:43:04 PM
    Author     : Dell
--%>

<%@page import="model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- LINEARICONS -->
        <link rel="stylesheet" href="fonts/linearicons/style.css">

        <!-- STYLE CSS -->
        <link rel="stylesheet" href="css/register.css">
        <style>
            body {
                background-image:  url(img/bg.jpg);
                background-size: cover;
                position: relative;
            }
        </style>
        
        <%
            Account a = (Account) session.getAttribute("account");
        %>
    </head>

    <body>
        <div class="wrapper">
            <div class="inner">
                <img src="img/re1.png" alt="" class="image-1">
                <form action="changepass" method="post"> 

                    <h3> <a href="home_customer.jsp">Back to Home</a> </h3>
                    <h3>Change password</h3>
                    <% if (request.getAttribute("error") != null) {%>
                    <H2 style="color: red"> 
                        <%=request.getAttribute("error")%>   
                    </H2>
                    <% }
                    %>
                    <div class="form-holder">
                        <span class="lnr lnr-user"></span>
                        <input type="text" name="username" class="form-control" placeholder="Username"  required>
                    </div>

                    <div class="form-holder">
                        <span class="lnr lnr-lock"></span>
                        <input type="password" name="oldpassword" class="form-control" placeholder="Old Password"  required="">
                    </div>

                    <div class="form-holder">
                        <span class="lnr lnr-lock"></span>
                        <input type="password" name="newpassword" class="form-control" placeholder="New Password"  required="">
                    </div>
                    <div class="form-holder">
                        <span class="lnr lnr-lock"></span>
                        <input type="password" name="repass" class="form-control" placeholder="Confirm New Password"  required="">
                    </div>
                    
                    <button type='submit'> Change Password </button>

                </form>
                <img src="img/re2.png" alt="" class="image-2">

            </div>
        </div>
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>