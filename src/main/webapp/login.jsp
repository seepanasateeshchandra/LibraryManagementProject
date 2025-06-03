<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Login</title>
  <style>
    body {
      margin: 0;
      padding: 0;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: linear-gradient(to right, #00c6ff, #0072ff);
      height: 100vh;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    .container {
      background-color: white;
      padding: 40px;
      border-radius: 10px;
      box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
      width: 350px;
      text-align: center;
    }

    .container h1 {
      margin-bottom: 30px;
      color: #0072ff;
    }

    form {
      display: flex;
      flex-direction: column;
    }

    label {
      text-align: left;
      margin-bottom: 5px;
      font-weight: bold;
      color: #333;
    }

    input[type="text"],
    input[type="password"] {
      padding: 10px;
      margin-bottom: 20px;
      border: 1px solid #ccc;
      border-radius: 5px;
      transition: border-color 0.3s;
    }

    input[type="text"]:focus,
    input[type="password"]:focus {
      border-color: #0072ff;
      outline: none;
    }

    button[type="submit"] {
      padding: 10px;
      background-color: #0072ff;
      color: white;
      border: none;
      border-radius: 5px;
      font-size: 16px;
      cursor: pointer;
      transition: background-color 0.3s ease;
    }

    button[type="submit"]:hover {
      background-color: #005ec2;
    }

    p {
      margin-top: 15px;
      font-size: 14px;
    }

    a {
      color: #0072ff;
      text-decoration: none;
      font-weight: bold;
    }

    a:hover {
      text-decoration: underline;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>Library Management System</h1>
    <form action="Loginservlet" method="post">
      <label for="username">Username:</label>
      <input type="text" id="username" name="username" required>
      
      <label for="password">Password:</label>
      <input type="password" id="password" name="password" required>
      
      <button type="submit">Login</button>
    </form>
    <p>New user? <a href="register.jsp">Register here</a></p>
  </div>
</body>
</html>
