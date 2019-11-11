<%-- 
    Document   : login
    Created on : Oct 17, 2019, 1:06:03 AM
    Author     : Dell
--%>

<%@page import="model.Account"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title> Login Form</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link href="css/login.css" rel="stylesheet" type="text/css" media="all" />

        <link href="//fonts.googleapis.com/css?family=Cormorant+SC:300,400,500,600,700" rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>

        <%
            Account a = (Account) session.getAttribute("account");
        %>
    </head>

    <body>
        <div id="logo">
            <h2> <a href="start.jsp">Home</a> </h2>
        </div>
        <div class="padding-all">
            <div class="header">
                <h1>Login Form</h1>
            </div>

            <div class="design-w3l">
                <div class="mail-form-agile">

                    
                    
                    <form action="login" method="post">
                        
                        <div>
                        <% if (request.getAttribute("mess") != null) {%>
                        <h4 style="color: red"> 
                            <%= request.getAttribute("mess")%>    
                        </h4>
                        <% }
                        %>
                    </div>
                    
                        <input type="text" name="username" placeholder="User Name  or  email..." required=""/>
                        <input type="password"  name="password" class="padding" placeholder="Password" required=""/>
                        <p>You do not have account. Please do <a href="register.jsp">register.</a></p><br>
                        <input type='submit' value='Login'>
                    </form>
                </div>
                <div class="clear"> </div>
            </div>

            <div class="footer">
                <p>© 2019  Login form. Design by  <a href="#" >  HaMyTrinh </a></p>
            </div>
        </div>
    </body>
</html>
