<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.tap.model.Book" %>
<% String userName = (String)request.getAttribute("user");
   int id = (Integer)request.getAttribute("id");
%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Dashboard - Library Management System</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #ecf0f1;
            margin: 0;
            padding: 0;
        }

        .header {
            background-color: #2980b9;
            color: white;
            padding: 20px;
            text-align: center;
        }

        .nav {
            display: flex;
            justify-content: center;
            background-color: #3498db;
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
            background-color: #2980b9;
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
        <h1>Welcome <%= userName %></h1>
    </div>

    <div class="nav">
        <a href="ViewAllBooks">View Books</a>
        <a href="addBook.jsp">Borrow Book</a>
        <a href="returnBook.jsp">Return Book</a>
        <a href="AllYourBookTransactions">AllYourBookTransaction</a>
        <a href="Logout">Logout</a>
    </div>

    <div class="container">
        <h2>User Dashboard</h2>
        <p>Use the navigation menu above to manage your book activities.</p>
    </div>

    <div class="footer">
        &copy; 2025 Library Management System
    </div>

</body>
</html>
