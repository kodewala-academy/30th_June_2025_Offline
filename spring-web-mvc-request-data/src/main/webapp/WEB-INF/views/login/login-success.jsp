<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>E-Shop Landing Page</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: #f5f5f5;
    }

    /* Header */
    .header {
        background: #4a90e2;
        padding: 20px;
        color: white;
        text-align: center;
        font-size: 28px;
        font-weight: bold;
        letter-spacing: 1px;
        box-shadow: 0 2px 10px rgba(0,0,0,0.2);
    }

    /* Hero Section */
    .hero {
        background: linear-gradient(to right, #4a90e2, #50c9c3);
        padding: 80px 20px;
        text-align: center;
        color: white;
    }
    .hero h1 {
        font-size: 42px;
        margin-bottom: 10px;
    }
    .hero p {
        font-size: 20px;
        margin-bottom: 30px;
    }
    .btn {
        background: white;
        color: #4a90e2;
        padding: 14px 28px;
        text-decoration: none;
        font-size: 18px;
        border-radius: 8px;
        font-weight: bold;
        transition: 0.3s;
    }
    .btn:hover {
        background: #e6e6e6;
    }

    /* Products section */
    .products {
        display: flex;
        justify-content: center;
        gap: 25px;
        margin: 40px auto;
        width: 80%;
    }
    .card {
        background: white;
        border-radius: 12px;
        width: 250px;
        padding: 15px;
        text-align: center;
        box-shadow: 0 3px 10px rgba(0,0,0,0.15);
        transition: 0.3s;
    }
    .card:hover {
        transform: translateY(-5px);
    }
    .product-img {
        width: 100%;
        height: 180px;
        background: #ddd;
        border-radius: 10px;
        margin-bottom: 10px;
    }
    .price {
        color: #4a90e2;
        font-weight: bold;
        margin: 8px 0;
    }
</style>

</head>
<body>

<div class="header">
    Welcome to E-Shop
</div>

<div class="hero">
    <h1>Login Successful 🎉</h1>
    <p>Welcome to your shopping dashboard</p>
    <a class="btn" href="#">Start Shopping</a>
</div>

<div class="products">
    <div class="card">
        <div class="product-img"></div>
        <h3>Smartphone</h3>
        <p class="price">₹19,999</p>
        <a class="btn" href="#">Buy Now</a>
    </div>

    <div class="card">
        <div class="product-img"></div>
        <h3>Headphones</h3>
        <p class="price">₹2,499</p>
        <a class="btn" href="#">Buy Now</a>
    </div>

    <div class="card">
        <div class="product-img"></div>
        <h3>Smart Watch</h3>
        <p class="price">₹4,999</p>
        <a class="btn" href="#">Buy Now</a>
    </div>
</div>

</body>
</html>
