<%-- 
    Document   : start
    Created on : Oct 16, 2019, 12:04:02 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>MiMi Taxi | Home :: he130054</title>

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta charset="utf-8">
        <!-- css files -->
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' /><!-- bootstrap css -->
        <link href="css/style.css" rel='stylesheet' type='text/css' /><!-- custom css -->
        <link href="css/font-awesome.min.css" rel="stylesheet"><!-- fontawesome css -->
        <!-- //css files -->

        <!-- google fonts -->
        <link href="//fonts.googleapis.com/css?family=Rosario:400,400i,700,700i" rel="stylesheet">
        <!-- //google fonts -->

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>

    </head>

    <body>

        <jsp:include page = "header.jsp"/>

        <!--banner-->
        <section class="banner w3pvt-banner" id="home">
            <div class="container">
                <div class="banner-text">
                    <div class="slider-info">
                        <div class="w3pvt-logo">
                            <h2>MORE THAN JUST AN AIRPORT TAXI</h2>
                            <h3>+84 384631607</h3>
                            <p class="mt-3"> Always Available, Best Cabs, Safe Journey.</p>
                            <img src="img/cab.png" alt="" class="img-fluid mt-md-5" />
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- booking -->
        <section class="about py-sm-5 py-4" id="booking">
            <div class="container py-lg-5">
                <div class="row about-grids">

                    <div class="col-lg-4 col-md-6 mt-lg-0 mt-4">
                        <div class="padding">
                            <form action="#" method="post">
                                <h5 class="mb-3">Book A Cab Now</h5>
                                <div class="form-style-agile">
                                    <input placeholder="Customer Name" name="name" type="text" required=""><br>
                                    <input placeholder="Phone Number" name="phone" type="text" required=""><br>
                                    <p>Pickup Location:</p> <br>
                                    <input value="NoiBaiAirport" type="text" name="pickup" disabled><br>

                                    <p>Drop Location: </p><br>
                                    <select>    
                                        <option value="hoankiem">Hoan Kiem</option>
                                        <option value="haibatrung">Hai Ba Trung</option>
                                        <option value="longbien">Long Bien</option>
                                        <option value="hoangmai">Hoang Mai</option>
                                    </select><br>
                                    <input type="button" name="reverse" value="Reverse location" action="on"><br>

                                    <input placeholder="Detail Address" type="text" required=""> <br>
                                    <input placeholder="Date to go" type="date" required="">
                                    <input placeholder="Time to go" type="time" required=""><br>

                                    <!--<input placeholder="Password" name="password" type="password" required=""> -->

                                    <button class="book-btn btn" type="reset" value="Reset">Reset</button> <br>

                                    <button class="book-btn btn" type="submit" value="Book now">Book now</button>

                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="col-md-6 mt-4">
                        <h4>Best cabs available</h4><br>
                        <h2>More than just an AIRPORT TAXI</h2><BR>
                        <h3>Booking online or call hotline: (+84)38 631 607</h3>
                        <video src="vid/taxibean.mp4" width="750" height="600" controls></video>
                    </div>
                </div>
            </div>
        </section>

        <!-- //what we do -->
        <section class="services py-5" id="services">
            <div class="container py-lg-5 py-3">
                <div class="row service-grid-grids text-center">
                    <div class="col-lg-4 col-md-6 service-grid service-grid1">
                        <div class="service-icon">
                            <span class="fa fa-car"></span>
                        </div>
                        <h4 class="mt-3">Fast and Safe</h4>
                        <p class="mt-3">100% NO Accident!</p>
                    </div>
                    <div class="col-lg-4 col-md-6 service-grid service-grid2 mt-md-0 mt-5">
                        <div class="service-icon">
                            <span class="fa fa-user"></span>
                        </div>
                        <h4 class="mt-3">Experienced Drivers</h4>
                        <p class="mt-3">20 Years Experienced!</p>
                    </div>

                    <div class="col-lg-4 col-md-6 service-grid service-grid3 mt-lg-0 mt-5">
                        <div class="service-icon">
                            <span class="fa fa-paper-plane"></span>
                        </div>
                        <h4 class="mt-3">Online Booking</h4>
                        <p class="mt-3">Just take 5 minutes - Easy for booking - Anywhere - Anytime!</p>
                    </div>
                    <div class="col-lg-4 col-md-6 service-grid service-grid4 mt-5">
                        <div class="service-icon">
                            <span class="fa fa-search"></span>
                        </div>
                        <h4 class="mt-3">GPS Searching</h4>
                        <p class="mt-3">Follow your jouney with GPS everywhere. </p>
                    </div>
                    <div class="col-lg-4 col-md-6 service-grid service-grid4 mt-5">
                        <div class="service-icon">
                            <span class="fa fa-car"></span>
                        </div>
                        <h4 class="mt-3">Best car ever</h4>
                        <p class="mt-3">Our Vehicle is TOP 10 the most expensive and luxury cars in the world!</p>
                    </div>
                    <div class="col-lg-4 col-md-6 service-grid service-grid6 mt-5">
                        <div class="service-icon">
                            <span class="fa fa-cogs"></span>
                        </div>
                        <h4 class="mt-3">Friendly</h4>
                        <p class="mt-3">We are your friend and your protector. Believe in MiMi Taxi!</p>
                    </div>

                </div>
            </div>
        </section>

        <!-- vehicle -->
        <section class="tarrifs py-5" id="vehicle">
            <div class="container py-md-5">
                <div class="row tarrifs-grid">
                    <div class="col-lg-4 col-md-6 text-center">
                        <img src="img/c04.jpg" alt="" class="img-fluid" />
                        <div class="tarrif-info">
                            <h4 class="my-3">4-SEATS</h4>
                            <p class="para_vl">Nam arcu mauris, tincidunt sed convallis non, egestas ut lacus. Cras sapien
                                urna, malesuada ut varius.</p>
                            <h5 class="mt-sm-3 mt-2">16.000VND/Km</h5>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 text-center">
                        <img src="img/c06.jpg" alt="" class="img-fluid" />
                        <div class="tarrif-info">
                            <h4 class="my-3">7-SEATS</h4>
                            <p class="para_vl">Nam arcu mauris, tincidunt sed convallis non, egestas ut lacus. Cras sapien
                                urna, malesuada ut varius.</p>
                            <h5 class="mt-sm-3 mt-2">20.000VND/Km</h5>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 text-center mt-lg-0 mt-5">
                        <img src="img/c08.jpg" alt="" class="img-fluid" />
                        <div class="tarrif-info">
                            <h4 class="my-3">16-SEATS</h4>
                            <p class="para_vl">Nam arcu mauris, tincidunt sed convallis non, egestas ut lacus. Cras sapien
                                urna, malesuada ut varius.</p>
                            <h5 class="mt-sm-3 mt-2">25.000VND/Km</h5>
                        </div>
                    </div>
                </div>
                <div></div>
                <button class="book-btn btn" type="submit" value="vehicle">Click here to show detail all vehicle</button>
            </div>
        </section>

        <!-- stats -->
        <section class="stats py-5" id="stats">
            <div class="container py-sm-3">
                <div class="row">
                    <div class="col-sm-4 col-6 text-center">
                        <span class="fa mr-1 fa-users"></span>
                        <h4>10,000+</h4>
                        <p>Passengers</p>
                    </div>
                    <div class="col-sm-4 col-6 text-center">
                        <span class="fa mr-1 fa-car"></span>
                        <h4>1200</h4>
                        <p>Cab Drivers</p>
                    </div>
                    <div class="col-sm-4 col-6 mt-sm-0 mt-4 text-center">
                        <span class="fa mr-1 fa-map"></span>
                        <h4>500</h4>
                        <p>Cab Routes</p>
                    </div>
                </div>
            </div>
        </section>
        <!-- //stats -->

        <jsp:include page = "footer.jsp"/>

    </body>
</html>