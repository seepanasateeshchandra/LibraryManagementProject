<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Library Management System</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
        }

        .header-top {
            background-color: purple;
            color: white;
            padding: 10px;
            font-size: 14px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .header-top span {
            margin: 0 20px;
        }

        .navbar {
            background-color: #ffffff;
            padding: 15px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            border-bottom: 1px solid #eee;
        }

        .navbar h1 {
            margin: 0;
            color: teal;
        }

        .navbar nav a {
            margin: 0 10px;
            text-decoration: none;
            color: #333;
            font-weight: bold;
        }

        .navbar .login-buttons button {
            margin-left: 10px;
            padding: 8px 16px;
            border: none;
            color: white;
            background-color: #17a2b8;
            cursor: pointer;
            border-radius: 4px;
        }

        .main-section {
            background: url('library-bg.png') no-repeat center center;
            background-size: cover;
            height: 400px;
            position: relative;
            text-align: center;
            color: #333;
        }

        .main-section::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: rgba(255,255,255,0.9);
        }

        .main-text {
            position: relative;
            padding-top: 100px;
            z-index: 2;
        }

        .main-text h2 {
            font-size: 36px;
            margin-bottom: 10px;
        }

        .main-text p {
            font-size: 18px;
            margin-bottom: 20px;
        }

        .main-text button {
            padding: 10px 20px;
            background-color: #20c997;
            border: none;
            color: white;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
        }

        .section {
     padding: 60px 80px;
     background-image: url('your-image.jpg');
     background-repeat: no-repeat;
     background-position: center center;
     background-size: cover;
     background-color: #2c3e50; /* fallback color if image fails */
     color: #fff;
    }
        

        .section h2 {
            font-size: 32px;
            margin-bottom: 20px;
            border-bottom: 2px solid #eee;
            padding-bottom: 10px;
        }

        .section p {
            font-size: 18px;
            line-height: 1.6;
        }

        .contact-section {
            background-color: #2c3e50;
            padding: 60px 80px;
            color: #fff;
        }

        .contact-section h2 {
            font-size: 30px;
            margin-bottom: 15px;
        }

        .contact-section p {
            font-size: 18px;
            line-height: 1.6;
        }
    </style>
</head>
<body>

    <div class="header-top">
        <span>📅 Monday - Saturday, 8AM to 10PM</span>
        <span>📞 Call us now +91 - 6305336569</span>
    </div>

    <div class="navbar">
        <h1>LIBRARY MANAGEMENT SYSTEM</h1>
        <nav>
            <a href="#home">HOME</a>
            <a href="#about">ABOUT</a>
            <a href="#contact">CONTACT</a>
        </nav>
        <div class="login-buttons">
            <button onclick="location.href='login.jsp'">Student Login</button>
            <button onclick="location.href='login.jsp'">Admin Login</button>
        </div>
    </div>

    <div class="main-section" id="home">
        <div class="main-text">
            <h2>Library Management System</h2>
            <p>"Freedom to read, hear, view, think ® your library."</p>
            <button onclick="location.href='register.jsp'">Get Started</button>
        </div>
    </div>

    <div class="section" id="about">
        <h2>About Our Library</h2>
        <p>
            Our Library Management System is a modern solution designed to digitize and simplify the traditional library experience. It allows users to search, borrow, return, and manage books efficiently. 
            With real-time tracking and role-based access (admin & student), our system ensures transparency, quick operations, and a user-friendly interface.
            <br><br>
            Our goal is to support knowledge and literacy by providing seamless access to educational resources.
        </p>
    </div>

    <div class="contact-section" id="contact">
        <h2>Contact Us</h2>
        <p>
            📍 Address: Knowledge Lane, Tech City, India<br>
            📧 Email: seepanasateesh2002@libraryms.edu.in<br>
            ☎ Phone: +91-1234567890<br>
            🕒 Working Hours: Monday - Saturday, 8AM to 10PM
        </p>
    </div>

</body>
</html>
