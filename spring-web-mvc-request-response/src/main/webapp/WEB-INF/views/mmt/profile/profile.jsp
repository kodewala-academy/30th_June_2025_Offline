<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MMT - Create Profile</title>

<!-- Simple Inline Styling -->
<style>
    body {
        font-family: Arial, sans-serif;
        background: #f2f6ff;
        margin: 0;
        padding: 0;
    }

    .container {
        width: 400px;
        margin: 60px auto;
        background: #ffffff;
        padding: 30px 40px;
        border-radius: 12px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.15);
    }

    h2 {
        text-align: center;
        color: #0b5ed7;
        margin-bottom: 25px;
    }

    label {
        font-weight: bold;
        color: #333;
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin-top: 6px;
        margin-bottom: 16px;
        border: 1px solid #ccc;
        border-radius: 6px;
        font-size: 14px;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background: #ff4d6d;
        color: white;
        border: none;
        border-radius: 6px;
        font-size: 16px;
        cursor: pointer;
        font-weight: bold;
    }

    input[type="submit"]:hover {
        background: #e63950;
    }
</style>

</head>
<body>

<div class="container">
    <h2>Create Your MMT Profile</h2>

    <form action="createProfile" method="post">

        <label>First Name</label>
        <input type="text" name="firstName" required>

        <label>Last Name</label>
        <input type="text" name="lastName" required>

        <label>Email</label>
        <input type="text" name="email" required>

        <label>Mobile</label>
        <input type="text" name="mobile" required>

        <input type="submit" value="Create Profile">
    </form>
</div>

</body>
</html>
