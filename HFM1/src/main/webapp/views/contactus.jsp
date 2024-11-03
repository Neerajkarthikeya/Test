<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contact Us - Handloom Fashion Marketplace</title>
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
            align-items: center;
            justify-content: center;
            height: 100vh;
            overflow: hidden;
        }

        /* Contact form styling */
        .contact-form {
            background-color: #8C8B55; /* Soft Olive Green */
            padding: 2rem;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
            width: 90%;
            max-width: 400px;
        }

        .contact-form h2 {
            color: #D2691E; /* Terracotta */
            margin-bottom: 1rem;
            text-align: center;
        }

        .contact-form label {
            margin: 0.5rem 0;
            display: block;
            font-weight: bold;
        }

        .contact-form input[type="text"],
        .contact-form input[type="email"],
        .contact-form textarea {
            width: 100%;
            padding: 0.5rem;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 1rem;
        }

        .contact-form input[type="submit"] {
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

        .contact-form input[type="submit"]:hover {
            background-color: #C05020; /* Darker Terracotta for hover */
        }

        .contact-form p {
            text-align: center;
            margin-top: 1rem;
            font-size: 0.9rem;
        }

        .contact-form p a {
            color: #D2691E; /* Terracotta */
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <!-- Contact Form -->
    <div class="contact-form">
        <form action="contactServlet" method="post">
            <h2>Contact Us</h2>
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
            <label for="subject">Subject:</label>
            <input type="text" id="subject" name="subject" required>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            <label for="description">Description:</label>
            <textarea id="description" name="description" rows="4" required></textarea>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
