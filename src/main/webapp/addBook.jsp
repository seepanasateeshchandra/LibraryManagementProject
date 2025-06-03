<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.tap.model.Book" %>

<%

   String userName = (String)request.getAttribute("username");
   Integer id = (Integer)request.getAttribute("id");
   
   session.setAttribute("username", userName);
   session.setAttribute("id", id);
%>




<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add New Book</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to right, #fbd3e9, #bb377d);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .form-container {
            background-color: #ffffff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
            width: 400px;
        }

        h1 {
            text-align: center;
            margin-bottom: 25px;
            color: #bb377d;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        label {
            margin: 10px 0 5px;
            font-weight: bold;
            color: #333;
        }

        input[type="text"],
        input[type="number"],
        input[type="date"]
         {
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            transition: border-color 0.3s ease;
        }

        input:focus {
            border-color: #bb377d;
            outline: none;
        }

        input[type="submit"] {
            padding: 12px;
            background-color: #bb377d;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #9d2b64;
        }

        a {
            display: block;
            text-align: center;
            margin-top: 20px;
            color: #bb377d;
            text-decoration: none;
            font-weight: bold;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>Add New Book</h1>
        <form action="AddBookServlet" method="post">
            <label for="id">Id:</label>
            <input type="number" id="id" name="id" required>

            <label for="title">Title:</label>
            <input type="text" id="title" name="title" required>

            <label for="author">Author:</label>
            <input type="text" id="author" name="author">

            <label for="category">Category:</label>
            <input type="text" id="category" name="category">

            <label for="is_available">Available:</label>
            <input type="text" id="is_available" name="is_available">
            
             <label for="borrow_date">BorrowDate:</label>
            <input type="date" id="borrow_date" name="borrow_date">
   
            
            <label for="return_date">ReturnDate:</label>
            <input type="date" id="return_date" name="return_date">
            
            
            <label for="bookCost">BookCost:</label>
            <input type="number" id="book_cost" name="book_cost">
            
            <label for="TotalFine">TotalFine:</label>
            <input type="number" id="total_fine" name="total_fine">

            <input type="submit" value="Add Book">
        </form>
        <a href="userDashboard.jsp">Back to Home</a>
    </div>
</body>
</html>
