<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MakeMyTrip - Create Profile</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #1e3c72, #2a5298);
        margin: 0;
        padding: 0;
        color: white;
        text-align: center;
    }

    .container {
        margin-top: 120px;
    }

    h2 {
        font-size: 32px;
        font-weight: 600;
        margin-bottom: 20px;
    }

    a.button {
        background-color: #ff6f00;
        padding: 12px 25px;
        font-size: 18px;
        text-decoration: none;
        color: white;
        border-radius: 30px;
        transition: 0.3s;
    }

    a.button:hover {
        background-color: #e65c00;
    }

    .card {
        margin: auto;
        background: white;
        color: #333;
        width: 380px;
        padding: 40px 30px;
        border-radius: 12px;
        box-shadow: 0px 8px 20px rgba(0,0,0,0.25);
    }

</style>
</head>

<body>

<div class="container">

    <div class="card">
        <h2>Welcome to MakeMyTrip!</h2>
        <p>Create your travel profile in just one click.</p>
        <a href="showProfilePage" class="button">Create Profile</a>
    </div>

</div>

</body>
</html>
