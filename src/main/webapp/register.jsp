<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register - Student Management System</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to right, #36d1dc, #5b86e5);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .form-container {
            background-color: white;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
            width: 350px;
            text-align: center;
        }

        .form-container h2 {
            margin-bottom: 25px;
            color: #5b86e5;
        }

        form {
            display: flex;
            flex-direction: column;
            align-items: stretch;
        }

        label {
            text-align: left;
            margin: 5px 0 3px;
            font-weight: bold;
            color: #333;
        }

        input[type="number"],
        input[type="text"],
        input[type="password"],
        select {
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            transition: border-color 0.3s;
        }

        input:focus, select:focus {
            border-color: #5b86e5;
            outline: none;
        }

        input[type="submit"] {
            padding: 10px;
            background-color: #5b86e5;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #4472c4;
        }

        p {
            margin-top: 15px;
            font-size: 14px;
        }

        a {
            color: #5b86e5;
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
        <h2>Register</h2>
        <form action="RegisterServlet" method="post">
            <label for="id">Id:</label>
            <input type="number" id="id" name="id" required>

            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <label for="role">Role:</label>
            <select id="role" name="role" required>
                <option value="student">Student</option>
                <option value="admin">Admin</option>
            </select>

            <input type="submit" value="Register">
        </form>
        <p>Already have an account? <a href="login.jsp">Login here</a></p>
    </div>
</body>
</html>
