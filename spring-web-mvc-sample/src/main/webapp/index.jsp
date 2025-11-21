<!DOCTYPE html>
<html>
<head>
    <title>Zepto Login Page</title>

    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #FF5F6D, #FFC371);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .container {
            text-align: center;
            background: #ffffff;
            padding: 40px;
            width: 350px;
            border-radius: 15px;
            box-shadow: 0px 0px 20px rgba(0,0,0,0.15);
        }

        h2 {
            color: #333;
            margin-bottom: 25px;
        }

        a {
            display: inline-block;
            text-decoration: none;
            background: #FF5F6D;
            color: white;
            padding: 12px 25px;
            border-radius: 8px;
            font-size: 16px;
            transition: 0.3s;
        }

        a:hover {
            background: #e94555;
        }
    </style>
</head>

<body>

    <div class="container">
        <h2>Zepto Login Page</h2>
        <a href="login">Login</a>
    </div>
    
    <div class="container">
        <h2>Zepto Logout Page</h2>
        <a href="logout">Logout</a>
    </div>

</body>
</html>
