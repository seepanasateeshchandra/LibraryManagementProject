<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="java.sql.*, java.util.*" %>


<html>
<head>
    <title>Book Borrowing Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 50%;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #333;
        }
        table {
            width: 100%;
            margin: 20px 0;
            border-collapse: collapse;
        }
        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        td {
            background-color: #f9f9f9;
        }
        input[type="text"], input[type="date"], select {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        .message {
            text-align: center;
            margin-top: 20px;
            font-size: 16px;
            color: #d9534f;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Borrow a Book</h2>
        <form action="BookTranscationServlet" method="post">
            <table>
            <tr>
                    <th><label for="id">Transcation_ID:</label></th>
                    <td><input type="number" id="id" name="id" required></td>
                </tr>
                <tr>
                    <th><label for="user_id">User ID:</label></th>
                    <td><input type="number" id="user_id" name="user_id" required></td>
                </tr>
                <tr>
                    <th><label for="book_id">Book ID:</label></th>
                    <td><input type="number" id="book_id" name="book_id" required></td>
                </tr>
                <tr>
                    <th><label for="borrow_date">Borrow Date:</label></th>
                    <td><input type="date" id="borrow_date" name="borrow_date" required></td>
                </tr>
                <tr>
                    <th><label for="return_date">Return Date:</label></th>
                    <td><input type="date" id="return_date" name="return_date" required></td>
                </tr>
            </table>
            <input type="submit" value="Borrow Book">
        </form>
        <c:if test="${not empty message}">
            <div class="message">${message}</div>
        </c:if>
    </div>
</body>
</html>
