<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login - Handloom Fashion Marketplace</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" integrity="sha384-k6RqeWeci5ZR/Lv4MR0sA0FfDOMS/ZtjZzTTm7i9YJcErZCxUnc5aKmV5a/Zft8m" crossorigin="anonymous">
    <style>
        /* Basic reset */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background-color: #FFF5E1; /* Warm Beige */
            color: #333333; /* Charcoal Gray */
            display: flex;
            height: 100vh;
            overflow: hidden;
        }

        /* Left image styling */
        .left {
            flex: 1;
            background-image: url('views/images/9.jpg'); /* Replace with your image path */
            background-size: cover;
            background-position: center;
        }

        /* Right form styling */
        .right {
            flex: 1;
            background-color: #8C8B55; /* Soft Olive Green */
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .login-form {
            background-color: #FFF5E1; /* Warm Beige */
            padding: 2rem;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
            width: 90%;
            max-width: 400px;
        }

        .login-form h2 {
            color: #D2691E; /* Terracotta */
            margin-bottom: 1rem;
            text-align: center;
        }

        .login-form label {
            margin: 0.5rem 0;
            display: block;
            font-weight: bold;
        }

        .login-form input[type="text"],
        .login-form input[type="password"] {
            width: 100%;
            padding: 0.5rem;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 1rem;
        }

        .login-form input[type="submit"] {
            background-color: #D2691E; /* Terracotta */
            color: #FFF5E1; /* Warm Beige */
            border: none;
            padding: 0.75rem;
            border-radius: 5px;
            cursor: pointer;
            font-weight: bold;
            transition: background-color 0.3s;
            width: 100%;
        }

        .login-form input[type="submit"]:hover {
            background-color: #C05020; /* Darker Terracotta for hover */
        }

        .login-form p {
            text-align: center;
            margin-top: 1rem;
            font-size: 0.9rem;
        }

        .login-form p a {
            color: #D2691E; /* Terracotta */
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="left"></div>
    <div class="right">
        <form class="login-form" action="loginServlet" method="post">
            <h2>Login</h2>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            <input type="submit" value="Login">
            <p>Don't have an account? <a href="register.jsp">Register here</a></p>
        </form>
    </div>
</body>
</html>
