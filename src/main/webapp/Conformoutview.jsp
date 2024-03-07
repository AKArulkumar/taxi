<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Booking Confirmation</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <style>
        /* Add your custom CSS here */
        /* This is just a simple example, you may adjust as needed */
        .navbar-nav li {
            margin: 0 10px;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">TAXI RESERVATION SYSTEM</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li><a href="homeview.html">Home</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="taxibookview.html">TAXI BOOKING</a></li>
            </ul>
             <ul class="nav navbar-nav navbar-right">
                <li><a href="Hourrentview.html">HOUR BOOKING</a></li>
            </ul>
             <ul class="nav navbar-nav navbar-right">
                <li><a href="logout .html">Logout</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container text-center">
    <h2>Booking Confirmation</h2>
    <div id="bookingDetails">
        <p>pickupLocation: <%= request.getAttribute("pickupLocationOutstation") %></p>
        <p>dropLocation  : <%= request.getAttribute("pickupLocationOutstation") %></p>
       
    </div>
</div>

</body>
</html>
