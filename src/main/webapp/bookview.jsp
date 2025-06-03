<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Library Management Home</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f6f8;
            margin: 0;
            padding: 0;
        }

        .header {
            background-color: #2c3e50;
            color: white;
            padding: 20px;
            text-align: center;
        }

        .nav {
            display: flex;
            justify-content: center;
            background-color: #34495e;
        }

        .nav a {
            color: white;
            padding: 14px 20px;
            text-decoration: none;
            text-align: center;
            font-weight: bold;
        }

        .nav a:hover {
            background-color: #1abc9c;
            color: white;
        }

        .container {
            padding: 30px;
            text-align: center;
        }

        .container h2 {
            color: #2c3e50;
            margin-bottom: 20px;
        }

        .container p {
            color: #7f8c8d;
            font-size: 18px;
        }

        .footer {
            background-color: #2c3e50;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body>

    <div class="header">
        <h1>Library Management System</h1>
    </div>

    <div class="nav">
        <a href="list">View All Books</a>
        <a href="new">Add Book</a>
        <a href="delete">Delete Book</a>
        <a href="edit">Update Book</a>
    </div>

    <div class="container">
        <h2>Welcome to the Library Management Dashboard</h2>
        <p>Use the navigation menu above to manage your book collection.</p>
    </div>

    <div class="footer">
        &copy; 2025 Library Management System
    </div>

</body>
</html>
