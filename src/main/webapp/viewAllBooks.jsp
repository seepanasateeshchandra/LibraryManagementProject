<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.tap.model.Book" %>
<%@ page import="java.util.*, com.tap.model.User" %>
<%
    // Example list from servlet
    List<Book> bookList = (List<Book>) request.getAttribute("bookList");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Books</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f2f6fc;
            padding: 40px;
        }

        h1 {
            text-align: center;
            color: #2c3e50;
            margin-bottom: 30px;
        }

        table {
            width: 90%;
            margin: 0 auto;
            border-collapse: collapse;
            background-color: #ffffff;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        }

        th, td {
            padding: 12px 18px;
            border: 1px solid #dfe6e9;
            text-align: left;
        }

        th {
            background-color: #2980b9;
            color: #ffffff;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        .action-btn {
            padding: 6px 12px;
            margin: 0 3px;
            color: #fff;
            text-decoration: none;
            border-radius: 4px;
            font-size: 0.9rem;
        }

        .edit-btn {
            background-color: #27ae60;
        }

        .delete-btn {
            background-color: #c0392b;
        }
    </style>
</head>
<body>
    <h1>All Books</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Category</th>
                <th>Available</th>
                <th>Actions</th>
                
            </tr>
        </thead>
        <tbody>
            <%
                if (bookList != null && !bookList.isEmpty()) {
                    for (Book book : bookList) {
            %>
            <tr>
                <td><%= book.getId() %></td>
                <td><%= book.getTitle() %></td>
                <td><%= book.getAuthor() %></td>
                <td><%= book.getCategory() %></td>
                <td><%= book.isAvailable() %></td>
                <td>
                    <a class="action-btn edit-btn" href="EditBook.jsp?id=<%= book.getId() %>">Edit</a>
                    <a class="action-btn delete-btn" href="DeleteBook?id=<%= book.getId() %>" 
                       onclick="return confirm('Are you sure you want to delete this book?');">Delete</a>
                </td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="6" style="text-align:center;">No books found.</td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
</body>
</html>
