<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Return Book</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 40px;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        form {
            text-align: center;
            margin-bottom: 30px;
        }
        input[type="text"], input[type="submit"] {
            padding: 10px;
            margin: 10px;
            font-size: 16px;
        }
       
    </style>
</head>
<body>
    <h2>Return Book Form</h2>

    <form method="post" action="ReturnBook">
        <input type="text" name="bookId" placeholder="Enter Book ID" required>
        <input type="text" name="bookName" placeholder="Enter Book Name" required>
        <input type="submit" value="Return Book">
    </form>

   
</body>
</html>
