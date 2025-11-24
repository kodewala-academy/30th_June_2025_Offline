<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MMT Profile - Success</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: #f0f4ff;
        margin: 0;
        padding: 0;
    }
    .container {
        width: 450px;
        margin: 70px auto;
        background: #fff;
        padding: 25px;
        border-radius: 12px;
        box-shadow: 0 0 12px rgba(0,0,0,0.15);
        text-align: center;
    }
    h2 {
        color: #0077ff;
    }
    .success {
        font-size: 18px;
        margin-top: 15px;
        color: #444;
    }
    .features {
        margin-top: 30px;
        text-align: left;
    }
    .features h3 {
        color: #0077ff;
        margin-bottom: 10px;
    }
    .features ul {
        list-style: none;
        padding: 0;
    }
    .features ul li {
        background: #e9f2ff;
        padding: 10px;
        margin: 5px 0;
        border-radius: 8px;
    }
</style>
</head>
<body>

<div class="container">
    <h2>Profile Created Successfully!</h2>

    <p class="success">Your User ID is: <strong>${userID}</strong></p>

    <div class="features">
        <h3>Explore MMT Features:</h3>
        <ul>
            <li>✈️ Book Flights (Domestic & International)</li>
            <li>🏨 Hotels & Stays at Best Prices</li>
            <li>🚆 Train Bookings</li>
            <li>🚕 Cab & Outstation Rides</li>
            <li>🎒 Holiday Packages & Travel Deals</li>
        </ul>
    </div>
</div>

</body>
</html>
