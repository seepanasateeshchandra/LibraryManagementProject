<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.tap.model.Book" %>

<%
    // Example list from servlet
    Book book = (Book) request.getAttribute("book");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Book Added Successfully</title>
    <style>
    
   
    
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to right, #d3cce3, #e9e4f0);
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        h1 {
            color: #4b0082;
            margin-bottom: 20px;
        }

        table {
            border-collapse: collapse;
            width: 70%;
            max-width: 600px;
            background-color: white;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            overflow: hidden;
        }

        th, td {
            padding: 15px 20px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #6a5acd;
            color: white;
        }

        tr:last-child td {
            border-bottom: none;
        }

        a {
            margin-top: 20px;
            text-decoration: none;
            color: #4b0082;
            font-weight: bold;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

    <h1>Book Added Successfully</h1>

    <table>
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        <tr>
            <td>Id</td>
            <td><%= book.getId() %></td>
        </tr>
        <tr>
            <td>Title</td>
            <td><%= book.getTitle() %></td>
        </tr>
        
        <tr>
            <td>Author</td>
            <td><%= book.getAuthor() %></td>
        </tr>
        <tr>
            <td>Category</td>
            <td><%= book.getCategory() %></td>
        </tr>
        <tr>
            <td>Available</td>
            <td><%= book.isAvailable() %></td>
        </tr>
    </table>

    <a href="userDashboard.jsp">Back to Home</a>

</body>
</html>
