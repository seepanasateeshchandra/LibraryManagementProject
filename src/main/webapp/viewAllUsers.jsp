<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.tap.model.User" %>

<%
    // Example list from servlet
    List<User> userList = (List<User>)request.getAttribute("userList");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Users Information</title>
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
                <th>UserName</th>
                <th>Password</th>
                <th>Role</th>
                <th>Actions</th>
                
            </tr>
        </thead>
        <tbody>
            <%
                if (userList != null && !userList.isEmpty()) {
                    for (User user : userList) {
            %>
            <tr>
                <td><%= user.getId() %></td>
                <td><%= user.getUserName() %></td>
                <td><%= user.getPassword() %></td>
                <td><%= user.getRole() %></td>
               
                <td>
                    <a class="action-btn edit-btn" href="EditUser.jsp?id=<%= user.getId() %>">Edit</a>
                    <a class="action-btn delete-btn" href="DeleteUser?id=<%= user.getId() %>" 
                       onclick="return confirm('Are you sure you want to delete this userInformation?');">Delete</a>
                </td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="6" style="text-align:center;">No Users found.</td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
</body>
</html>
