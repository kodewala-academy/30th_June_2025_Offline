<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login - E-Shop</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #4a90e2, #50c9c3);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .login-container {
        background: white;
        padding: 40px 30px;
        border-radius: 12px;
        width: 350px;
        box-shadow: 0 5px 20px rgba(0,0,0,0.2);
        text-align: center;
    }

    .login-container h2 {
        margin-bottom: 20px;
        color: #4a90e2;
        font-size: 28px;
    }

    input[type="text"], input[type="password"] {
        width: 90%;
        padding: 12px;
        margin: 10px 0;
        border-radius: 8px;
        border: 1px solid #aaa;
        font-size: 16px;
        outline: none;
        transition: 0.3s;
    }

    input[type="text"]:focus, input[type="password"]:focus {
        border-color: #4a90e2;
        box-shadow: 0 0 5px rgba(74,144,226,0.5);
    }

    .btn-login {
        background: #4a90e2;
        border: none;
        padding: 12px;
        color: white;
        width: 95%;
        font-size: 18px;
        border-radius: 8px;
        cursor: pointer;
        margin-top: 15px;
        transition: 0.3s;
    }

    .btn-login:hover {
        background: #3a78c2;
    }

    .footer-text {
        margin-top: 15px;
        font-size: 14px;
        color: #555;
    }
</style>
</head>

<body>

    <div class="login-container">
        <h2>Login</h2>

        <form action="validateLogin" method="post">
            <input type="text" name="userName" placeholder="Enter Username" required />

            <input type="password" name="password" placeholder="Enter Password" required />

            <input type="submit" value="Login" class="btn-login">
        </form>

        <p class="footer-text">Welcome to E-Shop 👋</p>
    </div>

</body>
</html>
