<%-- 
    Document   : register
    Created on : Oct 17, 2019, 2:43:04 PM
    Author     : Dell
--%>

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
    </head>

    <body>
        <div class="wrapper">
            <div class="inner">
                <img src="img/re1.png" alt="" class="image-1">
                <form action="">                 
                        <h3> <a href="start.jsp">Back to Home</a> </h3>
                    <h3>Create a New Account</h3>
                    <div class="form-holder">
                        <span class="lnr lnr-user"></span>
                        <input type="text" name="username" class="form-control" placeholder="Username" pattern="^[^0-9]+$" required>
                    </div>
                    <div class="form-holder">
                        <span class="lnr lnr-users"></span>
                        <input type="text" name="fullname" class="form-control" placeholder="Fullname" pattern="^[^0-9]+$" required>
                    </div>

                    <div class="form-holder">
                        <span class="lnr lnr-heart"></span>
                        <div class="row">
                            <div class="input-field col s6">
                                <div class="gender-male">
                                    <input class="with-gap" name="gender" type="radio" id="male" required />
                                    <label for="male">Male</label>
                                </div>
                                <div class="gender-female">
                                    <input class="with-gap" name="gender" type="radio" id="female" required />
                                    <label for="female">Female</label>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="form-holder ">
                        <span class="lnr lnr-clock"></span>
                        <input type="date" name="dob" class="form-control" placeholder="Date of birth" required="">
                    </div>

                    <div class="form-holder">
                        <span class="lnr lnr-phone-handset"></span>
                        <input type="text" name="phone" class="form-control" placeholder="Phone Number" required="">
                    </div>
                    <div class="form-holder">
                        <span class="lnr lnr-envelope"></span>
                        <input type="text" name="mail" class="form-control" placeholder="Mail" pattern="^(.+)@(.+)$" required>
                    </div>
                    <div class="form-holder">
                        <span class="lnr lnr-lock"></span>
                        <input type="password" name="password" class="form-control" placeholder="Password"  required="">
                    </div>
                    <div class="form-holder">
                        <span class="lnr lnr-lock"></span>
                        <input type="password" class="form-control" placeholder="Confirm Password"  required="">
                    </div>
                    <button>
                        <span>Register</span>
                    </button>

                </form>
                <img src="img/re2.png" alt="" class="image-2">

            </div>
        </div>
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>