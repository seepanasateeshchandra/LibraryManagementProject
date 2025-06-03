<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String userName = (String)request.getAttribute("user");
   int id = (Integer)request.getAttribute("id");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title> Admin Dashboard - Library Management System</title>
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
        <h1>Library Management System - Admin Dashboard</h1>
    </div>

    <div class="nav">
        <a href="register.jsp">Add User</a>
        <a href="addBook.jsp">Add Book</a>
        <a href="ViewAllUsers">View All Users</a>
        <a href="ViewAllBooks">View All Books</a>
        <a href="Logout">Logout</a>
    </div>

    <div class="container">
        <h2>Welcome <%= userName %> </h2>
        <p>Use the navigation menu above to manage users and books.</p>
    </div>

    <div class="footer">
        &copy; 2025 Library Management System
    </div>

</body>
</html>
