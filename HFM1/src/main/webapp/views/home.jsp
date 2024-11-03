<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Handloom Fashion Marketplace</title>
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
            overflow-x: hidden;
        }

        /* Navbar styling */
        .navbar {
            background-color: #8C8B55; /* Soft Olive Green */
            padding: 1rem;
        }

        .navbar ul {
            list-style-type: none;
            display: flex;
            justify-content: flex-start;
        }

        .navbar ul li {
            margin-right: 20px;
        }

        .navbar ul li a {
            color: #FFF5E1; /* Warm Beige */
            text-decoration: none;
            font-weight: bold;
            padding: 8px 12px;
            transition: background-color 0.3s;
        }

        .navbar ul li a:hover {
            background-color: #D2691E; /* Terracotta for hover */
            border-radius: 5px;
        }

        /* Carousel styling */
        .carousel {
            overflow: hidden;
            width: 80%;
            height: 400px;
            margin: 2rem auto;
            position: relative;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
        }

        .carousel .slides {
            display: flex;
            transition: transform 0.5s ease-in-out;
            width: 325%;
        }

        .carousel img {
            width: 100%;
            height: 100%;
            object-fit: cover;
            border-radius: 10px;
        }

        .carousel .nav-btn {
            position: absolute;
            top: 50%;
            transform: translateY(-50%);
            background-color: rgba(0, 0, 0, 0.5);
            color: #FFD700; /* Golden Yellow for navigation buttons */
            border: none;
            font-size: 1.5rem;
            cursor: pointer;
            padding: 10px;
            border-radius: 50%;
            z-index: 1;
        }

        .carousel .prev {
            left: 10px;
        }

        .carousel .next {
            right: 10px;
        }

        /* Heading styling */
        .heading {
            text-align: center;
            margin: 2rem 0;
            font-size: 2.5rem;
            color: #D2691E; /* Terracotta */
            font-family: 'Georgia', serif;
            font-weight: bold;
        }

        /* Section styling */
        .section {
            display: flex;
            align-items: center;
            justify-content: center;
            margin: 2rem auto;
            width: 80%;
            opacity: 0;
            transform: translateY(50px);
            transition: opacity 1s ease, transform 1s ease;
        }

        .section.visible {
            opacity: 1;
            transform: translateY(0);
        }

        .section-content {
            flex: 1;
            padding: 1rem;
        }

        .section-content h2 {
            font-size: 1.8rem;
            color: #D2691E; /* Terracotta for subheadings */
        }

        .section-content p {
            font-size: 1rem;
            line-height: 1.6;
            color: #666; /* Light gray for text */
        }

        .section img {
            flex: 1;
            width: 100%;
            max-width: 300px;
            height: auto;
            border-radius: 10px;
            margin: 0 1rem;
            border: 2px solid #8C8B55; /* Soft Olive Green border for images */
        }

        /* Fade-in animations */
        .fade-in {
            animation: fadeInUp 1s ease forwards;
        }

        @keyframes fadeInUp {
            from {
                opacity: 0;
                transform: translateY(20px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }
    </style>
    <script>
        let index = 0;

        function showSlide(step) {
            const slides = document.querySelector('.carousel .slides');
            const totalSlides = slides.children.length;
            index = (index + step + totalSlides) % totalSlides;
            slides.style.transform = `translateX(${-index * (100 / totalSlides)}%)`;
        }

        document.addEventListener("DOMContentLoaded", function () {
            setInterval(() => showSlide(1), 3000);

            // Fade-in effect on scroll
            const sections = document.querySelectorAll('.section');
            const observer = new IntersectionObserver((entries) => {
                entries.forEach(entry => {
                    if (entry.isIntersecting) {
                        entry.target.classList.add('visible');
                    }
                });
            }, { threshold: 0.1 });

            sections.forEach(section => observer.observe(section));
        });
    </script>
</head>
<body>
    <!-- Navbar -->
    <div class="navbar">
        <ul>
            <li><a href="home">Home</a></li>
            <li><a href="contactus">Contact Us</a></li>
            <li><a href="login">Login</a></li>
        </ul>
    </div>

    <!-- Carousel -->
    <div class="carousel">
        <button class="nav-btn prev" onclick="showSlide(-1)">&#10094;</button>
        <div class="slides">
            <img src="views/images/1.jpg" alt="Handloom 1">
            <img src="views/images/2.jpg" alt="Handloom 2">
            <img src="views/images/3.jpg" alt="Handloom 3">
        </div>
        <button class="nav-btn next" onclick="showSlide(1)">&#10095;</button>
    </div>

    <!-- Heading -->
    <div class="heading">
        Handloom Fashion Marketplace
    </div>

    <!-- Content Sections with Alternating Layouts -->
    <div class="section fade-in">
        <div class="section-content">
            <h2>About Handloom Fashion</h2><br/>
            <p>Discover the beauty of handcrafted fabrics, each telling a story of tradition and skill. The Handloom Fashion Marketplace connects you with artisans, allowing you to explore unique patterns and designs that celebrate India’s rich textile heritage. Our platform bridges the gap between artisans and admirers of authentic handloom fabrics. When you buy from us, you empower local communities, sustain livelihoods, and promote fair trade. Every piece you purchase helps artisans continue their craft and pass down their knowledge to the next generation. Handloom fashion represents more than just clothing—it’s a way to preserve centuries-old traditions. Each fabric is crafted meticulously by artisans who pour their skill and dedication into every weave, creating pieces that are both exquisite and enduring. By choosing handloom, you're not just wearing fashion; you're embracing history, artistry, and sustainable craftsmanship.</p>
        </div>
        <img src="views/images/4.png" alt="Handloom fashion image">
    </div>

    <div class="section fade-in">
        <img src="views/images/5.jpg" alt="Handloom traditions image">
        <div class="section-content">
            <h2>Handloom Traditions in India</h2><br/>
            <p>Handloom weaving is a heritage that spans centuries, with each region in India having its own distinct techniques and styles. From the vibrant colors of Gujarat’s Bandhani to the intricate ikat of Odisha, discover the art that represents India’s cultural diversity. Handloom weaving is more than a craft—it’s a legacy passed down through generations, carrying with it the essence of India’s cultural soul. Each thread is woven with skill, precision, and a sense of pride, creating fabrics that are as timeless as the traditions they represent. In every piece, you’ll find the dedication of artisans who have spent years mastering their art, bringing to life designs that are both intricate and deeply symbolic. In a world of fast fashion, handloom weaving offers a sustainable alternative, crafted with care and minimal impact on the environment. By choosing handloom, you support eco-friendly fashion that values quality over quantity. These fabrics are often woven from natural fibers, dyed with organic colors, and created to last, making them a perfect choice for those who appreciate slow, mindful living.</p>
        </div>
    </div>
</body>
</html>
